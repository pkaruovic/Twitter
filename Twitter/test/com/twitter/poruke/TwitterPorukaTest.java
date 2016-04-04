/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import javax.swing.SingleSelectionModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Petar
 *
 */
public class TwitterPorukaTest {
	private TwitterPoruka tp;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tp = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tp = null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnikSveOk() {
		tp.setKorisnik("korisnik");
		
		assertEquals("korisnik", tp.getKorisnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		tp.setKorisnik(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {
		tp.setKorisnik("");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPorukaSveOk() {
		tp.setPoruka("poruka");
		
		assertEquals("poruka", tp.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		tp.setPoruka(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaStringDuziOd140() {
		tp.setPoruka("dfvoidfnvfdovdfanvadfovinadfvnadlfkvnalkvnfdl'kvn'fadklnv'dlfknv'dlknvdl'knv'adklnak'lvn'dalknvadfl'knvadflknvadl'knvalknvaf'dklnvadk'flnvf'dlnvkdlvnfdl'kvn'fadklnv'dlfknv'dlknvdl'knv'adklnak'lvn'dalknvadfl'knvadflknvadl'knvalknvaf'dklnvadk'flnvf'dlnvkdlvnfdl'kvn'fadklnv'dlfknv'dlknvdl'knv'adklnak'lvn'dalknvadfl'knvadflknvadl'knvalknvaf'dklnvadk'flnvf'dlnvkdlvnfdl'kvn'fadklnv'dlfknv'dlknvdl'knv'adklnak'lvn'dalknvadfl'knvadflknvadl'knvalknvaf'dklnvadk'flnvf'dlnvkdl");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		tp.setKorisnik("korisnik");
		tp.setPoruka("poruka");
		
		assertEquals("KORISNIK:korisnik PORUKA:poruka", tp.toString());
	}

}
