package Questão1;

public class Livros {
	private String titulo, autor, editora;
	private double numeroPg, preço;
	
	
	public void setTitulo (String titulo) {
		this.titulo = titulo;
		System.out.println("O titulo do livro foi registrado!");
	}
	public void getTitulo () {
		System.out.println(this.titulo);
	}
	public void setAutor (String autor) {
		this.autor = autor;
		System.out.println("O nome do autor foi registrado!");
	}
	public void getAutor () {
		System.out.println(this.autor);
	}
	public void setEditora (String editora) {
		this.editora = editora;
		System.out.println("A editora foi registrado!");
	}
	public void getEditora () {
		System.out.println(this.editora);
	}

}
