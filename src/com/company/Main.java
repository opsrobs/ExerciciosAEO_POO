package com.company;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        SevicoNormas sevicoNormas = new SevicoNormas();
        AnexoTecnico anexoTecnico = new AnexoTecnico();
        Norma norma = new Norma();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            Date data = new Date();

        String titulo;
        String tituloAnexo;
        String d;
        String  normativo;
        String tema;
        float versao;

        titulo = JOptionPane.showInputDialog("Informe o titulo: ");
        boolean dataValida;
        while ( titulo!= null) {
            norma.setTitulo(titulo);
            norma.setOrgaoNormativo(normativo = JOptionPane.showInputDialog("Informe o nome do Orgão normativo: "));
            norma.setVersao(versao = Float.parseFloat(JOptionPane.showInputDialog("Informe a versão do software: ")));
            do{
                d=JOptionPane.showInputDialog("Informe a data [DD/MM/AAAA]: ");
                try {
                    data= dataFormatada.parse(d);
                    dataValida=true;
                }
                catch (Exception e)
                {
                    dataValida=false;
                }
                norma.setDataCriacao(data);
            }
            while (!dataValida);

            Norma normas = new Norma(titulo,normativo,data,versao);
            sevicoNormas.retornarNormas(normas);
            tituloAnexo=  JOptionPane.showInputDialog("Informe o titulo do anexo: ");
            while (tituloAnexo!= null){

                do{
                    d=JOptionPane.showInputDialog("Informe a data [DD/MM/AAAA]: ");
                    try {
                        data= dataFormatada.parse(d);
                        dataValida=true;
                    } catch (ParseException e) {
                        dataValida=false;
                    }
                    anexoTecnico.setDataCriacao(data);
                }while (!dataValida);
                tema=JOptionPane.showInputDialog("Informe o Tema: ");
                anexoTecnico.setTitulo(tituloAnexo);
                anexoTecnico.setTema(tema);
                normas.addAnexoTecnico(tituloAnexo,data,tema);
                tituloAnexo=  JOptionPane.showInputDialog("Informe o titulo do anexo: ");

            }
            titulo = JOptionPane.showInputDialog("Informe o titulo: ");
        }
        System.out.println("--------\n"+sevicoNormas.normaMaiorQtdAnexo());
        System.out.println("--------\n"+sevicoNormas.normaMaisAntiga());
    }
}
