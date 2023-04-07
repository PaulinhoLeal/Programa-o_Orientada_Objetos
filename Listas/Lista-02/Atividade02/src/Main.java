import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Read = new Scanner(System.in);

        int contador = 0;
        int numeroHabitantes=3;
        int mediaFilho;
        int somaFilho = 0;
        double maiorSalario = 0;
        double mediaSalarial;
        double somaSalario =0;

        while(contador < numeroHabitantes)
        {
            System.out.println("Digite seu salário:");
            double salario = Read.nextDouble();
            System.out.println("Quantos filhos você tem?");
            int numeroFilhos = Read.nextInt();

            if (salario>maiorSalario)
            {
                maiorSalario=salario;
            }
            somaSalario = somaSalario+salario;

            somaFilho = numeroFilhos + somaFilho;

            contador++;

        }
        mediaSalarial = somaSalario/numeroHabitantes;
        mediaFilho = somaFilho/numeroHabitantes;
        System.out.println("A média salarial é de :"+mediaSalarial);
        System.out.println("A média de filhos por habitante é de: "+mediaFilho);
        System.out.println("O maior salário é de: "+maiorSalario);






    }
}