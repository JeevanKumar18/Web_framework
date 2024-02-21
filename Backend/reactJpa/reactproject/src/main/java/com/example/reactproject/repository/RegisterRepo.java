package com.example.reactproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reactproject.model.RegisterModel;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterModel,Integer>
{
    
}
