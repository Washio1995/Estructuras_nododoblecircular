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
	
		
		 lista.insertaralInicio("Elemento (5)");
		 lista.insertaralInicio("Elemento (4)");
		 lista.insertaralInicio("Elemento (3)");
		 lista.insertaralInicio("Elemento (2)");
		 lista.insertaralInicio("Elemento (1)");
		 lista.insertarFinal("Elemento (FIN)");
	
	
 
		 //NUMERO DE ELEMENTOS
		 
		 lista.imprimirListaFrente();
		 System.out.println("LA LISTA TIENE "+  lista.tamaño()  + " ELEMENTOS");
		 
		 //ELIMINAR ELEMENTOS
	     
		 System.out.println("\nSe remueve el utlimo elemento de la lista");
		 //int borrar = teclado.nextInt();
		 lista.removeLast();
		  
		 System.out.println("\n\n -- LISTA NUEVA --");
		 lista.imprimirListaFrente();
		 System.out.println("LA LISTA TIENE "+  lista.tamaño()  + " ELEMENTOS");
		 
		 //IMPRIMIR LISTA DESDE HEAD
		 
		 System.out.println("\n\n--LISTA DESDE FRENTE--");
		 lista.imprimirListaFrente();
		 System.out.println("LA LISTA TIENE "+  lista.tamaño()  + " ELEMENTOS");
		 
		 //IMPRIMIR LISTA DESDE TAIL
		 System.out.println("\n\n--LISTA DESDE ATRAS--");
		 lista.imprimirListaAtras();
		 System.out.println("LA LISTA TIENE "+  lista.tamaño()  + " ELEMENTOS");
		 
		 
		 //BUSAR POR INDICE
		 //System.out.println("\nIngrese el nombre completo del dato.......");
		 //int localiza2 = teclado.nextString();
		 //lista.buscar(localiza2);
		 
		 
		 
		 //BUSCAR POR DATO
		 System.out.println("\nIngrese la posicion que desea localizar.......");
		 int localiza = teclado.nextInt();
		 lista.localizar(localiza);
		 
		 //VACIAR LISTA
		 lista.vaciar();
		 if (lista.estaVacia())
			 System.out.println("\n -- LISTA VACIA --");
		 System.out.println("LA LISTA TIENE "+  lista.tamaño()  + " ELEMENTOS");

		 
		 
	}
	
	
}
