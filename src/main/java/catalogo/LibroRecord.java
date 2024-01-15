/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package catalogo;

/**
 *
 * @author aiman
 */
public record LibroRecord(String isbn,String titulo,String autor,
        String editorial,int numPags) {

    public LibroRecord(String isbn, String titulo, String autor, String editorial, int numPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPags = numPags;
    }

    public LibroRecord() {
        this(null,null,null,null,0);
    }

    public static Libro crearLibroPorDefecto(){
        return new Libro(null,null,null,null,0);
    }
    
    public static Libro crearLibroISBN(String isbn){
        return new Libro(isbn,null,null,null,0);
    }
    
    public static Libro copiarLibro(LibroRecord origen){
        return new Libro(origen.isbn,origen.titulo,origen.autor,origen.editorial,origen.numPags);
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumPags() {
        return numPags;
    }
    //constructor parametrizado, todo de la clase de los atributos
    
   
}
