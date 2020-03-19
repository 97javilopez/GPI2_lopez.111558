package es.unavarra.gpi2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void palabraConsola(){
		String lectura = GPIA111558.getter(); 
		assertTrue(lectura.equals("hola"));
	}
}
