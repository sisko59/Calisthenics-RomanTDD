package calistenic.test;

import junit.framework.TestCase;
import calistenic.chiffre.NombreArabe;
import calistenic.chiffre.NombreRomain;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	public void testPour_1_retourne_I() {
		NombreArabe valeur = new NombreArabe(1);

		NombreRomain actual = App.convertie(valeur);
		assertEquals(new NombreRomain("I"), actual);
	}

	public void testPour_2_retourne_II() throws Exception {
		NombreArabe valeur = new NombreArabe(2);
		NombreRomain actual = App.convertie(valeur);

		assertEquals(new NombreRomain("II"), actual);
	}

	public void testPour_3_retourne_III() throws Exception {
		NombreArabe valeur = new NombreArabe(3);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("III").equals(actual));
	}

	public void testPour_4_retourne_IV() throws Exception {
		NombreArabe valeur = new NombreArabe(4);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("IV").equals(actual));
	}

	public void testPour_5_retourne_V() throws Exception {
		NombreArabe valeur = new NombreArabe(5);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("V").equals(actual));
	}

	public void testPour_6_retourne_VI() throws Exception {
		NombreArabe valeur = new NombreArabe(6);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("VI").equals(actual));
	}

	public void testPour_7_retourne_VII() throws Exception {
		NombreArabe valeur = new NombreArabe(7);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("VII").equals(actual));
	}

	public void testPour_8_retourne_VIII() throws Exception {
		NombreArabe valeur = new NombreArabe(8);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("VIII").equals(actual));
	}

	public void testPour_9_retourne_IX() throws Exception {
		NombreArabe valeur = new NombreArabe(9);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("IX").equals(actual));
	}

	public void testPour_10_retourne_X() throws Exception {
		NombreArabe valeur = new NombreArabe(10);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("X").equals(actual));
	}

	public void testPour_11_retourne_XI() throws Exception {
		NombreArabe valeur = new NombreArabe(11);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("XI").equals(actual));
	}

	public void testPour_12_retourne_XII() throws Exception {
		NombreArabe valeur = new NombreArabe(12);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("XII").equals(actual));
	}

	public void testPour_13_retourne_XIII() throws Exception {
		NombreArabe valeur = new NombreArabe(13);
		NombreRomain actual = App.convertie(valeur);

		assertTrue(new NombreRomain("XIII").equals(actual));
	}
}
