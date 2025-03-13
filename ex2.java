import java.util.Scanner;
class ex2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y, sum;
        System.out.println("primeiro número: ");
        x = scan.nextInt();
        System.out.println("segundo número: ");
        y = scan.nextInt();
        sum = x + y;
        System.out.println("Calculando...\nO resultado da soma é " + sum);
    }
}