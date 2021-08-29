package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnexoTecnico {
    private String titulo;
    private Date DataCriacao;
    private String tema;

    public AnexoTecnico(){
        this.titulo = titulo;
        DataCriacao = DataCriacao;
        this.tema = tema;
    }

    public AnexoTecnico(String titulo, Date dataCriacao, String tema) {
        this.titulo = titulo;
        DataCriacao = dataCriacao;
        this.tema = tema;
    }
    @Override
    public String toString() {
        SimpleDateFormat dT = new SimpleDateFormat("dd/MM/yyyy");
        return  " Titulo: "+ this.getTitulo()+
                "\n Data de criação: "+ dT.format(this.getDataCriacao())+
                "\n Tema: "+ this.getTema();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataCriacao() {
        return DataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        DataCriacao = dataCriacao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

//    public String dadosAnexo(){
//        String dados = sevicoNormas.normaMaiorQtdAnexo(this.getTitulo(),this.DataCriacao,this.getTema());
//
//        return dados;
//    }
}
