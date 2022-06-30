import java.util.Scanner;

public class Multiples {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      int soma = 0;
      
      for(int i = 1; i < n; i++){
          if(i % 3 == 0 || i % 5 == 0){
              soma = soma + i;
          }
      }
      System.out.println(soma);
    }
}