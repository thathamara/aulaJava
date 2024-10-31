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
import Animais.Gato;
import Animais.Passaro;
import Loja.PetShop;

public class Main{
    public static void main(String[] args ){
//classe //objeto
        Cachorro cachorro1=new Cachorro("Puppy","Marron",25,5.5,5);
        Gato gato1=new Gato("Felix","Preto",4.5);
        Passaro passaro1=new Passaro("Frajola","azul",0.5);
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
        PetShop petshop= new PetShop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.darBanho(passaro1);
        System.out.println(passaro1.getEstadoDeEspirito());




//        System.out.println(cachorro2.getNome());
//
//        cachorro1.latir();
//        System.out.println("O cachorro pegou uma "+ cachorro1.pegar());
//
//        System.out.println("O cachorro está "+ cachorro1.interagir("carinho"));
//        System.out.println("O cachorro está "+ cachorro1.interagir("vai dormir"));
//        System.out.println("O cachorro está "+ cachorro1.interagir("nada"));

    }
}

