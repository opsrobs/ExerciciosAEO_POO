package com.company;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	Norma norma;

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            Date data= new Date();


        String orgaoNormativo;
        int versao;
        String tema;
        String titulo = JOptionPane.showInputDialog("Informe o titulo da norma: ");

        while (titulo != "fim"){
            orgaoNormativo=JOptionPane.showInputDialog("Informe o nome do Orgão Normativo: ");
            versao = Integer.parseInt(JOptionPane.showInputDialog("Informe a versão do software: "));


        }
    }
}
