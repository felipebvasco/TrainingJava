import java.util.Scanner;
class ex4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x, y, m;
        System.out.println("Primeiro número da multiplicação");
        x = scan.nextFloat();
        System.out.println("Segundo número da multiplicação");
        y = scan.nextFloat();
        m = x * y;
        System.out.println("Resultado = " + m);
    }
}