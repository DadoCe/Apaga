package br.com.dojo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.dojo.Apaga.Apaga;


public class ApagaTest {

	private Apaga apaga;
	
	@Before
	public void setUp() {
		apaga = new Apaga();
	}
	
	@Test
	public void deveCriarApaga() {	
		assertNotNull(new Apaga());
	}
	
	@Test
	public void primeiroNumeroDeveSerMenorOuIgualA_100000() {
		assertTrue(apaga.isMenorQueDezSobreCinco(10));
		assertFalse(apaga.isMenorQueDezSobreCinco(100001));
	}
	
	@Test
	public void segundoNumeroDeveSerMenorQueOPrimeiro() {
		assertTrue(apaga.isSegundoNumeroMenorQueOPrimeiro(10, 5));
		assertFalse(apaga.isSegundoNumeroMenorQueOPrimeiro(5, 15));
	}
	
	@Test
	public void segundoNumeroDeveSerMaiorOuIgualAUm() {
		assertTrue(apaga.isMenorOuIgualAUm(5));
		assertFalse(apaga.isMenorOuIgualAUm(0));
	}
	
	@Test
	public void deveGerarNumeroSemZeroAEsquerda() {
		apaga.geraNumeroDeTamanhoIgualA(5);
		assertFalse(apaga.getNumeroGerado().substring(0, 1).equals("0"));
	}
	
	@Test
	public void numeroGeradoDeveTerTamanhoIgualAoInformado() {
		apaga.geraNumeroDeTamanhoIgualA(6);
		assertEquals(6, apaga.getNumeroGerado().length());
	}
	
	@Test
	public void deveApagarAQuantidadeDeNumerosInformadosRestandoOMaiorValorPossivel() {
		assertEquals("345", apaga.apagueEGanhe());
	}
	
}
