import java.util.Scanner; 
class ex3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y, d;
        System.out.println("Divisor: ");
        x = scan.nextInt();
        System.out.println("Dividendo: ");
        y = scan.nextInt();
        d = x / y;
        System.out.println("O resultado de divisão é: " + d);
    }

}