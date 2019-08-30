package provaAntiga;
public class KMException extends Exception {
	
	int kmRodados;
	
	public KMException(int kmRodados) {
		this.kmRodados=kmRodados;
	}

}
