
package controller;

import model.TarefaModel;
import java.util.ArrayList;

public class TarefaController {

    //lista
    private ArrayList <TarefaModel> lista = new ArrayList<>();
    
    //Adicionar
    public void adicionar(String nome){
       
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
    }
    //Método Listar
    public ArrayList<TarefaModel> listar(){
        return lista;
    }
    
}
