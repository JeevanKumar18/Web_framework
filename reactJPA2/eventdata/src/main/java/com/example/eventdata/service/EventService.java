package com.example.eventdata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.eventdata.model.EventModel;
import com.example.eventdata.repository.EventRepo;


@Service
public class EventService {
    
    
    private EventRepo eventRepo;
    
    public EventService(EventRepo eventtRepo) {
        this.eventRepo = eventtRepo;
    }

  
    public boolean saveProduct(EventModel eventModel)
    {
        try {
                eventRepo.save(eventModel);
            
            } 
            catch (Exception e) {
               return false;
            }
            return true;
        
    }
    public EventModel getProduct(int id)
    {
        return eventRepo.findById(id).orElse(null);
    }
   

    public List<EventModel>getAllProduct()
    {
        return eventRepo.findAll();
    }

    public boolean updateProduct(int id,EventModel eventModel)
    {
        if(this.getProduct(id)==null)
        {
            return false;
        }
        try {
                    eventRepo.save(eventModel);
            } 
            catch (Exception e) {
               return false;
            }
            return true;
        
    }

    public boolean deleteProduct(int id)
    {
        if(this.getProduct(id)==null)
        {
            return false;
        }
        try {
                    eventRepo.deleteById(id);
            } 
            catch (Exception e) {
               return false;
            }
            return true;
    }

    
}
