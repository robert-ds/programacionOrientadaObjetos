
public abstract class Clase {
	//Atributos
	int ext;
	boolean extras;
	
	//Constructor
	public Clase(){
		ext = 99;
		extras = true;
	}
	
	//Sobrecargando Constructor
	public Clase(int n, boolean boo){
		ext += n;
		extras = boo;
	}
	
	public abstract void ejecutar();
	
	//M�todos
	public void caminar(){
		ext = 10;
		System.out.println(ext);
	}
	
	//M�todo Sobrecargado
	public void caminar(int numero){
		ext += numero;
	}
	
	//M�todo
	public void muchosSaludos(){
		int i;
		
		for(i = 0; i < 5; i++ ){
			System.out.println("Hola Se�or " + i);
		}
	}
	
	
}
