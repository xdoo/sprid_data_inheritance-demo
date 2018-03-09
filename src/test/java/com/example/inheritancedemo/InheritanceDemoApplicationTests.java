package com.example.inheritancedemo;

import com.example.inheritancedemo.model.Action;
import com.example.inheritancedemo.model.Documentation;
import com.example.inheritancedemo.model.Inspection;
import com.example.inheritancedemo.model.Item;
import com.example.inheritancedemo.repos.ActionRepository;
import com.example.inheritancedemo.repos.DocumentationRepository;
import com.example.inheritancedemo.repos.InspectionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.inheritancedemo.repos.ItemRepository;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class InheritanceDemoApplicationTests {

    @Autowired
    InspectionRepository inspectionRepo;
    
    @Autowired
    DocumentationRepository documentationRepo;
    
    @Autowired
    ItemRepository itemRepo;
    
    @Autowired
    ActionRepository actionRepo;
    
    
    @Test
    public void contextLoads() {
    }

    @Test
    public void testDB() {       
        
        // save the entities
        Documentation documentation = this.documentationRepo.save( new Documentation("neue Doku!"));
        Inspection inspection = this.inspectionRepo.save(new Inspection("Alles ok. Wohnung wieder vermietet."));
        
        Item item = new Item("4711", Lists.newArrayList(documentation, inspection));
        documentation.setItem(item);
        inspection.setItem(item);
        this.itemRepo.save(item);
        
        assertEquals(1, this.documentationRepo.count());
        assertEquals(1, this.inspectionRepo.count());
        assertEquals(2, this.actionRepo.count());
        assertEquals(1, this.itemRepo.count());
        
        log.info("loading item again...");
        
        Optional<Item> finding = this.itemRepo.findById(item.getOid());
        assertTrue(finding.isPresent());
        assertEquals(2, finding.get().getActions().size());
    }

}
