package com.openwebinars.beans;

import lombok.Getter;
import lombok.Setter;

public class Motor {
			
	@Getter
	@Setter
	private double cilindrada;
	@Getter
	@Setter
	private Culata culata;
	@Getter
	@Setter
	private Bloque bloque;
	@Getter
	@Setter
	private Carter carter;
	
	
	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Motor(double cilindrada, Culata culata, Bloque bloque, Carter carter) {
		super();
		this.cilindrada = cilindrada;
		this.culata = culata;
		this.bloque = bloque;
		this.carter = carter;
	}


	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", culata=" + culata + ", bloque=" + bloque + ", carter=" + carter
				+ "]";
	}


	
			
	
	
}