package com.example.inheritancedemo.repos;

import com.example.inheritancedemo.model.Documentation;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author claus
 */
public interface DocumentationRepository extends CrudRepository<Documentation, UUID>{
    
}
