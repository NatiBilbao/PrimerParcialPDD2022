package Ejercicio4Builder;

public class NETFLIX extends BuilderContrato{

    @Override
    public void buildCosto(){
        this.contrato.setCosto("150bs");
    }

    @Override
    public void buildEmpresa(){
        this.contrato.setEmpresa("Netflix");
    }

    @Override
    public void buildListaDeCanales(){
        this.contrato.setListaDeCanales("Transformers, Shutter, El Conjuro");
    }
}
