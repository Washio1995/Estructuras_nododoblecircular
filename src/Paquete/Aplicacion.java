package Paquete;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) 
	{
		
		SLinkedList lista = new SLinkedList(); 
		Scanner teclado = new Scanner(System.in);
		
	//SE INSTERTA DATOS AL FINAL DE LA LISTA
		 if (lista.estaVacia())
			 
	     System.out.println("--LISTA--");
		 lista.insertaralInicio("Elemento (1)");
		 lista.insertaralInicio("Elemento (2)");
		 lista.insertaralInicio("Elemento (3)");
		 lista.insertaralInicio("Elemento (4)");
		 lista.insertaralInicio("Elemento (5)");
		 
		 //NUMERO DE ELEMENTOS
		 
		 lista.imprimirListaFrente();
		 System.out.println("LA LISTA TIENE "+  lista.tamaño()  + " ELEMENTOS");
		 
		 //ELIMINAR ELEMENTOS
	     
		 System.out.println("\nIngrese la posicion que desea eliminar.......");
		 int borrar = teclado.nextInt();
		 lista.eliminarpos(borrar);
		  
		 System.out.println("\n -- LISTA NUEVA --");
		 lista.imprimirListaFrente();
		 System.out.println("LA LISTA TIENE "+  lista.tamaño()  + " ELEMENTOS");
		 
		 //IMPRIMIR LISTA DESDE HEAD
		 
		 System.out.println("--LISTA DESDE FRENTE--");
		 lista.imprimirListaFrente();
		 
		 //IMPRIMIR LISTA DESDE TAIL
		 System.out.println("--LISTA DESDE ATRAS--");
		 lista.imprimirListaAtras();
		 
		 
		 //BUSAR POR INDICE
		 
		 System.out.println("\nIngrese la posicion que desea localizar.......");
		 int localiza = teclado.nextInt();
		 lista.localizar(localiza);
		 
		 //BUSCAR POR DATO
		 
		 //VACIAR LISTA
		 
		 lista.vaciar();
		 if (lista.estaVacia())
			 System.out.println("\n -- LISTA VACIA --");
		 System.out.println("LA LISTA TIENE "+  lista.tamaño()  + " ELEMENTOS");

		 
		 
	}
	
	
}