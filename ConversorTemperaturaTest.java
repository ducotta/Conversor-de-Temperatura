package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import conversor.Conversor;

public class ConversorTemperaturaTest {

	Conversor meuConversor;
	
	@Before
	public void setUp() throws Exception {
		meuConversor = new Conversor();
	}

	
	@Test
	public void testCelsiusParaFahrenheit(){	
		assertEquals(104, meuConversor.conversorCelsiusParaFahrenheit());
	}
	
	@Test
	public void testCelsiusParaFahrenheit2(){
		assertEquals(104, meuConversor.conversorCelsiusParaFahrenheit(40));	
	}
	
	@Test
	public void testCelsiusParaFahrenheit3(){
		assertEquals(104.0, meuConversor.conversorCelsiusParaFahrenheit(40.0),0.01);	
	}

	@Test
	public void testFahrenheitParaCelsius(){
		assertEquals(40.0, meuConversor.conversorFahrenheitParaCelsius(104.0),0.01);
	}
	
	@Test
	public void testCelsiusParaKelvin(){
		assertEquals(298.0, meuConversor.conversorCelsiusParaKelvin(25.0),0.01);
	}
	
	@Test
	public void testKelvinParaCelsius(){
		assertEquals(25.0, meuConversor.conversorKelvinParaCelsius(298.0),0.01);
	}
	
	@Test
	public void testKelvinParaFahrenheit(){
		assertEquals(104.0, meuConversor.conversorKelvinParaFahrenheit(313.0),0.01);
	}
	
	@Test
	public void testFahrenheitParaKelvin(){
		assertEquals(313.0, meuConversor.conversorFahrenheitParaKelvin(104.0),0.01);
	}
}
