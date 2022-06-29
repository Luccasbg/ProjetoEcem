import java.util.Scanner;

public class IdadeFuncionarios {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int[] ages = new int[10];
      int contador = 0;
      
      for(int i = 0; i < ages.length; i++){
          ages[i] = scan.nextInt();
          if(ages[i] > 25){
              contador++;
          }
      }
      System.out.println(contador + " funcionários possuem mais de 25 anos.");
    }
}