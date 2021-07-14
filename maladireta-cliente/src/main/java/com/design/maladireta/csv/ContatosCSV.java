package com.design.maladireta.csv;

import au.com.bytecode.opencsv.CSVReader;
import com.design.maladireta.contato.Contato;
import com.design.maladireta.contato.Contatos;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ContatosCSV implements Contatos {

    private final String nomeArquivo;

    @Override
    public List<Contato> all() {
        var contatos = new ArrayList<Contato>();
        CSVReader csvReader = null;

        try {
            var uri = this.getClass().getResource("/" + this.nomeArquivo).toURI();
            var fileCSV = new File(uri);
            var fileReader = new FileReader(fileCSV);
            csvReader = new CSVReader(fileReader);
            String[] nextLine;

            while ((nextLine = csvReader.readNext()) != null) {
                contatos.add(Contato
                        .builder()
                        .nome(nextLine[0].trim())
                        .email(nextLine[1].trim())
                        .build()
                );
            }
            return contatos;
        } catch (Exception e) {
            throw new RuntimeException("Erro lendo arquivo csv", e);
        } finally {
            try {
                csvReader.close();
            } catch (IOException e) { }
        }
    }
}
