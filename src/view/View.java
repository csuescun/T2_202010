package view;

import model.logic.Modelo;

public class View 
{
	/**
	 * Metodo constructor
	 */
	public View()
	{

	}

	public void printMenu()
	{
		System.out.println("1. Cargar los datos sobre comparendos");
		System.out.println("2. Buscar grupo de comparendos consecutivos por infraccion");
		System.out.println("3. Buscar últimos N comparendos por infracción");
		System.out.println("4. Exit");
		System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");

	}

	public void printMessage(String mensaje) {

		System.out.println(mensaje);
	}		


}
