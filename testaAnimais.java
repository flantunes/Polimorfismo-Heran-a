package PolimorfismoHeranca;

import PolimorfismoHeranca.cachorro.Cachorro;
import PolimorfismoHeranca.cavalo.Cavalo;
import PolimorfismoHeranca.preguica.Preguica;

public class testaAnimais {

	public static void main(String[] args) {
		
		Cachorro mussa = new Cachorro();
		Cavalo fly = new Cavalo();
		Preguica soneca = new Preguica();

		mussa.setNome("Mussarela");
		
		fly.setNome("Fly");
		soneca.setNome("Soneca");

		mussa.setIdade(5);
		fly.setIdade(12);
		soneca.setIdade(8);

		mussa.setSom("Auauauauaa");
		fly.setSom("ihihihhih");
		soneca.setSom("ZZzzzzzzz");

		System.out.println("Carlos: " + mussa.correr() + " som: " + mussa.emitirSom());
		System.out.println("Carlitos: " + fly.correr() + " som: " + fly.emitirSom());
		System.out.println("Carlão: " + soneca.subirEmArvore() + " som: " + soneca.emitirSom());
		
	}
}




	
