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
public class Inspection extends Action {
    
    @Column(name = "RESULT")
    String result;
    
}
