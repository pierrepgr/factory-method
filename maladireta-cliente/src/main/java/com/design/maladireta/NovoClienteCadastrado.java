package com.design.maladireta;

import com.design.maladireta.xml.MalaDiretaXML;

import javax.swing.*;

public class NovoClienteCadastrado {

    public static void main(String[] args) {
        var malaDireta = new MalaDiretaXML("contatos.xml");
        var mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");

        var status = malaDireta.enviarEmail(mensagem);

        JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
}
