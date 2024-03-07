package main.java;

public class Carro extends Automovel {

    public static String TIPO = "<CARRO>";
    public static int QUANTIDADE_DE_RODAS = 4;

    private String modeloVolante;
    private int numeroAirBags;

    public Carro(String cor, int ano, AvaliacaoSeguranca avaliacao) {
        super(cor, QUANTIDADE_DE_RODAS, ano, TIPO, avaliacao); 
    }

    public String getModeloVolante() {
        return modeloVolante;
    }

    public int getNumeroAirBags() {
        return numeroAirBags;
    }
    
}
