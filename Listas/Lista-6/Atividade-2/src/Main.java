import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

        Scanner read = new Scanner(System.in);
        double b = read.nextDouble();
        double h = read.nextDouble();
        System.out.println("A Area do triângulo é: "+triangulo.calcularArea(b, h));

    }
}