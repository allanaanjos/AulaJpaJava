package application;

import aulajpa2.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "carlos da silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "joaquin torres", "joaquin@gmail.com");
		Pessoa p3 = new Pessoa(3, "ana maria", "maria@gmail.com"); 
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
