package www.unlam.edu.ar;

import org.junit.Assert;
import org.junit.Test;

public class TriánguloTest
{

	@Test
	public void testAreaDelTriangulo() 
	{
		Triángulo miAreaTriangulo = new Triángulo();
		Double areaTrianguloEsperada=1586.965;
		
		Double areaTrianguloObtenida=miAreaTriangulo.areaTriangulo(50.3,63.1);
		
		Assert.assertEquals(areaTrianguloEsperada, areaTrianguloObtenida);
		
		miAreaTriangulo=null;
	}
}
