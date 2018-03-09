package com.example.inheritancedemo.repos;

import com.example.inheritancedemo.model.Action;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author claus
 */
public interface ActionRepository extends CrudRepository<Action, UUID>{
   
    
}
