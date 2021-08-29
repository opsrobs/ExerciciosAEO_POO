package com.company;

import jdk.jfr.consumer.RecordedThread;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.company.Norma.*;
public class SevicoNormas {
    Norma norma = new Norma();
    ArrayList<Norma> normas= new ArrayList<>();

    public void retornarNormas(Norma norma){
        this.normas.add(norma);
    }

    public String buscaTitulo(){
        return JOptionPane.showInputDialog("Informe o titulo ou [sair] para encerrar: ");
    }
    public Float buscaVersao(){
        return Float.parseFloat(JOptionPane.showInputDialog("Informe a versão do software: "));
    }
    public String  buscaData(){
        return JOptionPane.showInputDialog("Informe a data [DD/MM/AAAA]: ");
    }
    public String buscaTituloAnexo(){
        return JOptionPane.showInputDialog("Informe o titulo ou [sair] para encerrar: ");
    }
    public String buscaTema(){
        return JOptionPane.showInputDialog("Informe o Tema: ");
    }
    public String buscaOrgaoNormativo(){
        return JOptionPane.showInputDialog("Informe o nome do Orgão normativo: ");
    }

    public Date converterData(){
        String d = this.buscaData();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        boolean dataValida;
        do{
            this.buscaData();
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
        return data;
    }

    public String normaMaiorQtdAnexo(){
        int maior=0;
        int posicao=0;
        int j;
        String dadosAnexo;
        for (int i = 0,cont=0; i < this.normas.size(); i++, cont++) {
            if (normas.get(i).getAnexosTecnicos().size() > maior) {
                maior = normas.get(i).getAnexosTecnicos().size();
                posicao = cont;
            }
        }
        dadosAnexo= normas.get(posicao).toString()+ "\n"+normas.get(posicao).getLista().toString();
        return dadosAnexo;
    }

    public String normaMaisAntiga(){
        int posicao=0;
        Date dataAntiga = new Date();
        String dadosAnexo;
        for (int i = 0,cont=0; i < this.normas.size(); i++, cont++) {
            if (dataAntiga.after(normas.get(i).getDataCriacao())) {
                dataAntiga= normas.get(i).getDataCriacao();
                posicao=cont;
            }
        }
        dadosAnexo= normas.get(posicao).toString()+"\n"+ normas.get(posicao).getLista().toString();
        return dadosAnexo;
    }


}




