package com.design.maladireta.xml;

import com.design.maladireta.contato.Contato;
import com.design.maladireta.contato.Contatos;
import com.thoughtworks.xstream.XStream;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ContatosXML implements Contatos {

    private final String nomeArquivo;

    @Override
    public List<Contato> all() {
        var xstrean = new XStream();
        xstrean.alias("contatos", List.class);
        xstrean.alias("contato", Contato.class);

        var arquivo = this.getClass().getResource("/" + this.nomeArquivo);
        return (List<Contato>) xstrean.fromXML(arquivo);
    }
}
