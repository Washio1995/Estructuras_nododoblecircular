import java.util.NoSuchElementException;

public class SLinkedList {
	
	
	protected Node head; //primero
	protected long size;
	protected Node tail; //ultimo
	

	
	public void SLinkedlist() 
	{
		head = null;
		tail = null;
	    size= 0; 
	}

	
	public boolean estaVacia(){
		 return head==null;	 
	 }

	 
	 //INGRESAR DATOS
	 
	 public void insertaralInicio(String element){
		 
		 // 21 <-- 1--> <-- 2 -- > < -- 3 --> 21
		 
		 Node auxiliar = new Node(element,head,null);
		 if (head == null) {
	     head = auxiliar;
	     head.next = auxiliar; 
		 auxiliar.prev= tail;
		 tail=auxiliar;
		 }
		 else{
	     head.prev = auxiliar;
	     auxiliar.next = head;
	     auxiliar.prev=tail;
	     //head.next = auxiliar;
	     head=auxiliar;
	     head.prev=tail;
	     
		 }
	     }
	     
	 
	 public void insertarFinal(String element){

	     Node auxiliar = new Node(element, tail, null);
	     if(head == null){
	    	 tail = auxiliar;
		     tail.next = auxiliar; //circulo 
			 auxiliar.prev= head;
			 head=auxiliar;
	     }  else {
	    	 tail.next = auxiliar;
			 auxiliar.next= head;
			 auxiliar.prev = tail;
			 tail = auxiliar;
			 head.prev = tail;  //circular
			 
	    	 
	     }
	     
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
		 
	     Node actual = head;
	     do{
	    	 System.out.println(actual.element);
	    	 actual = actual.next;
	     } while(actual!=head);
	     
	 }
	 
	 
	 //RECORRER LA LISTA DESDE TAIL 
	 
	 
	 public void imprimirListaAtras(){
         
	        Node actual = tail;
	        do {
	        	System.out.println(actual.element);
	        	actual = actual.prev;
	        } while(actual!=tail);
	    }
	
	//REMOVER ULTIMO
	     
	 
	    public String removeLast() {
	        if (size == 0) throw new NoSuchElementException();
	        Node tmp = tail;
	        tail = tail.prev;
	        tail.next = null;
	        size--;
	        System.out.println("deleted: "+tmp.element);
	        return tmp.element;
	    }
	 
	//REMOVER PRIMERO
	    
		 public String removeFirst() {
		        if (size == 0) throw new NoSuchElementException();
		        Node tmp = head;
		        head = head.next;
		        head.prev = null;
		        size--;
		        System.out.println("deleted: "+tmp.element);
		        return tmp.element;
		    }

	
}
