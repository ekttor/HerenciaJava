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

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

	// getter y setter

	public void darMasaje() {
		
	}
}