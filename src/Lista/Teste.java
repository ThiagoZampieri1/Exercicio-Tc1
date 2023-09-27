package Lista;

import org.junit.Test;

import junit.framework.TestCase;

public class Teste extends TestCase{
	@Test
	public void testAcenderAsDuasLampadas() {
		int ia = 0;
		int ib = 0;
		int fa = 1;
		int fb = 1;
		
		int retornoEsperado = 1;
		
		int retorno = Main.lampadas(ia, ib, fa, fb);
		assertEquals(retornoEsperado, retorno);
	}
	
}
