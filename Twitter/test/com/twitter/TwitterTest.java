/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

/**
 * @author Petar
 *
 */
public class TwitterTest {
	private Twitter t;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		t = new Twitter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		t = null;
	}

	/**
	 * Test method for {@link com.twitter.Twitter#vratiSvePoruke()}.
	 */
	@Test
	public void testVratiSvePoruke() {
		assertEquals(new LinkedList<TwitterPoruka>(), t.vratiSvePoruke());
	}

	/**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	public void testUnesi() {
		t.unesi("Petar", "poruka");
		
		LinkedList<TwitterPoruka> lista = t.vratiSvePoruke();
		
		if(!(lista.getLast().getKorisnik().equals("Petar") && lista.getLast().getPoruka().equals("poruka"))){
			fail();
		}
	}
	
	@Test
	public void testUnesi1() {
		t.unesi("Karuovic", "poruka");
		t.unesi("Petar", "poruka");
		
		LinkedList<TwitterPoruka> lista = t.vratiSvePoruke();
		
		if(!(lista.getLast().getKorisnik().equals("Petar") && lista.getLast().getPoruka().equals("poruka"))){
			fail();
		}
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testUnesiNull() {
		t.unesi(null, "");
		
		LinkedList<TwitterPoruka> lista = t.vratiSvePoruke();
		
		if(!(lista.getLast().getKorisnik().equals("Petar") && lista.getLast().getPoruka().equals("poruka"))){
			fail();
		}
	}

	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test
	public void testVratiPoruke() {
		if(!(t.vratiPoruke(10, "Petar") instanceof TwitterPoruka[])){
			fail();
		}
		
	}
	
	@Test
	public void testVratiPorukeSveOk() {
		t.unesi("Petar", "poruka");
		t.unesi("Petar", "poruka");
		t.unesi("Petar", "poruka");
		t.unesi("Petar", "poruka");
		
		TwitterPoruka[] niz = t.vratiPoruke(3, "poruka");
		
		if(!(niz instanceof TwitterPoruka[])){
			fail();
		}
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNull() {
		t.vratiPoruke(10, null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukePrazanString() {
		t.vratiPoruke(10, "");
	}

}
