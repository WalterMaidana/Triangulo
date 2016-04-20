package www.unlam.edu.ar;

import org.junit.Assert;
import org.junit.Test;

public class Tri�nguloTest
{

	@Test
	public void testAreaDelTriangulo() 
	{
		Tri�ngulo miAreaTriangulo = new Tri�ngulo();
		Double areaTrianguloEsperada=1586.965;
		
		Double areaTrianguloObtenida=miAreaTriangulo.areaTriangulo(50.3,63.1);
		
		Assert.assertEquals(areaTrianguloEsperada, areaTrianguloObtenida);
		
		miAreaTriangulo=null;
	}
}
