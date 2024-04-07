package br.com.pedro.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedro.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
