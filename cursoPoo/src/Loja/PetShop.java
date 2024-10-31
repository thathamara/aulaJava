package Loja;
import Animais.Animal;
import Animais.Cachorro;

public class PetShop {
    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("tosado");
    }
    public void deixarNoHotel(Animal animais){
        animais.setEstadoDeEspirito("com saudade");
    }

}
