package com.design.maladireta;

import com.design.maladireta.csv.MalaDiretaCSV;

import javax.swing.*;

public class RelacionamentoCliente {

    public static void main(String[] args) {
        var malaDireta = new MalaDiretaCSV("contatos.csv");
        var mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");

        var status = malaDireta.enviarEmail(mensagem);

        JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
}
