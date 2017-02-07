import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class Pruebas {
	
	int esperado;
	int actual;
	 
	Convertidor conv = mock(Convertidor.class);
	
	@Test
	public void test1() {
		when(conv.convertidor("2,3")).thenReturn(new int[] {2,3});
	    actual= Sumador.sumar("2,3");
		esperado = 5;
		assertEquals("La suma esta bien calculada", esperado, actual);
	}
	
}