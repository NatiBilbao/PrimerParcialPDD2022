package Ejercicio4Builder;

public class HBO extends BuilderContrato{

    @Override
    public void buildCosto(){
        this.contrato.setCosto("100bs");
    }

    @Override
    public void buildEmpresa(){
        this.contrato.setEmpresa("hbo");
    }

    @Override
    public void buildListaDeCanales(){
        this.contrato.setListaDeCanales("Csi, Rapidos y Furiosos, Duro de matar");
    }

}
