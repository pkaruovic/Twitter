package com.twitter.poruke;

public class TwitterPoruka {
	/**
	 * ime korisnika
	 */
	private String korisnik;
	/**
	 * sadrzaj poruke
	 */
	private String poruka;

	/**
	 * @return vraca vrednost atributa korisnik
	 */
	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * postavlja vrednost atributa korisnik na zadatu vrednost
	 * @param korisnik
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * @return vraca vrednost atributa poruka
	 */
	public String getPoruka() {
		return "poruka";
	}

	/**
	 * postavlja vrednost atributa poruka na zadatu vrednost
	 * @param poruka
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || this.poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * @return vraca String sa vrednostima korisnik i poruka
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
