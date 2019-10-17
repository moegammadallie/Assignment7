package me.moegammadallie.service.physio.impl;

import me.moegammadallie.domain.Physiotherapist;

import me.moegammadallie.repository.PhysiotherapistRepository;
import me.moegammadallie.service.physio.PhysioTherapistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PhysioTherapistServiceImp implements PhysioTherapistService {

    private static PhysioTherapistServiceImp service = null;
    @Autowired
    private PhysiotherapistRepository repository;

    private PhysioTherapistServiceImp() {
    }

    public static PhysioTherapistServiceImp getService(){
        if(service == null) service = new PhysioTherapistServiceImp();
        return service;
    }

    @Override
    public Set<Physiotherapist> getAll() {

        List<Physiotherapist> list = (List<Physiotherapist>) this.repository.findAll();

        return new HashSet<>(list);
    }

    @Override
    public Physiotherapist create(Physiotherapist pt) {
        return this.repository.save(pt);
    }

    @Override
    public Physiotherapist update(Physiotherapist pt) {
        return this.repository.save(pt);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Physiotherapist read(String s) {
        return this.repository.findById(s).orElse(null);
    }
}
