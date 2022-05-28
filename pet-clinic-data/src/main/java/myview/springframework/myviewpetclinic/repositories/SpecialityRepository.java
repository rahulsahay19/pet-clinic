package myview.springframework.myviewpetclinic.repositories;

import myview.springframework.myviewpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
