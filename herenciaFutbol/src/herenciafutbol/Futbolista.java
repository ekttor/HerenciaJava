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
public class Futbolista extends SeleccionFutbol
{
	private int dorsal;
	private String demarcacion;

        public Futbolista(int id, String Nombre, String Apellidos, int Edad, String demarcacion, int dorsal) {
		super (id, Nombre, Apellidos, Edad);
	this.dorsal= dorsal;
        this.demarcacion = demarcacion;
        

                }

	// getter y setter

	public void jugarPartido() {
		
	}

	public void entrenar() {
		
	}
}