package Testes;

import myqueues.LinkedPriorityQueue;
import myqueues.PriorityQueue;

public class testes {

    public static void main(String[] args) {
        Motos moto_1 = new Motos(1, "BMW");
        Motos moto_2 = new Motos(2, "Harley-Davidson");
        Motos moto_3 = new Motos(3, "Yamaha");
        
        LinkedPriorityQueue<Motos> motos1 = new LinkedPriorityQueue<>();
        LinkedPriorityQueue<Motos> motos2 = new LinkedPriorityQueue<>();
        
        if (motos1.isEmpty()) System.out.println("A Fila Prioritária 'motos1' está vazia!");
        else System.out.println("A Fila Prioritária 'motos1' não está vazia!");
        
        
        motos1.insert(moto_1);
        motos1.insert(moto_2);
        
        
        if (motos2.isEmpty()) System.out.println("A Fila Prioritária 'motos2' está vazia!");
        else System.out.println("A Fila Prioritária 'motos2' não está vazia!");
        
        
        motos2.insert(moto_2);
        motos2.insert(moto_1);
        motos2.insert(moto_3);
        
        
        System.out.println("Verificar se a Fila Prioritária 'motos1' contém o elemento 'BMW");
        if (motos1.contains(moto_1)) System.out.println("A Fila Prioritária contêm o " + moto_1.toString());
        
        System.out.println("Verificar se a Fila Prioritária 'motos2' contém o elemento 'Yamaha");
        if (motos2.contains(moto_3)) System.out.println("A Fila Prioritária contêm o " + moto_3.toString());
        
        System.out.println("Tamanho da Fila Prioritária 'motos1': " + motos1.size() + " elementos.");
        System.out.println("Tamanho da Fila Prioritária 'motos2': " + motos2.size() + " elementos.");
        
        System.out.println("Mostrar o elemento mais prioritário da Lista Prioritária 'motos1'. ");
        System.out.println(motos1.min());
        
        System.out.println("Eliminar o elemento mais prioritário da Lista Prioritária 'motos1'. ");
        System.out.println(motos1.removeMin());
        
        System.out.println("Mostrar o elemento mais prioritário da Lista Prioritária 'motos2'. ");
        System.out.println(motos2.min());
        
        System.out.println("Eliminar o elemento mais prioritário da Lista Prioritária 'motos2'. ");
        System.out.println(motos2.removeMin());
        
        System.out.println("Fila Prioritária 'motos1' contém todos os elementos da Fila Prioritária 'motos2'? ");
        System.out.println(motos1.containsAll(motos2));
        
        System.out.println("Adicionar todos os elementos da Fila Prioritária 'motos2' a 'motos1'.");
        motos1.addAll(motos2);
        System.out.println(motos1.size());
        
        System.out.println("Remover todos os elementos da Fila Prioritária 'motos1' com prioridades iguais às dos elementos contidos na fila específica 'motos2'.");
        motos2.removeAll(motos1);
        System.out.println(motos2.size());
        
        System.out.println("Cópia da Fila Prioritária 'motos1':");
        motos1.clone();
        
        System.out.println("Clear Fila Prioritária 'motos1'");
        motos1.clear();
        System.out.println(motos1.size());
        
        System.out.println("Clear Fila Prioritária 'motos2'");
        motos2.clear();
        System.out.println(motos2.size());
    }
    
}
