package myview.springframework.myviewpetclinic.repositories;

import myview.springframework.myviewpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
