package com.example.inheritancedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author claus
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Documentation extends Action {
    
    @Column(name = "TEXT")
    String text;
    
}
