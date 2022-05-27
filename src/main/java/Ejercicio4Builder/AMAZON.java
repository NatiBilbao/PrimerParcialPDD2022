package Ejercicio4Builder;

public class AMAZON extends BuilderContrato{

    @Override
    public void buildCosto(){
        this.contrato.setCosto("50bs");
    }

    @Override
    public void buildEmpresa(){
        this.contrato.setEmpresa("Amazon");
    }

    @Override
    public void buildListaDeCanales(){
        this.contrato.setListaDeCanales("Jumaji, No digas su nombre, Cuando las luces se apagn");
    }
}
