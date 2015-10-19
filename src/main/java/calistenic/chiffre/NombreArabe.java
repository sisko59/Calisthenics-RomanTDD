package calistenic.chiffre;

public class NombreArabe {
	private int valeur;

	public NombreArabe(int valeur) {
		this.valeur = valeur;
	}

	public NombreArabe(NombreArabe nombreArabe) {
		this.valeur = nombreArabe.valeur;
	}

	public int obtenirValeur() {
		return this.valeur;
	}

	public void moins(int i) {
		this.valeur -= i;
	}
}
