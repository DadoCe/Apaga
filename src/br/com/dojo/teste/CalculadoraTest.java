package br.com.dojo.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	private Calculadora calc;
	
	@ Before
	public void setUp() {
		calc = new Calculadora();
	}

	@Test
	public void deveSomarDoisInteiros() {				
		assertEquals(5, calc.soma(2,3));
	}
	
	@Test
	public void deveMultiplicarDoisInteiros() {
		assertEquals(6, calc.multiplica(2,3));
	}
	
	@Test 
	public void deveDividirQuatroPorDois() {		
		assertEquals(2.0, calc.divide(4, 2), 10);
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void deveDividirCincoPorDois() {		
		assertEquals(2.0, calc.divide(5, 2));
	}
	
	
}
