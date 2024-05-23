package com.restaurant.restaurant.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaurant.restaurant.Entity.restroEntity;
import com.restaurant.restaurant.Repository.restroRepo;

@Service
public class restroService {
    @Autowired
    private restroRepo restroRepo;

    public void saveMessage(restroEntity message){
        restroRepo.save(message);
    }
}

