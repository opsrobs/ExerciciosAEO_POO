package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Norma {
    private String orgaoNormativo;
    private float versao;
    private ArrayList<AnexoTecnico> lista = new ArrayList<>();

    public Norma(String orgaoNormativo, float versao) {
        this.orgaoNormativo = orgaoNormativo;
        this.versao = versao;
    }

    public void addAnexoTecnico(String titulo, Date data, String tema){
        lista.add(new AnexoTecnico(titulo,data,tema));
    }

    public ArrayList<AnexoTecnico> getAnexosTecnicos(){
        return lista;
    }


    public String getOrgaoNormativo() {
        return orgaoNormativo;
    }

    public void setOrgaoNormativo(String orgaoNormativo) {
        this.orgaoNormativo = orgaoNormativo;
    }

    public float getVersao() {
        return versao;
    }

    public void setVersao(float versao) {
        this.versao = versao;
    }
    @Override
    public String toString(){
        return  "\n Orgão Normativo: "+ this.getOrgaoNormativo()+
                "\n Versão do software: " + this.getVersao();
    }
}
