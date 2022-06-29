import java.util.Scanner;

public class VowelCount {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      String text = scan.next();
      int contador = 0;
      
      for(int i = 0; i < text.length(); i++){
          char charTest = text.charAt(i);
          if(charTest == 'a' || charTest == 'e' || charTest == 'i' || charTest == 'o' || charTest == 'u'){
              contador++;
          }
      }
      System.out.println(contador);
    }
}