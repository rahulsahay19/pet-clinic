package myview.springframework.myviewpetclinic.services.map;

import myview.springframework.myviewpetclinic.model.Speciality;
import myview.springframework.myviewpetclinic.services.SpecialitesService;

import java.util.Set;

public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }
}
