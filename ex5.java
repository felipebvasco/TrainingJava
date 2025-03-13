import java.util.Scanner;
class ex5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x, y;
        System.out.println("Insira o primeiro número:");
        x = scan.nextFloat();
        System.out.println("Insira o segundo número:");
        y = scan.nextFloat();
        System.out.println("Soma: " + (x + y) + "\nsubtração: " + (x - y) + "\nMultiplicação: " + (x * y) + "\nDivisão: " + (x / y) + "\nmódulo: " + (x % y));

    }
}