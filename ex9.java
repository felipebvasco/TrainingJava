import java.util.Scanner;
class ex9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x, y, z, m;
        System.out.println("primeiro número: ");
        x = scan.nextDouble();
        System.out.println("segundo número: ");
        y = scan.nextDouble();
        System.out.println("Terceiro número: ");
        z = scan.nextDouble();
        m = (x + y + z)/3;
        String formatada = String.format("A média dos valores é %.2f", m);
        System.out.println(formatada); 
    }
}