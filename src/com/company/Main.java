package com.company;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        SevicoNormas sevicoNormas = new SevicoNormas();
        AnexoTecnico anexoTecnico = new AnexoTecnico();
        Norma norma = new Norma();

        String titulo=sevicoNormas.buscaTitulo();
        while (!Objects.equals(titulo, "sair")) {
            norma.setTitulo(titulo);
            String  normativo=sevicoNormas.buscaOrgaoNormativo();
            norma.setOrgaoNormativo(normativo);
            norma.setVersao(sevicoNormas.buscaVersao());
            String d = sevicoNormas.buscaData();
            sevicoNormas.converterData();

            Norma normas = new Norma(titulo,normativo,sevicoNormas.converterData(),sevicoNormas.buscaVersao());
            sevicoNormas.retornarNormas(normas);
            String tituloAnexo= sevicoNormas.buscaTituloAnexo();
            while (!Objects.equals(tituloAnexo, "sair")){

                sevicoNormas.buscaData();
                sevicoNormas.buscaTema();
                anexoTecnico.setTitulo(tituloAnexo);
                anexoTecnico.setTema(sevicoNormas.buscaTema());
                normas.addAnexoTecnico(tituloAnexo,sevicoNormas.converterData(),sevicoNormas.buscaTema());
                sevicoNormas.buscaTituloAnexo();

            }
            titulo =sevicoNormas.buscaTitulo();
        }
        System.out.println("--------\n"+sevicoNormas.normaMaiorQtdAnexo());
        System.out.println("--------\n"+sevicoNormas.normaMaisAntiga());
    }
}
