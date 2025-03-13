import java.util.Scanner;
class ex6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Insira um número para descobrir sua tabuada");
        x = scan.nextInt();
        System.out.println("Tabuada do " + x);
        for (int i = 1; i <= 10; i++){
            System.out.println(x + " x " + i + " = " + (x * i));
        }

    }
}