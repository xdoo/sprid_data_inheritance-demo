package com.example.inheritancedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author claus
 */
@Data
@Entity
public class Action extends BaseEntity {
    
    @Column(name = "ACTION_ID")
    private String actionId;
    
    
    @ManyToOne
    private Item item;
}
