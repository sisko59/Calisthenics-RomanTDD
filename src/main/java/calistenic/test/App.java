package calistenic.test;

import calistenic.chiffre.NombreArabe;
import calistenic.chiffre.NombreRomain;

/**
 * Hello world!
 *
 */
public class App {

	public static NombreRomain convertie(NombreArabe nombreArabe) {
		NombreRomain result = new NombreRomain("");
		NombreArabe nombreEnCours = new NombreArabe(nombreArabe);
		if (nombreEnCours.obtenirValeur() > 9) {
			result.append("X");
			nombreEnCours.moins(10);
		}

		if (nombreEnCours.obtenirValeur() == 9) {
			result.append("IX");
			return result;
		}

		if (nombreEnCours.obtenirValeur() > 4) {
			result.append("V");
			nombreEnCours.moins(5);
		}

		if (nombreEnCours.obtenirValeur() == 4) {
			result.append("IV");
			return result;
		}
		for (int i = 0; i < nombreEnCours.obtenirValeur(); i++) {
			result.append("I");
		}

		return result;
	}
}
