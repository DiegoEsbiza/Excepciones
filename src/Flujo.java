
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio del Main");
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fin del Main");
	}

	public static void m1() throws MiException {
		System.out.println("Inicio del metodo 1");
		
		m2();
		
		System.out.println("Fin metodo 1");
		
	}

	public static void m2() throws MiException {
		
		System.out.println("Inicio del metodo 2");
		
		throw new MiException("Mi excepcion fue lanzada");
	}
}
