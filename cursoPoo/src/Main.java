/*public class Main{
    public static void main(String[] args)
    {
        System.out.println("Hello Word");
        byte variavelbyte =10;
        System.out.println(variavelbyte);
        //short -32768 32767
        //char 0 ate 6535
        //int
        //long

    }
}*/

import Animais.Cachorro;

public class Main{
    public static void main(String[] args ){

        Cachorro cachorro1;
        cachorro1= new Cachorro();

        cachorro1.nome="Puppy";
        cachorro1.cor="Marron";
        cachorro1.altura=25;
        cachorro1.peso=5.5;
        cachorro1.tamanhoDoRabo=5;

        System.out.println(cachorro1.nome);

        cachorro1.latir();
        System.out.println("O cachorro pegou uma "+ cachorro1.pegar());

    }
}

