package com.twitter.poruke;

/**
 * Predstavlja tviter poruku, ima atribute: korisnik i poruka
 * @author Petar
 *
 */
public class TwitterPoruka {
	/**
	 * Ime korisnika
	 */
	private String korisnik;
	/**
	 * Sadrzaj poruke
	 */
	private String poruka;

	/**
	 * Vraca vrednost atributa korisnik
	 * @return String
	 */
	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * Postavlja vrednost atributa korisnik na zadatu vrednost
	 * @param korisnik - predstavlja String sa nazivom korisnika
	 * @throws RuntimeException
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * Vraca vrednost atributa poruka
	 * @return String
	 */
	public String getPoruka() {
		return poruka;
	}

	/**
	 * Postavlja vrednost atributa poruka na zadatu vrednost
	 * @param poruka - predstavlja String sa porukom
	 * @throws RuntimeException
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * Umesto adrese objekta vraca vrednosti atributa korisnik i poruka
	 * @return String
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
