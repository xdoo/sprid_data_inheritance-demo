package com.example.inheritancedemo.repos;

import com.example.inheritancedemo.model.Inspection;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author claus
 */
public interface InspectionRepository extends CrudRepository<Inspection, UUID> {
    
}
