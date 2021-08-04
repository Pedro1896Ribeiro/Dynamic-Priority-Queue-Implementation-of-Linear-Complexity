/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

public class Motos implements Comparable<Motos>{
    private int id;
    private String marca;
    
    public Motos(int i, String Marca) {
        id = i;
        marca = Marca;
    }

    @Override
    public int compareTo(Motos o) {
        if (this.id < o.id) return -1;
        if (this.id > o.id) return 1;
        else return 0;
    }
    
    @Override
    public String toString() {
        return "Moto " + marca + " e com o ID: " + id;
    }
}
