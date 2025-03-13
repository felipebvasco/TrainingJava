import java.util.Scanner;
class Ex10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float b, h, p, a;
        System.out.print("Base: ");
        b = scan.nextFloat();
        System.out.print("Altura: ");
        h = scan.nextFloat();
        p = (2 * b) + (2 * h);
        a =  (b * h);
        String str = String.format("O perímetro do retângulo é de %.2f cm enquanto sua área mede %.2f cm²", p, a);
        System.out.println(str);
        
    }
}