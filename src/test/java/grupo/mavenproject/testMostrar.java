package grupo.mavenproject;

import junit.framework.TestCase;

public class testMostrar extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMostrar() {
		App app1 = new App();
		app1.mostrar();
		//debería haber algún tipo de comprobación
	}

}
