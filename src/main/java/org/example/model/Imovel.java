package org.example.model;


public class Imovel {
    private int cod_imovel;
    private String tipo_imovel;
    private String cep_endereco;

    public Imovel() {}

    public Imovel(int cod_imovel, String tipo_imovel, String cep_endereco) {
        this.cod_imovel = cod_imovel;
        this.tipo_imovel = tipo_imovel;
        this.cep_endereco = cep_endereco;
    }

    public int getCod_imovel() {
        return cod_imovel;
    }

    public void setCod_imovel(int cod_imovel) {
        this.cod_imovel = cod_imovel;
    }

    public String getTipo_imovel() {
        return tipo_imovel;
    }

    public void setTipo_imovel(String tipo_imovel) {
        this.tipo_imovel = tipo_imovel;
    }

    public String getCep_endereco() {
        return cep_endereco;
    }

    public void setCep_endereco(String cep_endereco) {
        this.cep_endereco = cep_endereco;
    }
}
