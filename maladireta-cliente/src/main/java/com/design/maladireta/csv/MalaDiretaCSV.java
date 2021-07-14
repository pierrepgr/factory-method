package com.design.maladireta.csv;

import com.design.maladireta.MalaDireta;
import com.design.maladireta.contato.Contatos;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MalaDiretaCSV extends MalaDireta {

    private final String nomeArquivo;

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(this.nomeArquivo);
    }
}
