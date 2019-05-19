package service.occupational.impl;

import domain.occupational.OTTools;
import repository.occupational.OTToolsRepository;
import repository.occupational.impl.OTToolsRepositoryImpl;
import service.occupational.OTToolsService;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OTToolsServiceImpl implements OTToolsService {

    private static OTToolsServiceImpl service = null;
    private OTToolsRepository repository;

    private OTToolsServiceImpl() {
        this.repository = OTToolsRepositoryImpl.getRepository();
    }

    public static OTToolsServiceImpl getService(){
        if(service == null) service = new OTToolsServiceImpl();
        return service;
    }

    @Override
    public Set<OTTools> getAll() {
        return this.repository.getAll();
    }

    @Override
    public OTTools create(OTTools login) {
        return this.repository.create(login);
    }

    @Override
    public OTTools update(OTTools ott) {
        return this.repository.update(ott);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public OTTools read(String s) {
        return this.repository.read(s);
    }
}
