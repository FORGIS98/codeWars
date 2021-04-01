public class FunWithTreesIsPerfect{
    public static void main (String [] args){
        TreeNode raiz = new TreeNode(0);

        generarArbol(raiz, 10);
        generarArbol(raiz, 5);
        generarArbol(raiz, 15);

        System.out.println("Are you perfect? " + isPerfect(raiz));
    }

    // So, a perfect binary tree fulfill the equation 2^(n+1)-1 = number of nodes
    public static boolean isPerfect(TreeNode node){
        if(node == null)
            return true;

        int x = howDeep(node, 0);
        int y = howManyNodes(node, 0);
        return (int)(Math.pow(2, x)-1) == ++ y;
    }

    public static int howDeep(TreeNode node, int count){
        if(node == null)
            return 0;
        count += 1;
        return count + Math.max(howDeep(node.left, 0), howDeep(node.right, 0));
    }

    public static int howManyNodes(TreeNode node, int count){
        if(node.left == null && node.right == null){
            return 1;
        }
        if(node.left != null)
            count += howManyNodes(node.left, count);
        if(node.right != null)
            count += howManyNodes(node.right, count);

        return count;
    }

    public static void generarArbol(TreeNode node, int n){
        if(node.value == 0){
            node.value = n;
        }else{
            if(n <= node.value){
                if(node.left == null)
                    node.setLeftTree(new TreeNode(n));
                else
                    generarArbol(node.left, n);
            }else{
                if(node.right == null)
                    node.setRightTree(new TreeNode(n));
                else
                    generarArbol(node.right, n);
            }
        }
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

}
