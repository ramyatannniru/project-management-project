package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping("/getalluser")
    public ResponseEntity<List<User>> getAlluser(){
   	 
   	 return ResponseEntity.ok(service.findAll()); 
    }
    
   @GetMapping("/findbyid")
   public ResponseEntity<User> findById(@RequestParam("id") int id){
   	
   	return ResponseEntity.ok(service.findById(id));
   }
   
   @GetMapping("/findbyname/{username}")
   public ResponseEntity<List<User>> userbyName(@PathVariable("username") String username){
   	
   	return ResponseEntity.ok(service.findByusername(username));
   }
   @GetMapping("/findbylocation")
   public ResponseEntity<List<User>> userbyLoction(@RequestParam("ulocation") String ulocation){
   	
   	return ResponseEntity.ok(service.findBylocation(ulocation));
   }
   @GetMapping("/findbyavailability")
   public ResponseEntity<List<User>> userbyAvailability(@RequestParam("avialability") String avialability){
   	
   	return ResponseEntity.ok(service.findByavailability(avialability));
   }
   @GetMapping("/findbyemail")
   public ResponseEntity<List<User>> userbyEmail(@RequestParam("email") String email){
   	
   	return ResponseEntity.ok(service.findByemail(email));
   }
   @GetMapping("/findbydomain")
   public ResponseEntity<List<User>> userbyDomain(@RequestParam("udomain") String udomain){
   	
   	return ResponseEntity.ok(service.findBydomain(udomain));
   }
   
   
   @PostMapping("/saveuser")
   public ResponseEntity<User> saveProject(@RequestBody User user){
   	
   	return ResponseEntity.ok(service.saveUser(user));
   }
   
   @PostMapping("/deleteuser")
   public ResponseEntity<?> deleteUser(@RequestParam("id")int id){
   	service.deleteUser(id);
   	return ResponseEntity.ok("deleted");
   }


}
