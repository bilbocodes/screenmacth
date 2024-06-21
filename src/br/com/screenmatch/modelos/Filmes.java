package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificacao;

public class Filmes extends Titulo implements Classificacao { // tudo que uma classe tem
  private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
