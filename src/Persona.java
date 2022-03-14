/**
* Descripción: Define a la clase Persona dentro del contexto UTNG.
* Autor: Gabriel Barrón
* Fecha: 09 Marzo 2022
*/
public class Persona extends Object{
	//Atributos de la clase
	public String nombre;
	public String apellidos;
	public String genero;
	public String curp;

	//Constructor Default
	public Persona() {
		this.nombre = "";
		this.apellidos = "";
		this.genero = "Mujer";
		this.curp = "";
	}

	//Contructor con todos los valores
	public Persona(String n, String a, String g, String c) {
		this.nombre = n;
		this.apellidos = a;
		this.genero = g;
		this.curp = c;
	}

	/*
	* Método que indica lo que se quiere saber de un objeto.
	*/
	public String toString() {
		return "Nombre: " + this.nombre +
			"\nApellidos: " + this.apellidos + 
			"\nGenero: " + this.genero +
			"\nCURP: " + this.curp;
	}		
}