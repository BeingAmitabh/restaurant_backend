package com.restaurant.restaurant.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restaurant.restaurant.Entity.restroEntity;
import com.restaurant.restaurant.Service.restroService;

@CrossOrigin(origins = "http://localhost:1234")
@RestController
@RequestMapping("/contact")
public class restroController {

    @Autowired
    private restroService restroService;
 
    @PostMapping("/submit")
    public String submitContactForm(@RequestBody restroEntity entity) {
        restroService.saveMessage(entity);
        return "Message received successfully!";
    }
}
