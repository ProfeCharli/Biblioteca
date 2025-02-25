/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Charli
 */
public class Ejemplar {
    private int id_ejemplar;
    private int isbn;
    private enum estado{DISPONIBLE, PRESTADO, DANADO, PERDIDO};
    
    public Ejemplar() {
    }

    public Ejemplar(int id_ejemplar, int isbn) {
        this.id_ejemplar = id_ejemplar;
        this.isbn = isbn;
    }

    public int getId_ejemplar() {
        return id_ejemplar;
    }

    public void setId_ejemplar(int id_ejemplar) {
        this.id_ejemplar = id_ejemplar;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    
}
