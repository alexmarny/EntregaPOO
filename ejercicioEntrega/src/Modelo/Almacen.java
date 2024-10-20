package Modelo;

public class Almacen {

	private Libros[] libros;
	private Autor[] autores;

	public Almacen(int N) {
		libros = new Libros[N];
		autores = new Autor[N];
		
	}

	public Libros[] getLibros() {
		return libros;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

	public void setLibro(Libros libro, Autor autor) {
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libros[i] = libro;
				autores[i] = autor;
				break;
			}
		}

		if (libros[libros.length - 1] != null) {
			System.out.println("No se pueden añadir más libros");
		}
	}

	public Autor getAutor(Libros libro) {
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null && libros[i].equals(libro)) {
				return autores[i];
			}
		}
		return null;
	}

	





}
