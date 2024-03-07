package test.java;

import org.junit.Ignore;
import org.junit.Test;

import main.java.AvaliacaoSeguranca;
import main.java.Carro;
import main.java.factory.AutomovelFactory;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

public class AvaliacaoSegurancaTest {
    
    @Test
    public void criaUmaAvaliacao() {
        LocalDateTime dataAvaliacao = LocalDateTime.now();
        LocalDateTime validadeAvaliacao = dataAvaliacao.plusMonths(18);
        AvaliacaoSeguranca novaAvaliacao = new AvaliacaoSeguranca(7.5, dataAvaliacao);


        assertThat(novaAvaliacao.getNota()).isEqualTo(7.5);
        assertThat(novaAvaliacao.getDataAvaliacao()).isEqualTo(dataAvaliacao);
        assertThat(novaAvaliacao.getValidadeAvaliacao()).isEqualTo(validadeAvaliacao);
    }

    @Test
    public void umaAvaliacaoDentroDaValidadeNaoDeveEstarExpirada() {
        LocalDateTime dataAvaliacao = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime validadeAvaliacao = dataAvaliacao.plusMonths(18);
        LocalDateTime agora = LocalDateTime.now();
        AvaliacaoSeguranca novaAvaliacao = new AvaliacaoSeguranca(7.5, dataAvaliacao);

        assertThat(novaAvaliacao.isExpired(agora)).isFalse();
    }

    @Test
    public void umaAvaliacaoForaDaValidadeDeveEstarExpirada() {
        LocalDateTime dataAvaliacao = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime validadeAvaliacao = dataAvaliacao.plusMonths(18);
        LocalDateTime noFuturoForaDaValidade = LocalDateTime.of(2025, 10, 7, 0,0, 0);
        LocalDateTime noPassadaForaDaValidade = LocalDateTime.of(2023, 12, 1, 0,0, 0);
        AvaliacaoSeguranca novaAvaliacao = new AvaliacaoSeguranca(7.5, dataAvaliacao);

        assertThat(novaAvaliacao.isExpired(noFuturoForaDaValidade)).isTrue();
        assertThat(novaAvaliacao.isExpired(noPassadaForaDaValidade)).isTrue();
    }


}