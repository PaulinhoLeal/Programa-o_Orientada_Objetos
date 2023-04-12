import java.util.Scanner;

public class Main
{
    public static String Categoria(int idade)
    {
        if(idade >4 && idade <8)
        {
            return "Infantil A";
        }
        else if (idade >7 && idade <11)
        {
            return "Infantil B";
        }
        else if (idade >10 && idade <14)
        {
            return "Juvenil A";
        }
        else if (idade >13 && idade <18)
        {
            return "Juvenil B";
        }
        else
        {
            return "Adulto";
        }

    }
    public static void main(String[] args)
    {
        System.out.print("Digite sua idade:");
        Scanner Read = new Scanner(System.in);
        int idade = Read.nextInt();
        System.out.println(Categoria(idade));


    }
}