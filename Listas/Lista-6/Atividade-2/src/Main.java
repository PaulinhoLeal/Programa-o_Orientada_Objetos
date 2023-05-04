import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();

        Scanner read = new Scanner(System.in);


        System.out.println("De qual forma deseja obter a área?"+"\n"+"1--Triângulo\t\t"+"2--Quadrado");
        int escolhaDaForma = read.nextInt();
        if (escolhaDaForma==1)
        {
            System.out.println("Digite a base do triangulo:");
            double b = read.nextDouble();
            System.out.println("Digite a altura do triangulo:");
            double h = read.nextDouble();
            System.out.println("A Area do triângulo é: "+triangulo.calcularArea(b, h));
        }
        else if(escolhaDaForma==2)
        {
            System.out.println("Digite a base do quadrado:");
            double b = read.nextDouble();
            System.out.println("Digite a altura do quadrado:");
            double h = read.nextDouble();
            System.out.println("Area do quadrado:"+quadrado.calcularArea(b,h));
        }





    }
}