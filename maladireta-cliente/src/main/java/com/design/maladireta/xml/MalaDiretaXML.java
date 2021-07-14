package com.design.maladireta.xml;

import com.design.maladireta.MalaDireta;
import com.design.maladireta.contato.Contatos;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MalaDiretaXML extends MalaDireta {

    private final String nomeArquivo;

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(this.nomeArquivo);
    }
}
