package com.example.galleria.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.galleria.model.UserGallery;

public interface GalleryRepository extends CrudRepository<UserGallery,String> {
	

}
