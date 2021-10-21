package testejava;

// Importaçôes

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//criando as class de teste

public class BuscaBinariaTeste {

    // instanciando classe busca binaria

    BuscaBinaria Busc = new BuscaBinaria();

    // chamando o teste com, @Test
    // criando primeiro teste de numeroExistenteInicio.
    @Test
    public void numeroExistenteInicio() {

        int[] array = { 1, 10, 15, 77, 33, 8 };
        int chave = 1;

        assertEquals(0, Busc.busca(array, chave));
    }

    // criando segundo teste de numeroExistenteFinal.
    @Test
    public void numeroExistenteFinal() {

        int[] array = { 0, 1, 10, 15, 77, 33, 8, 9 };
        int chave = 9;

        assertEquals(-1, Busc.busca(array, chave));

    }

    // criando primeiro teste de numeroExistenteMeio .
    @Test
    public void numeroExistenteMeio() {

        int[] array = { 0, 21, 13, 15, 77, 33, 8 };
        int chave = 15;

        assertEquals(3, Busc.busca(array, chave));

    }

    // criando primeiro teste de numeroInexistente.
    @Test
    public void numeroInexistente() {

        int[] array = { 10, 13, 12, 15, 33, 8 };
        int chave = 9;

        assertEquals(-1, Busc.busca(array, chave));

    }
}
