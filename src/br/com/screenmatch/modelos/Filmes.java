package br.com.screenmatch.modelos;

public class Filmes { // tudo que uma classe tem
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasNotas;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeInfos () { //metodos da classe, coisas que ela vai fazer, void quer dizer que não ira retornar nenhum valor, precisa escrever o nome do metodo e botar os parenteses do argumento
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println();
    }

    public void avalia (double notas) { //informado argumento para o metodo, pois tera dados incluido
        somaDasNotas += notas;
        totalDeAvaliacoes++;
    }

   public double mediaDasNotas () { //especificar o tipo de retorno
        return somaDasNotas / totalDeAvaliacoes;
    }


}
