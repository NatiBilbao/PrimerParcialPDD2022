package Ejercicio4Builder;

public class Contrato {

    private String costo;
    private String empresa;
    private String listaDeCanales;

    public Contrato(){}

    public String getCosto() {
        return costo;
    }

    public Contrato setCosto(String costo) {
        this.costo = costo;
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Contrato setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public String getListaDeCanales() {
        return listaDeCanales;
    }

    public Contrato setListaDeCanales(String listaDeCanales) {
        this.listaDeCanales = listaDeCanales;
        return this;
    }
}
