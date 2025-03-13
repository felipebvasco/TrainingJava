import java.util.Scanner;
class EX11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float alt, peso, imc;
        System.out.print("Altura em metros: ");
        alt = scan.nextFloat();
        System.out.print("Peso em Kg: ");
        peso = scan.nextFloat();
        imc = peso / (alt * alt);
        String str = String.format("\nSeu IMC é de: %.1f", imc);
        if ((imc > 0) && (imc < 18.5)) {
            System.out.println(str + "\nVocê está abaixo do peso");
        }
        else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println(str + "\nVocê está com um peso normal");
        }
        else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.println(str + "\nVocê está com excesso de peso");
        }
        else if ((imc >= 30) && (imc <= 35)) {
            System.out.println(str + "\n Você está com obesidade");
        }
        else {
            System.out.println(str + "\n Você está com obesidade extrema");
        }

    }
}