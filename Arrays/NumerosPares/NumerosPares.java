import java.util.Scanner;

public class NumerosPares {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int[] numbers = new int[5];
      int testNumber = 0;
      
      for(int i = 0; i < numbers.length; i++){
          testNumber = scan.nextInt();
          if(testNumber % 2 != 0){
              System.out.println(testNumber + " não pode ser salvo! Trata-se de um número ímpar.");
              continue;
            }
            numbers[i] = testNumber;
            System.out.println("O número " + numbers[i] + " foi salvo com sucesso!");
        }  
    }
}
