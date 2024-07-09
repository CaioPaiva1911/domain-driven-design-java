package br.com.alura.codechella.dominio.evento;

import br.com.alura.codechella.vendas.dominio.evento.Categoria;
import br.com.alura.codechella.vendas.dominio.evento.Evento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class TesteFabricaDeEvento {

    @Test
    void testeFabricaDeEventos() {

        Evento evento = new Evento.Builder()
                .comCategoria(Categoria.MUSICA)
                .comDescricao("The Weeknd")
                .comEndereco("25989785", 50, "Maracanã")
                .comData(LocalDateTime.parse("2025-11-19T19:00:00"))
                .build();
        Assertions.assertEquals(evento.getDescricao(), "The Weeknd");
    }
}
