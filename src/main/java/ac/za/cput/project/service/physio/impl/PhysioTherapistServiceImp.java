package ac.za.cput.project.service.physio.impl;

import ac.za.cput.project.domain.physio.PhysioTherapist;
import ac.za.cput.project.repository.physio.PhysioTherapistRepository;
import ac.za.cput.project.repository.physio.impl.PhysioTherapistRepositoryImp;
import ac.za.cput.project.service.physio.PhysioTherapistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service("PhysioTherapistServiceImp")
public class PhysioTherapistServiceImp implements PhysioTherapistService {

    private static PhysioTherapistServiceImp service = null;
    private PhysioTherapistRepository repository;

    private PhysioTherapistServiceImp() {
        this.repository = PhysioTherapistRepositoryImp.getRepository();
    }

    public static PhysioTherapistServiceImp getService(){
        if(service == null) service = new PhysioTherapistServiceImp();
        return service;
    }

    @Override
    public Set<PhysioTherapist> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PhysioTherapist create(PhysioTherapist pt) {
        return this.repository.create(pt);
    }

    @Override
    public PhysioTherapist update(PhysioTherapist pt) {
        return this.repository.update(pt);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PhysioTherapist read(String s) {
        return this.repository.read(s);
    }
}
