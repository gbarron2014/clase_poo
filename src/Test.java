/**
*Descripcion: Clase Generica para probar las clases de diagrama.
* Autor: Gabriel Barrón
* Fecha: 09 Marzo 2022
*/
public class Test{

	public static void main(String[] args) {
		Estudiante p1 = new Estudiante("Gabriel",
			 "Barron", 
			"Hombre",
			 "BARG740602HGTRDB07","10103234",
			"Desarrollo Sw");

		System.out.println(p1);
		System.out.println();

		Estudiante p2 = new Estudiante();
		System.out.println(p2);
	}
}