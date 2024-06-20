package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void incluiTempo(Filmes f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//
//    }
//
//    public void incluiTempo(Series s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//
//    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
