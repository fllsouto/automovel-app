package test.java;

import org.junit.Ignore;
import org.junit.Test;

import main.java.Automovel;
import main.java.AvaliacaoSeguranca;
import main.java.factory.AutomovelFactory;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;


public class AutomovelTest {

    @Test
    public void euPossoCriarUmNovoAutomovel() {
        AvaliacaoSeguranca avaliacao = new AvaliacaoSeguranca(7.5, LocalDateTime.now());

        Automovel automovel = new Automovel("Vermelho", 4, 2023, "Carro", avaliacao);

        assertThat(automovel.getCor()).isEqualTo("Vermelho");
        assertThat(automovel.getQuantidadeDeRodas()).isEqualTo(4);
        assertThat(automovel.getAno()).isEqualTo(2023);
        assertThat(automovel.getTipo()).isEqualTo("Carro");
    }

    @Test
    @Ignore
    public void umAutomovelDeveTerDuasOuQuatroRodas() {
        int quantidadeDeRodasDeUmCarro = 4;
        Automovel carro = criaInstanciaAutomovel("Vermelho", 4, 2018, "carro");

        assertThat(carro.getCor()).isEqualTo("Vermelho");
        assertThat(carro.getQuantidadeDeRodas()).isEqualTo(quantidadeDeRodasDeUmCarro);
        assertThat(carro.getAno()).isEqualTo(2018);
        assertThat(carro.getTipo()).isEqualTo("<CARRO>");

        Automovel moto = criaInstanciaAutomovel("Branca", 2, 2010, "moto");
        int quantidadeDeRodasDeUmaMoto = 2;

        Automovel superCaminhao = new Automovel("Vermelho", 20, 2025, "Super-Caminhão", null);

        assertThat(moto.getCor()).isEqualTo("Branca");
        assertThat(moto.getQuantidadeDeRodas()).isEqualTo(quantidadeDeRodasDeUmaMoto);
        assertThat(moto.getAno()).isEqualTo(2010);
        assertThat(moto.getTipo()).isEqualTo("<MOTO>");
    }

    @Test
    @Ignore
    public void umCarroTemQueTerQuatroRodas() {
        int quantidadeDeRodasDeUmCarro = 4;

        Automovel carro = criaInstanciaAutomovel("Vermelho", 4, 2018, "carro");
        assertThat(carro.getQuantidadeDeRodas()).isEqualTo(quantidadeDeRodasDeUmCarro);
        assertThat(carro.getTipo()).isEqualTo("<CARRO>");
    }

    private Automovel criaInstanciaAutomovel(String cor, int quantidadeDeRodas, int ano, String tipo) {
        AvaliacaoSeguranca avaliacao = new AvaliacaoSeguranca(7.5, LocalDateTime.now());

        if(tipo.equals("moto")) {
            return AutomovelFactory.criaMoto(cor, ano, avaliacao);
        }

        
        if (tipo.equals("carro")) {
            return AutomovelFactory.criaCarro(cor, ano, avaliacao);
        }

        return null;
    }

    // Testes não cobertos que devem dar exceção (Bônus)
    // 1. Criar um automóvel sem roda
    // 2. Criar um automóvel 1 rodas
    // 3. Criar um automóvel com 3 rodas
    // 4. Criar um automóvel com 5 ou mais rodas

    // Novas Regras:
    // 1. Se eu instanciar uma moto ela não pode ter quatro rodas
    // 2. Se eu instanciar um carro ele não pode ter duas rodas
    // 3. A cor do carro tem que estar em Maiusculo
    
    
    // Desafio: Trocar a cor por um ENUM
}

