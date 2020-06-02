
public class modificadoresAccesos {
	//Accesible desde Cualquier Clase, Paquete, sub-clase, etc.
	public int numero1 = 100;
		
	//Accesible Solo Desde esta Clase, paquete, sub-clase, etc.
	protected int numero2 = 200;
	
	//Solo Accesible a Clases y Paquetes
	int numero = 10;
	
	//Nivel Más Alto de Proteccion, Solo Accesible en esta Clase
	private int numero3 = 300;
	
	
}
