package provaAntiga;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.parameterized.*;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class TarifaTaxiTesteParametrizado {
	
	double valor, 
		   bandeirada, 
		   valorHoraParada;
	
	String valorKm;
	
	int kmRodados, 
		numHorasParadas;
	
	Taximetro taximetro = new Taximetro();
	
	public TarifaTaxiTesteParametrizado(double valor,
			double bandeirada,
			int kmRodados,
			String valorKm,
			int numHorasParadas,
			double valorHoraParada){
		
		this.valor = valor;
		this.bandeirada = bandeirada;
		this.kmRodados = kmRodados;
		this.valorKm = valorKm;
		this.numHorasParadas = numHorasParadas;
		this.valorHoraParada = valorHoraParada;

}
	
	@Parameters
	public static Iterable getParameters(){
		Object[][] parametros = new Object[][]{
			{290.24,5.24,100,"bandeira1", 0,31.72},
			{371.24,5.24,100,"bandeira2", 0,31.72},
			{179.46,5.24,50 ,"bandeira1", 1,31.72},
			{219.96,5.24,50 ,"bandeira2", 1,31.72},
			{211.18,5.24,50 ,"bandeira1", 2,31.72},
			{251.68,5.24,50 ,"bandeira2", 2,31.72}
			
		};
		return Arrays.asList(parametros);
	}
	
	
	@Test
	public void test() throws BandeiraException, KMException {
		double valorEsperado = taximetro.calculaValor(this.bandeirada, this.valorHoraParada,this.valorKm,this.kmRodados,this.numHorasParadas);
		assertEquals(this.valor,valorEsperado,0);
		
	}

}
