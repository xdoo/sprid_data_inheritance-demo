package com.example.inheritancedemo.repos;

import com.example.inheritancedemo.model.Item;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author claus
 */
public interface ItemRepository extends CrudRepository<Item, UUID> {

    @Override
    @EntityGraph(attributePaths = { "actions" }, type = EntityGraph.EntityGraphType.FETCH)
    public Optional<Item> findById(UUID id);
    
}
