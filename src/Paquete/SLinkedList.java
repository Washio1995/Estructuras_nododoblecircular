package Paquete;

import java.util.NoSuchElementException;

public class SLinkedList {
	
	
	protected Node head;
	protected long size;
	protected Node tail;
	
	
	private class Node {
		
		 String element;
		 Node next;
		 Node prev;
		
	    public Node (String element, Node next, Node prev){
	    	this.element = element;
	        this.next = next;
	        this.prev = prev;
	    }
	    
		
		public String getElement() { return element;}
		
		public Node getNext() {return next;}
		
		public Node getPrev() {return prev;}
		
		public void setElement(String newElem)  { element = newElem;}
		
		public void setNext( Node newNext)  {next= newNext;}
		
	}
	
	
	public void SLinkedlist() 
	{
		head = null;
	size= 0; 

	}
	 public boolean estaVacia(){
		 return head==null;	 
	 }

	 
	 //INGRESAR DATOS
	 
	 public void insertaralInicio(String element){
		 
		 Node auxiliar = new Node(element,head,null);
		 if (head != null) {head.prev = auxiliar;}
		 head = auxiliar;
	     if(tail == null){tail = auxiliar;}
	     }
	     
	 
	 public void insertarFinal(String element){

	     Node auxiliar = new Node(element, null, tail);
	     if (tail!=null) {head.prev = auxiliar;}
	     head = auxiliar;
	     if(head == null){tail = auxiliar;}
	     
	 }
	 
	 
	//VACIAR LA LISTA
	 
	 
	 public  void vaciar(){
		  head=null;
	 }
	 
	 //CONTADOR DE ELEMENTOS 
	 
	 public int tamaño()
	 {
	     Node auxiliar;
	     size=0;
	     auxiliar = head;

	     while(auxiliar != null)
	     {
	         size++;
	         auxiliar = auxiliar.getNext();
	     }
	     return (int) size;

	 }
	 
	 
	 // LOCALIZAR UN INDICE DENTRO DE LA LISTA
	 
	public void localizar(int posicion){
		 
	     Node auxiliar= head;
	     int contador=1;

	     if(posicion<1 || posicion>tamaño()){
	         System.out.println("no existe esa posicion");
	     }else{
	         while(auxiliar!=null){
	             if (posicion == contador){
	                 System.out.println("En la posicion (" + posicion + ") se encuentre = "+auxiliar.getElement());
	                 auxiliar=null;
	                 }
	                 
	             else{                 
	                 auxiliar=auxiliar.getNext();
	                 contador++;
	             }
	         }
	     }
	 }
	
	// ELIMINAR INDICE DENTRO DE LA LISTA
	
	 public void eliminarpos(int posicion){
		 
	     Node auxiliar= head;
	     Node anterior=null;
	     int contador=1;

	     if(posicion<1 || posicion>tamaño()){
	         System.out.println("no existe esa posicion");
	     }else{
	         while(auxiliar!=null){
	             if (posicion == contador){
	                 if (anterior==null){
	                     head = head.getNext();
	                 }else {
	                     anterior.setNext(auxiliar.getNext());
	                 }
	                 auxiliar=null;
	             }else{
	                 anterior=auxiliar;
	                 auxiliar=auxiliar.getNext();
	                 contador++;
	             }
	         }
	     }
	 }
	 
	 
	 //RECORRER LA LSITA DESDE HEAD
	 
	 public void imprimirListaFrente(){
	     Node auxiliar= head;
	     while(auxiliar!=null){
	         System.out.println(auxiliar.getElement());
	         auxiliar=auxiliar.getNext();
	     }
	     
	 }
	 
	 
	 //RECORRER LA LISTA DESDE TAIL 
	 
	 
	 public void imprimirListaAtras(){
         
	        Node auxiliar = tail;
	        while(auxiliar != null){
	            System.out.println(auxiliar.getElement());
	            auxiliar = auxiliar.getPrev();
	        }
	    }
	
	//REMOVER ULTIMO
	     
	 
	    public String removeLast() {
	        if (size == 0) throw new NoSuchElementException();
	        Node tmp = tail;
	        tail = tail.prev;
	        tail.next = null;
	        System.out.println("deleted: "+tmp.element);
	        return tmp.element;
	    }
	 
	//REMOVER PRIMERO
	    
		 public String removeFirst() {
		        if (size == 0) throw new NoSuchElementException();
		        Node tmp = head;
		        head = head.next;
		        head.prev = null;
		        System.out.println("deleted: "+tmp.element);
		        return tmp.element;
		    }

	
}
