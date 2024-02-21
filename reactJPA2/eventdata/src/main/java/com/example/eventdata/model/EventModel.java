package com.example.eventdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EventModel {
    
    @Id
    private int id;
    private String userName;
    private String managerName;
    private String eventName;
    private String date;
    private String location;


    
    public EventModel() {
        
    }
    public EventModel(int id, String userName, String managerName, String eventName, String date, String location) {
        this.id = id;
        this.userName = userName;
        this.managerName = managerName;
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
    
    
    
    
    

}    






    
