import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.modelos.Filmes;
import br.com.screenmatch.modelos.Series;

public class  Principal {
    public static void main(String[] args) {
        Filmes scream = new Filmes();
        scream.setNome("Pânico");
        scream.setAnoDeLancamento(1996);
        scream.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + scream.getDuracaoEmMinutos());
        scream.exibeInfos();
        scream.avalia(10);
        scream.avalia(8);
        scream.avalia(7.5);
        //System.out.println(meuFilme.somaDasNotas); Não queremos visualizar a soma das notas, não é algo necessario no sistema.
        System.out.println(scream.mediaDasNotas());
        System.out.println("Total de avaliações: " + scream.getTotalDeAvaliacoes());

        Filmes pussinboots = new Filmes();
        pussinboots.setNome("Gato de Botas");
        pussinboots.setAnoDeLancamento(2011);
        pussinboots.setDuracaoEmMinutos(102);
        System.out.println("Duração do filme: " + pussinboots.getDuracaoEmMinutos());

        Series sfh = new Series();
        sfh.setNome("Strangers From Hell");
        sfh.setAnoDeLancamento(2019);
        sfh.exibeInfos();
        sfh.setTemporadas(1);
        sfh.setEpisodiosPorTemp(10);
        sfh.setMinutosPorEpisodios(60);
        System.out.println("Duração da serie: " + sfh.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiTempo(scream);
        calculadora.incluiTempo(pussinboots);
        calculadora.incluiTempo(sfh);
        System.out.println(calculadora.getTempoTotal() + " minutos");

    }
}