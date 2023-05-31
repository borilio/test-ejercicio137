package com.inserta;

import java.util.Random;

public class Dado {
	
	//Atributos
	private int caras;
	private int acumulado;
	
	//Constructores
	public Dado() {
		this.caras = 6;
		this.acumulado = 0;
	}
	
	public Dado(int numeroCaras) {
		this.caras = numeroCaras;
		this.acumulado = 0;
	}
	
	
	//Métodos
	public int lanzar() {
		Random aleatorio = new Random();
		//Guardamos la tirada aleatoria
		int tirada = aleatorio.nextInt(1, caras+1);
		//La acumulamos en el atributo
		acumulado += tirada;
		
		return tirada;
	}
	
	public char letra() {
		Random r = new Random();
		// Un char se puede inicializar con un 'A' o con un 65. Así que lo inicializamos con un número aleatorio entre 65 y 90
		return (char) r.nextInt(65, 91);
	}

	public int getCaras() {
		return caras;
	}

	public int getAcumulado() {
		return acumulado;
	}

	public void setCaras(int caras) {
		this.caras = caras;
	}

	@Override
	public String toString() {
		return "Dado{" +
				"caras=" + caras +
				", acumulado=" + acumulado +
				'}';
	}
}
