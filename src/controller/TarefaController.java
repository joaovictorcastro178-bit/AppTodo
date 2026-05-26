
package controller;

import model.TarefaModel;
import java.util.ArrayList;

public class TarefaController {

    //lista
    private ArrayList <TarefaModel> lista = new ArrayList<>();
    
    //Adicionar
    public String adicionar(String nome){
       
        //Validar Repetida
        for(TarefaModel t : lista){
            
            if(t.getNome().equalsIgnoreCase(nome)){
                return "Tarefa já cadastrada.";
            }
        }
        
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
        return "Tarefa cadastrada!";
    }
    
    //Método Listar
    public ArrayList<TarefaModel> listar(){
        return lista;
        
    }
    
    //Remover Tarefa
    public void remover(int indice){
        lista.remove(indice);
        
    }
    
    //Total Tarefas
    public int totalTarefa(){
        return lista.size();
    }
}
