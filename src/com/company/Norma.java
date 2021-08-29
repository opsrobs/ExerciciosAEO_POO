package com.company;

import java.text.SimpleDateFormat;
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
    public Norma(){
        this.titulo = titulo;
        this.orgaoNormativo = orgaoNormativo;
        this.dataCriacao=dataCriacao;
        this.versao = versao;
    }

    public void addAnexoTecnico(String titulo, Date data, String tema){
        lista.add(new AnexoTecnico(titulo,data,tema));
//        lista.add(new AnexoTecnico());
    }
    public void getAnexoTecnico(){
    }

    public ArrayList<AnexoTecnico> getLista() {
        return lista;
    }

    public void setLista(ArrayList<AnexoTecnico> lista) {
        this.lista = lista;
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
        SimpleDateFormat dT = new SimpleDateFormat("dd/MM/yyyy");
        return  "\n O titulo da norma é " + this.getTitulo()+
                "\t\n Orgão Normativo da norma " +this.getTitulo()+ " é: "+ this.getOrgaoNormativo()+
                "\t\n A data  da norma " +this.getTitulo()+ "é: "+ dT.format(this.getDataCriacao())+
                "\t\n Versão do software desta norma: " + this.getVersao();
    }

}
