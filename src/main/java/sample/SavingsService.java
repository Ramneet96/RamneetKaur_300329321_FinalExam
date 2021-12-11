package sample;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SavingsService {
    private static List<Savings> todos=new ArrayList<Savings>();


    static {
        todos.add(new Savings("112","Zanip Mendez",5000.0,2,"Savings-Deluxe"));
        todos.add(new Savings("113","Geronima Esper",6000.0,5,"Savings-Regular"));
    }

    public List<Savings> retrieveTodos() {
        List<Savings> filteredTodos = new ArrayList<Savings>();
        for (Savings todo : todos) {
            filteredTodos.add(todo);
        }
        return filteredTodos;
    }

    public void addTodo(String custnumber, String custname, Double custdep, int nyears,String savingstype) {
        todos.add(new Savings(custnumber, custname,custdep,nyears,savingstype));
    }


    public void deleteTodo(String id){
        for(int i=0; i<todos.size(); i++){
            if(id.equals(todos.get(i).getSavingscode())){
                todos.remove(i);
                break;
            }
        }
    }

    public Savings retrieve(String id){
        for(Savings todo:todos){
            if(todo.getSavingscode().equals(id)){
                return todo;
            }
        }
        return null;
    }

    public void update(Savings todo){
        todos.remove(todo);
        todos.add(todo);
    }
}
