package Ejercicio4Builder;

public class Owner {
    private BuilderContrato builder;

    public Contrato getContratoArmado(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderContrato builder){
        this.builder = builder;
    }

    public void armarContrato(){
        this.builder.createContrato();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildListaDeCanales();
    }
}
