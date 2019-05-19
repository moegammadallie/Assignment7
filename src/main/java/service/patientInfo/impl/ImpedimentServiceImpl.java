package service.patientInfo.impl;

import domain.patientInfo.Impediment;
import repository.patientInfo.ImpedimentRepository;
import repository.patientInfo.impl.ImpedimentRepositoryImpl;
import service.patientInfo.ImpedimentService;

import java.util.HashSet;
import java.util.Set;

public class ImpedimentServiceImpl implements ImpedimentService {

    private static ImpedimentServiceImpl service = null;
    private ImpedimentRepository repository;

    private ImpedimentServiceImpl() {
        this.repository = ImpedimentRepositoryImpl.getRepository();
    }

    public static ImpedimentServiceImpl getService(){
        if(service == null) service = new ImpedimentServiceImpl();
        return service;
    }

    @Override
    public Set<Impediment> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Impediment create(Impediment impe) {
        return this.repository.create(impe);
    }

    @Override
    public Impediment update(Impediment impe) {
        return this.repository.update(impe);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Impediment read(String s) {
        return this.repository.read(s);
    }
}
