package com.example.eventdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventdata.model.EventModel;


@Repository
public interface EventRepo extends JpaRepository<EventModel,Integer>
{
    

}
