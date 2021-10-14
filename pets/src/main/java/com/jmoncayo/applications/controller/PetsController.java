package com.jmoncayo.applications.controller;

import com.jmoncayo.applications.model.Pet;
import com.jmoncayo.applications.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController {

    private final PetRepository petRepository;

    @Autowired
    public PetsController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    @GetMapping("/{id}")
    public Pet getPetByID(@PathVariable("id") final String id) {
        return petRepository.findPetByID(id);
    }

    @PostMapping
    public ResponseEntity<Pet> addPet(@RequestBody Pet newPet) {
        Pet pet = petRepository.save(newPet);
        return new ResponseEntity<>(pet, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pet> addPet(@PathVariable("id") final String id) {
        Pet pet = petRepository.deletePetByID(id);
        return new ResponseEntity<>(pet, HttpStatus.OK);
    }

}
