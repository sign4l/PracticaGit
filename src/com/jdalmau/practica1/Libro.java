package com.jdalmau.practica1;

import java.util.ArrayList;

public class Libro {
	
	private static ArrayList<Libro> listaLibros;
	private int codLibro;
	private String titulo;
	private String autor;
	private String editorial; 
	
// Constructor

	public Libro(int codLibro, String titulo, String autor, String editorial)
	{
		this.codLibro = codLibro;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}
}
