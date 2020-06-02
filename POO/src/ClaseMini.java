
//La Clase ClaseMini Hereda de Clase
public class ClaseMini extends Clase {
	int ext = 1;
	
	public ClaseMini(){
		ext = 10;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		System.out.println("Ejecutar Mini");
	}
}
