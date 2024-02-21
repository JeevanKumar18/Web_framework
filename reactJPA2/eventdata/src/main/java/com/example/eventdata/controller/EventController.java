package com.example.eventdata.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventdata.model.EventModel;
import com.example.eventdata.service.EventService;


@RestController
public class EventController {
    
    private EventService eventService;
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

   

    @PostMapping("/event")
    public ResponseEntity<EventModel>postProduct(@RequestBody EventModel eventModel)
    {
        if(eventService.saveProduct(eventModel)==true)
        {
            return new ResponseEntity<>(eventModel,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(eventModel,HttpStatus.INTERNAL_SERVER_ERROR);
        
    }

    @GetMapping("/event/{id}")
    public ResponseEntity<EventModel> getProduct(@PathVariable("id") int id)
    {
        EventModel p=eventService.getProduct(id);
        if(p==null)
        {
            return new ResponseEntity<>(p,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(p,HttpStatus.OK);
       
        
    }

    @GetMapping("/events")
    public ResponseEntity<List> getProducts()
    {
        List<EventModel>b=eventService.getAllProduct();
        if(b.size()==0)
        {
            return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(b,HttpStatus.OK);
    }

    @PutMapping("event/{id}")
    public ResponseEntity<EventModel> putMethodName(@PathVariable("id") int id, @RequestBody  EventModel eventModel)
    {
        if(eventService.updateProduct(id,eventModel)==true)
        {
            return new ResponseEntity<>(HttpStatus.OK);
            
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("event/{id}")
    public ResponseEntity<EventModel>delete(@PathVariable int id)
    {
        if(eventService.deleteProduct(id)==true)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
