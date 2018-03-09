package com.example.inheritancedemo.model;

import com.google.common.collect.Lists;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
public class Item extends BaseEntity {
    
    @Column(name = "ITEM_ID")
    private String itemId;
    
    @OneToMany(mappedBy = "item")
    private List<Action> actions = Lists.newArrayList();
    
}
