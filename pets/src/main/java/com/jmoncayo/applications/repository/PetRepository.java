package com.jmoncayo.applications.repository;

import com.jmoncayo.applications.model.Pet;
import com.jmoncayo.applications.model.Sex;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends MongoRepository<Pet, String> {
    @Query("{name:'?0'}")
    List<Pet> findPetsByName(String name);

    @Query("{sex:'?0'}")
    List<Pet> findPetsBySex(Sex sex);

    @Query("{_id:'?0'}")
    Pet findPetByID(String id);

    @Query(value="{'_id' : ?0}", delete = true)
    Pet deletePetByID(String id);

}
