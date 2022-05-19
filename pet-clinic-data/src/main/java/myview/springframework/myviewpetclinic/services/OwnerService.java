package myview.springframework.myviewpetclinic.services;

import myview.springframework.myviewpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
