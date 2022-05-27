package Ejercicio3FactoryMethod;

public class Cliente {
    public static void main(String[] args){
        PelotaFutbol pf = new CreatorPelotaFutbol().createProduct();
        pf.showInfo();

        Camiseta cm = new CreatorCamiseta().createProduct();
        cm.showInfo();
    }
}
