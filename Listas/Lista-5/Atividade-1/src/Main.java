import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
  public static void main(String[]args)
  {



    Grupo vikings_modernos = new Grupo();
    vikings_modernos.addHeroi( new Heroi(1,"chamas",20));
    Heroi heroi2 = new Heroi(2,"griffo",10);
    vikings_modernos.addHeroi(new Heroi(3,"mestre wuju",100));
    vikings_modernos.addHeroi(new Heroi(1,"lord tanatus",20));


    vikings_modernos.addHeroi(heroi2);


    System.out.println(vikings_modernos.getTotalMoedasOuro());





  }
}