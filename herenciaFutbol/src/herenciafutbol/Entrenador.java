package herenciafutbol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a053603420b
 */


public class Entrenador extends SeleccionFutbol
{

	private String idFederacion;

        public Entrenador(int id, String Nombre, String Apellidos, int Edad, String idFederacion) {
		super(id, Nombre, Apellidos, Edad);
                this.idFederacion = idFederacion;
                
	}

	public String getIdFederacion() {
        return idFederacion;
		
	}

    // getter y setter
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
    }

	public void dirigirEntreno() {
		
	}
}