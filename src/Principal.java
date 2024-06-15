import br.com.screenmatch.modelos.Filmes;

public class  Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.setNome("Pânico");
        meuFilme.setAnoDeLancamento(1996);
        meuFilme.setAnoDeLancamento(120);

        meuFilme.exibeInfos();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7.5);
        //System.out.println(meuFilme.somaDasNotas); Não queremos visualizar a soma das notas, não é algo necessario no sistema.
        System.out.println(meuFilme.mediaDasNotas());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
    }
}