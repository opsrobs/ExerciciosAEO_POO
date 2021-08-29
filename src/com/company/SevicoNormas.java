package com.company;

import java.util.ArrayList;
import java.util.Date;

import static com.company.Norma.*;
public class SevicoNormas {
    ArrayList<Norma> normas= new ArrayList<>();

    public void retornarNormas(Norma norma){
        this.normas.add(norma);
    }

    public String normaMaiorQtdAnexo(){
        int maior=0;
        int posicao=0;
        int j;
        String dadosAnexo="";
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
        String dadosAnexo="";
        for (int i = 0,cont=0; i < this.normas.size(); i++, cont++) {
            if (dataAntiga.before(normas.get(i).getDataCriacao())) {
                dataAntiga= normas.get(i).getDataCriacao();
                posicao=cont;
            }
        }
        dadosAnexo= normas.get(posicao).getLista().toString();
        return dadosAnexo;
    }


}




