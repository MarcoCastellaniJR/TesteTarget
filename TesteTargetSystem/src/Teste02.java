import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        //Sequencia de Fibocanii
        System.out.println("Digite o valor que você gostaria de ver se ele está na sequencia de Fibonacci: ");

        Scanner scan = new Scanner(System.in);
        int nmrValidar;
        nmrValidar = scan.nextInt();
        System.out.println(nmrValidar);
        int n1 = 0, n2 = 1,contador = 0;
        int fibonacciNumber = 0;
        while(fibonacciNumber < nmrValidar){
            fibonacciNumber = n1 + n2;
            System.out.println("nmrFibonacci " + fibonacciNumber);
            n1 = n2;
            n2 = fibonacciNumber;
            contador ++;
        }
        System.out.println("O número que foi informado é"+ nmrValidar);
        if (nmrValidar == fibonacciNumber){
            System.out.println("O número que você informou está na sequencia de fibonacci");
        } else {
            System.out.println("O numero que você informou não está na sequencia");
            System.out.println("Ele está entre o termo " + (contador-1) +" e o termo " + contador);
        }



    }
}