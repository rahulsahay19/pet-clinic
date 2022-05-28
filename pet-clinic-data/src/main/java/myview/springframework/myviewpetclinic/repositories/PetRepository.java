package myview.springframework.myviewpetclinic.repositories;

import myview.springframework.myviewpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
