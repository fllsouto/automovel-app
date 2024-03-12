package test.java;

import org.junit.Ignore;
import org.junit.Test;

import main.java.Cores;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;

public class CoresTest {
    
    @Test
    public void devemHaverOitoCoresDeAutomovelApenas() {

        // String[] nomeDasCores = new String[]{
        //     "<BRANCO>",
        //     "<VERMELHO>",
        //     "<AMARELO>",
        //     "<PRETO>",
        //     "<AZUL>",
        //     "<VERDE>",
        //     "<ROXO>",
        //     "<LARANJA>"
        // };
        List<String> nomeDasCores = new ArrayList<String>();
        nomeDasCores.add("<BRANCO>");
        nomeDasCores.add("<VERMELHO>");
        nomeDasCores.add("<AMARELO>");
        nomeDasCores.add("<PRETO>");
        nomeDasCores.add("<AZUL>");
        nomeDasCores.add("<VERDE>");
        nomeDasCores.add("<ROXO>");
        nomeDasCores.add("<LARANJA>");
        

        assertEquals(Cores.quantidadeDeCores(), nomeDasCores.size());
        for (Cores cor : Cores.values()) {
            assertThat(cor.getCor()).isIn(nomeDasCores);
            nomeDasCores.remove(cor.getCor());
        }
        assertThat(nomeDasCores).isEmpty();
    }
}
