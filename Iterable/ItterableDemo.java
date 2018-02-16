package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Contact implements Iterable<String> {

	String nom;
	List<String> numbers;
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return numbers.iterator();
	}

	public Contact(String nom, List<String> numbers) {
		super();
		this.nom = nom;
		this.numbers = numbers;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	
	

}

public class ItterableDemo {

	public static void main(String[] args) {
         Contact me = new Contact("tsiry", Arrays.asList("0326830120", "0343977524")); 
         
         for(String n : me){
        	 System.out.println(n);  //affichage de mes 2 numeros
         }
	}

}
