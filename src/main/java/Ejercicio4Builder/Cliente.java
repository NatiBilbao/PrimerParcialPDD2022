package Ejercicio4Builder;

public class Cliente {
    public static void main(String[] args){
        Owner naty = new Owner();
        BuilderContrato hbo = new HBO();
        BuilderContrato netflix = new NETFLIX();
        BuilderContrato amazon = new AMAZON();

        naty.setBuilder(hbo);
        naty.armarContrato();
        Contrato contrato1 = naty.getContratoArmado();
        contrato1.showInfo();;

        naty.setBuilder(netflix);
        naty.armarContrato();
        Contrato contrato2 = naty.getContratoArmado();
        contrato2.showInfo();

        naty.setBuilder(amazon);
        naty.armarContrato();
        Contrato contrato3 = naty.getContratoArmado();
        contrato3.showInfo();
    }



}
