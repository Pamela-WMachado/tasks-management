package br.com.pamelamachado.todolist.service;

import br.com.pamelamachado.todolist.entity.Todo;
import br.com.pamelamachado.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    //para poder executar todas as operações do serviço, precisamos declarar o repo criado
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }
    //recebemos uma todo ou task e retornamos a mesma
    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }
    //na listagem não recebemos nada, apenas retornamos
    //mas ao criar um obj Sort, podemos passá-lo no método findAll c/ parametro de pesquisa
    public List<Todo> list() {
        //recurso de Ordenação
        Sort sort = Sort.by( "priority").descending().
                and(Sort.by("name").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
