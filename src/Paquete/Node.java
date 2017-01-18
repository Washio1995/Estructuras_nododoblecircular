package Paquete;


public class Node {
	
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