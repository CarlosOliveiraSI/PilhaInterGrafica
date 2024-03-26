

import java.util.List;
import java.util.ArrayList;
import org.w3c.dom.Node;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Pilha {
    private List<Recorde> elemento;
    private int topo;

    public List<Recorde> getElemento() {
        return elemento;
    }
    
    
    public Pilha(){
        this.elemento = new ArrayList<>();
        this.topo = -1;
    }
    
    
    public void push(Recorde recorde){
        if(isEmpty() || recorde.getTempoRecordista() > elemento.get(topo).getTempoRecordista()){
            elemento.add(recorde);
            topo++;
        }
    }
    
    public Recorde pop() {
        if (!isEmpty()) {
            Recorde recordeRemovido = elemento.remove(topo);
            topo--;
            return recordeRemovido;
        }
        return null;
    }
    
    public Recorde peek() {
        if (!isEmpty()) {
            return elemento.get(topo);
        }
        return null; 
    }
    
    public boolean isEmpty(){
        return topo == -1;
    }
    
    public void limpar(){
        elemento.clear();
        topo = -1;
    }

 
}
