package com.example.reactproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reactproject.model.RegisterModel;
import com.example.reactproject.repository.RegisterRepo;

@Service
public class RegisterService {
    

    private RegisterRepo registerRepo;

    
    public RegisterService(RegisterRepo registerRepo) {
        this.registerRepo = registerRepo;
    }
    public boolean saveRegister(RegisterModel registerModel)
    {
        try {
                registerRepo.save(registerModel);
            
            } 
            catch (Exception e) {
               return false;
            }
            return true;
        
    }
    public RegisterModel getRegister(int id)
    {
        return registerRepo.findById(id).orElse(null);
    }
   

    public List<RegisterModel>getAllRegister()
    {
        return registerRepo.findAll();
    }

    public boolean updateRegister(int id,RegisterModel registerModel)
    {
        if(this.getRegister(id)==null)
        {
            return false;
        }
        try {
                    registerRepo.save(registerModel);
            } 
            catch (Exception e) {
               return false;
            }
            return true;
        
    }

    public boolean deleteRegister(int id)
    {
        if(this.getRegister(id)==null)
        {
            return false;
        }
        try {
                    registerRepo.deleteById(id);
            } 
            catch (Exception e) {
               return false;
            }
            return true;
    }

}
