package com.company;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        SevicoNormas sevicoNormas = new SevicoNormas();
        Norma norma = new Norma();
        Date dt;
        float versao;

        String titulo=sevicoNormas.buscaTitulo();
        while (!titulo.equalsIgnoreCase("sair")) {
            norma.setTitulo(titulo);
            String  normativo=sevicoNormas.buscaOrgaoNormativo();
            norma.setOrgaoNormativo(normativo);
            versao= sevicoNormas.buscaVersao();
            norma.setVersao(versao);
            dt=sevicoNormas.converterData(sevicoNormas.buscaData());

            Norma normas = new Norma(titulo,normativo,dt,versao);
            sevicoNormas.retornarNormas(normas);
            String tituloAnexo= sevicoNormas.buscaTituloAnexo();
            while (!tituloAnexo.equalsIgnoreCase("sair")){
                dt=sevicoNormas.converterData(sevicoNormas.buscaData());
                String tema= sevicoNormas.buscaTema();
                sevicoNormas.setTitulo(tituloAnexo);
                sevicoNormas.setTema(tema);
                normas.addAnexoTecnico(tituloAnexo,dt,tema);
                tituloAnexo= sevicoNormas.buscaTituloAnexo();
            }
            titulo =sevicoNormas.buscaTitulo();
        }
        System.out.println("--------\n"+sevicoNormas.normaMaiorQtdAnexo());
        System.out.println("--------\n"+sevicoNormas.normaMaisAntiga());
    }
}
