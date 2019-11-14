import java.lang.Integer;
import java.util.ArrayList;

/*** SO, this is how you sould do it. ***/

class Solution {
    static int maxSum(TreeNode root) {
        if (root == null) {
          return 0;
        }
        return root.value + Math.max(maxSum(root.left), maxSum(root.right));
    }
}

/*** And this is how you should NEVER do it. ***/
//   And yes...that's my lovely code...

public class FunWithTreesMaxSum{
    public static void main (String [] args){
        TreeNode raiz = new TreeNode(0);
        ArrayList<Integer> arr = new ArrayList<>();

        generarArbol(raiz, 10);
        generarArbol(raiz, 5);
        generarArbol(raiz, 15);
        generarArbol(raiz, 50);
        generarArbol(raiz, 150);
        generarArbol(raiz, 1);
        generarArbol(raiz, 6);
        generarArbol(raiz, 12);
        generarArbol(raiz, 18);
        generarArbol(raiz, 95);

        imprimirNodos(raiz);
        System.out.println("\n");
        arr = maxPath(0, raiz, arr);
        int max = 0;
        for(int i = 0; i < arr.size() && arr != null; i++){
            if(max <= arr.get(i))
                max = arr.get(i);
        }
        System.out.println("\n");
        System.out.println("PATH :: " + max);
    }

    public static void generarArbol(TreeNode node, int n){
        if(node.value == 0){
            node.value = n;
        }else{
            if(n <= node.value){
                if(node.getLeftTree() == null)
                    node.setLeftTree(new TreeNode(n));
                else
                    generarArbol(node.getLeftTree(), n);
            }else{
                if(node.getRightTree() == null)
                    node.setRightTree(new TreeNode(n));
                else
                    generarArbol(node.getRightTree(), n);
            }
        }
    }

    public static void imprimirNodos(TreeNode node){
        if(node != null){
            System.out.print(node.value + " - ");
            imprimirNodos(node.getLeftTree());
            imprimirNodos(node.getRightTree());
        }
    }

    public static ArrayList<Integer> maxPath(int max, TreeNode node, ArrayList<Integer> arr){
        if(node == null)
            return null;
        boolean added = false;
        if(node.getLeftTree() == null && node.getRightTree() == null){
            max += node.value;
            arr.add(max);
            System.out.println("Añadido max :: " + max);
        }
        if(node.getLeftTree() != null){
            max += node.value;
            added = true;
            arr = maxPath(max, node.getLeftTree(), arr);
        }
        if(node.getRightTree() != null){
            if(!added)
                max += node.value;
            arr = maxPath(max, node.getRightTree(), arr);
        }
        return arr;
    }
}

class TreeNode{

    public TreeNode left;
    public TreeNode right;
    public int value;

    public TreeNode(int x){
        this.value = x;
    }

    public void setLeftTree(TreeNode node){
        this.left = node;
    }

    public void setRightTree(TreeNode node){
        this.right = node;
    }

    public TreeNode getLeftTree(){
        return this.left;
    }

    public TreeNode getRightTree(){
        return this.right;
    }

}
