import java.io.*;

class WordCouns{
  public static void main (String[] args) {
    int x=1,k=1;
    String s="ehfksj kjsfj s jesflkjsefjs ls jflsf sf";
   
      for (x=1;x<s.length();x++){
        if (s.charAt(x)==' '){k++;
          if (s.charAt(x+1)==' '){k--;
      
        }
      }
      }
    System.out.println(k);

}
    
}
