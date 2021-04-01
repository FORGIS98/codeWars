public class StopgninnipSMysdroW{
  public static void main(String [] args){
    System.out.println(fun("Patata") + "\n");
    System.out.println(fun("tapa") + "\n");
    System.out.println(fun("Hey fellow warriors") + "\n");
    System.out.println(fun("This is a test") + "\n");
    System.out.println(fun("This is another test") + "\n");
  }

  public static String fun(String str){
    String [] wList = str.split(" ");
    String res = "";

    for(String word: wList){
      if(word.length() >= 5){
        res += reverse(word);
      }
      else{
        res += word;
      }
      res += " ";
    }

    return res.strip();
  }

  public static String reverse(String word){
    String reversed = "";
    for(int i = (word.length() - 1); i >= 0; i--){
      reversed += word.charAt(i);
    }

    return reversed;
  }
}
