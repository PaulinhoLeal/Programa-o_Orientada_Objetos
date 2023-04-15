import java.lang.reflect.Array;
import java.util.ArrayList;

public class Heroi {

    String nome;
    int força;
    int vida;
   ArrayList<Arma>armas;
   String classe;

   public Heroi(String classe, int força, int vida)
   {
       this.classe = classe;
       this.vida = vida;
       this.força = força;
   }
   public String getClasse(String classe)
   {
       return "A classe do seu heroi é: "+this.classe;
   }
   public void setClasse(String classe)
   {
       this.classe = classe;
   }
   public int getForça()
   {
       return this.força ;
   }
   public Heroi(){
       Arma armaPadrao = new Arma("Espada", 5);
       this.armas.add(armaPadrao);
   }
   public int setForça(int força)
   {
       if (força<0)
       {
           this.força = 0;
       }
       else if (força>10)
       {
           this.força=10;
       }
       else
       {
           this.força = força;
       }
       return this.força=força;
   }

}
