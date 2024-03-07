package main.java;

public class Moto extends Automovel {
    
    public static String TIPO = "<MOTO>";
    public static int QUANTIDADE_DE_RODAS = 2;
    private int cilindradas;

    public Moto(String cor, int ano, AvaliacaoSeguranca avaliacao) {
        super(cor, QUANTIDADE_DE_RODAS, ano, TIPO, avaliacao);
    }

    public int getCilindradas() {
        return cilindradas;
    }
    
}
