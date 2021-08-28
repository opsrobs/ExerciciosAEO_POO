package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Norma {
    private String titulo;
    private String orgaoNormativo;
    private Date dataCriacao;
    private float versao;
    private ArrayList<AnexoTecnico> lista = new ArrayList<>();

    public Norma( String titulo,String orgaoNormativo,Date dataCriacao,  float versao) {
        this.titulo = titulo;
        this.orgaoNormativo = orgaoNormativo;
        this.dataCriacao=dataCriacao;
        this.versao = versao;
    }

    public void addAnexoTecnico(String titulo, Date data, String tema){
        lista.add(new AnexoTecnico(titulo,data,tema));
    }

    public ArrayList<AnexoTecnico> getAnexosTecnicos(){
        return lista;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getOrgaoNormativo() {
        return orgaoNormativo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
