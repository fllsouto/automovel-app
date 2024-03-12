package main.java;

import main.java.AvaliacaoSeguranca;

public abstract class Automovel {
	private String cor;
	private int quantidadeDeRodas;
	private int ano;
    private String tipo;
    private AvaliacaoSeguranca avaliacao;


	public Automovel(String cor, int quantidadeDeRodas, int ano, String tipo, AvaliacaoSeguranca avaliacao) {
		this.cor = cor;
		this.quantidadeDeRodas = quantidadeDeRodas;
		this.ano = ano;
        this.tipo = tipo;
        this.avaliacao = avaliacao;
	}

    public String getCor() {
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