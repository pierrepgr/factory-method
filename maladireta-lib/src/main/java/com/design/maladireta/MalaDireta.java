package com.design.maladireta;

import com.design.maladireta.contato.Contatos;

public abstract class MalaDireta {

    protected abstract Contatos criarContatos();

    public boolean enviarEmail(String mensagem) {
        var contatos = this.criarContatos().all();

        System.out.println("Conectando no servidor SMTP...");
        System.out.println(String.format("Mensagem a ser enviada: %s\n", mensagem));

        for (var contato: contatos) {
            System.out.println("From: <contato@design.com>");
            System.out.println(String.format("To: [%s] <%s>", contato.getNome(), contato.getEmail()));
            System.out.println(String.format("%s\n", mensagem));
        }

        return true;
    }
}
