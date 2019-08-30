package provaAntiga;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;

public class TarifaTaxiTesteException {
	
	Taximetro taximetro = new Taximetro();
	
	@Rule
	public ExpectedException e = ExpectedException.none();
	
	@Test
	public void testBandeira() throws BandeiraException, KMException {
		e.expect(BandeiraException.class);
		taximetro.calculaValor(0.0,0.0,"",10,0);
	
	}
	
	@Test
	public void testKM() throws BandeiraException, KMException {
		e.expect(KMException.class);
		taximetro.calculaValor(0.0,0.0,"bandeira1",0,0);
	}

}
