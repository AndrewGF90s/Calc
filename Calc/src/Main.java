import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("\t\t\t Добро пожаловать в конвентер градусов из Сel в Far");
        System.out.println("Пожалуйста введите температуру с Cel");
        double celsii = new Scanner(System.in).nextDouble();
       double far = ( 32 + celsii * 1.8 );
              System.out.println( "\t" + celsii + " градуса по Cel =  в Far: " + far);

   /*   System.out.println("\t\t\t Добро пожаловать в программу по конвертацмии валюты из USD и EURO в Рубли ");
       System.out.println("Пожалуйста введите сумму валюту в рублях.");
       double rur = new Scanner(System.in).nextDouble();
        double dollar = rur / 101;
       double euro = rur / 107.80;

        System.out.println(" Сумма " + rur +"р = "+ dollar + " USD");
      System.out.println(" Сумма " + rur +"р = "+ euro + " EURO");

    */
   }
}
