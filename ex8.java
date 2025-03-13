import java.util.Scanner;
class ex8{
    public static void main(String[] args){    
        Scanner scan = new Scanner(System.in);
        Double r, c, a;
        System.out.println("Insira o raio do seu Círculo");
        r = scan.nextDouble();
        c = 2 * Math.PI * r;
        a = Math.PI * r * r;
        String formatada = String.format("Circunferência: %.2f\nÁrea: %.2f", c, a);
        System.out.println(formatada);
    }

}