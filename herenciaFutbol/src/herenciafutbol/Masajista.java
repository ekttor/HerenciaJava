/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafutbol;

/**
 *
 * @author a053603420b
 */
public class Masajista extends SeleccionFutbol
{

	private String Titulacion;
	private int aniosExperiencia;

        public Masajista(int id, String Nombre, String Apellidos, int Edad, String Titulacion, int aniosExperiencia) {
		super( id, Nombre, Apellidos, Edad);
                this.Titulacion = Titulacion;
                this.aniosExperiencia = aniosExperiencia;
	}

	// getter y setter

	public void darMasaje() {
		
	}
}