
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SoldadoTest {
	
	 Soldado s1;

	@BeforeEach
	void setUp() throws Exception {	
		s1 = new Soldado();
	}
	
	@Test
	void testPuedeDispararConBalas() {
		s1.setNumeroBalas(2);
		boolean ResultadoEsperado = true;
		boolean ResultadoObtenido = s1.puedeDisparar();
		
		assertEquals(ResultadoEsperado,ResultadoObtenido);		
	}
	
	@Test
	void testPuedeDispararSinBalas() {
		s1.setNumeroBalas(0);
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = s1.puedeDisparar();
		
		assertEquals(ResultadoEsperado,ResultadoObtenido);		
	}

	@Test
	void testDisparar() {
		s1.disparar(s1);
		boolean ResultadoEsperado = true;
		boolean ResultadoObtenido = s1.isEstaMuerto();
		assertEquals(ResultadoEsperado,ResultadoObtenido);		
		
	}

}
