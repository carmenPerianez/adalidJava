package salud;

import edu.femxa.val.imc.IMC;
import edu.femxa.val.imc.Persona;
import edu.femxa.val.imc.TipoIMC;

public class SaludMain {

	public static void main(String[] args) {
		Persona persona = new Persona(60d, 1.50d);
		double imcNumerico = IMC.calcula(persona);
		TipoIMC tipo = TipoIMC.traduceIMC(imcNumerico);
		System.out.println(tipo);
		
	}

}
