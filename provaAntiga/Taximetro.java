package provaAntiga;

public class Taximetro {

	public double calculaValor(double bandeirada, 
							   double valorHoraParada, 
							   String valorKm, 
							   int kmRodados, 
							   int numHorasParadas) throws BandeiraException, KMException {
		double bandeiraValor = 0;
		if (valorKm == "bandeira1") {
			bandeiraValor = 2.85;
		} else if (valorKm == "bandeira2") {
			bandeiraValor = 3.66;
		}else {
			throw new BandeiraException(bandeiraValor);
		}
		
		if (kmRodados <= 0) {
			throw new KMException(kmRodados);
		}
		double valor = bandeirada + (kmRodados * bandeiraValor) + (numHorasParadas * valorHoraParada);
		return valor;
	}

}
