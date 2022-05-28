package myview.springframework.myviewpetclinic.repositories;

import myview.springframework.myviewpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
