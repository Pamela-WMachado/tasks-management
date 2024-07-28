package br.com.pamelamachado.todolist.repository;

import br.com.pamelamachado.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
