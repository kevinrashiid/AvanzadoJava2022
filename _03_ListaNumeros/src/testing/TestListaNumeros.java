package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.ListaDeNumeros;

class TestListaNumeros {
	ListaDeNumeros lista;
	@BeforeEach
	void setUp() throws Exception {
		lista=new ListaDeNumeros();
	}

	@Test
	void testFirst() {
		lista.add(20);
		lista.add(30);
		assertEquals(20, lista.first());//se esperaba 20
	}

	@Test
	void testLast() {
		lista.add(20);
		lista.add(30);
		assertEquals(30, lista.last());//se esperaba 30
		
	}

	@Test
	void testSum() {
		lista.add(20);
		lista.add(30);
		assertEquals(50, lista.sum());//se esperaba 50
	}

	@Test
	void testAddInteger() {
		lista.add(5);
		lista.add(10);
		assertFalse(lista.add(5));//añadimos 5 si es false
		assertEquals(2, lista.size());////se esperaba 20
	}
}
