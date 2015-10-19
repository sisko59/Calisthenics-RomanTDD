package calistenic.chiffre;

public class NombreRomain {
	private String valeur;

	public String obtenirValeur() {
		return valeur;
	}

	public NombreRomain(String valeur) {
		this.valeur = valeur;
	}

	@Override
	public boolean equals(Object object) {
		NombreRomain chiffreRomain = (NombreRomain) object;

		return valeur.equals(chiffreRomain.obtenirValeur());
	}

	public void append(String chiffreRomain) {
		this.valeur += chiffreRomain;

	}
}
