package me.moegammadallie.service.occupational.impl;

import me.moegammadallie.domain.occupational.OTTools;
import me.moegammadallie.repository.occupational.OTToolsRepository;
import me.moegammadallie.repository.occupational.impl.OTToolsRepositoryImpl;
import me.moegammadallie.service.occupational.OTToolsService;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service
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
