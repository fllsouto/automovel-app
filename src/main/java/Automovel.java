package main.java;

import main.java.AvaliacaoSeguranca;
import main.java.Cores;

public abstract class Automovel {
	private Cores cor;
	private int quantidadeDeRodas;
	private int ano;
    private String tipo;
    private AvaliacaoSeguranca avaliacao;


	public Automovel(Cores cor, int quantidadeDeRodas, int ano, String tipo, AvaliacaoSeguranca avaliacao) {
		this.cor = cor;
		this.quantidadeDeRodas = quantidadeDeRodas;
		this.ano = ano;
        this.tipo = tipo;
        this.avaliacao = avaliacao;
	}

    public Cores getCor() {
        return cor;
    }


    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }


    public int getAno() {
        return ano;
    }


    public String getTipo() {
        return tipo;
    }

    // public static Automovel getInstance(String cor, int quantidadeDeRodas, int ano, String tipo, AvaliacaoSeguranca avaliacao) {
    //     return new Automovel(cor, quantidadeDeRodas, ano, tipo, avaliacao);
    // }
}