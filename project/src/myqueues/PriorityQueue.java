package myqueues;

/**
 * Interface a ser usada no segundo trabalho prático de AED.
 */


import java.util.Iterator;

/**
 * Interface para filas prioritárias.
 * A prioridade dos elementos é estabelecida pela relação de grandeza entre eles, 
 * considerando-se o menor de todos o mais prioritário.
 * @author Paulo Gouveia
 * @param <E> tipo de elemento a colecionar.
 * @since 22/05/2018
 */
public interface PriorityQueue<E> extends Iterable<E>{ 
    
    /**
     * Devolve um iterador para os elementos da fila.
     * @return um iterador para os elementos da fila, referenciando, desde logo, o primeiro deles.
     */
    @Override
    Iterator<E> iterator();
    
    /**
     * Devolve a quantidade de elementos contidos na fila.
     * @return número total de elementos da fila.
     */
    int size();
    
    /**
     * Verifica se a fila não contém elementos.
     * @return true se a fila estiver vazia.
     */
    boolean isEmpty();
    
    /**
     * Verifica se a fila contém o elemento específico, ou mais precisamente,
     * se a fila atual contém um elemento com a mesma prioridada do elemento específico.
     * @param e elemento cuja presença na fila é verificada.
     * @return true se a prioridade do elemento específico estiver presente na fila.
     */
    boolean contains(E e);
    
    /**
     * Adiciona um novo elemento à fila.
     * @param e elemento a adicionar à fila.
     */
    void insert(E e);
    
    /**
     * Remove da fila o elemento mais prioritário, ou seja, o menor de todos.
     * @return o elemento mais prioritário, ou null caso a fila esteja vazia.
     */
    E removeMin();
           
    /**
     * Devolve, sem remover, o elemento mais prioritário da fila.
     * @return o elemento mais prioritário, ou null caso a fila esteja vazia.
     */
    E min();

    /**
     * Verifica se a fila atual contém todos os elementos (todas as prioridades) de uma outra fila.
     * @param other fila a verificar se as prioridades de todos os seus 
     * elementos estão contidas na fila atual.
     * @return true se a fila atual contiver as prioridades de todos os elementos da fila específica.
     */
    boolean containsAll(PriorityQueue<E> other);    
    
    /**
     * Adiciona à fila atual todos os elementos contidos numa outra fila.
     * @param other fila prioritária que tem os elementos a serem adicionados à fila atual.
     */
    void addAll(PriorityQueue<E> other);
      
    /**
     * Remove da fila atual todos os elementos com prioridades iguais às dos elementos
     * contidos na fila específica.
     * @param other fila prioritária com os elementos (prioridades) a serem removidos da fila atual.
     */
    void removeAll(PriorityQueue<E> other);
          
    /**
     * Remove todos os elementos da fila, deixando-a vazia.
     */
    void clear();
    
    /**
     * Devolve uma string com todos os elementos colecionados.
     * @return uma string com os elementos colecionados.
     */ 
    @Override
    String toString();
    
    /**
     * Verifica se o objeto específico é uma fila igual à fila atual. Duas filas
     * são consideradas iguais se os seus elementos tiverem exatamente as mesmas prioridades.
     * @param obj objeto a ser comparado com a fila atual.
     * @return true se os objetos forem considerados iguais.
     */ 
    @Override
    boolean equals(Object obj);
    
    /**
     * Devolve uma cópia fila atual, sem clonagem dos objetos colecionados.
     * @return uma fila prioritária com os mesmos elementos da fila atual.
     */ 
    PriorityQueue<E> clone(); 
}
 