package com.example.galleria.controller;

import com.example.galleria.model.UserGallery;
import com.github.kskelm.baringo.model.Image;
import com.github.kskelm.baringo.util.BaringoApiException;
import com.github.kskelm.baringo.BaringoClient;
import com.github.kskelm.baringo.ImageService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.galleria.model.ImageUpload;

import com.example.galleria.Cred;
import com.example.galleria.model.User;
import com.example.galleria.repository.GalleryRepository;
import com.example.galleria.service.UserService;

@RestController
public class Controller {
	
@Autowired
UserService service;


@Autowired
GalleryRepository galleryrepo;

@PostMapping("/user")
public void setUser(@RequestBody User user) {
	service.saveOrUpdate(user);
}


@GetMapping("/user")
public User getUser(@RequestParam String username) {
	return service.getUserByID(username);
}

@GetMapping("/image")
public Image getImage(@RequestParam String imageid) {
	
	BaringoClient client=null;
	
	try {
        client = new BaringoClient.Builder()
                .clientAuth( Cred.clientID, Cred.clientSecret )
                .build();
    } catch (BaringoApiException e) {
        e.printStackTrace();
    }
	
	try {
	      Image image = client.imageService().getImageInfo( imageid );
	      return image;
	    } catch (BaringoApiException e) {
	      e.printStackTrace();
	    }  
	return null;
}


@PostMapping("/image") 
public Image setImage(@RequestBody ImageUpload imgup )
{
BaringoClient client=null;
Image image=null;
	
	try {
        client = new BaringoClient.Builder()
                .clientAuth( Cred.clientID, Cred.clientSecret )
                .build();
    } catch (BaringoApiException e) {
        e.printStackTrace();
    }
	
	try {
	      image = client.imageService().uploadLocalImage( null,imgup.getFileName(),null,null,null );
	      galleryrepo.save(new UserGallery(imgup.getUsername(),image.getId()));
	      return image;
	    } catch (Exception e) {
	      e.printStackTrace();
	      return null;
	    }  
	
}

@DeleteMapping("/image")
public void deleteImage(@RequestParam(name="imageid") String id) {
	galleryrepo.deleteById(id);
}

}

