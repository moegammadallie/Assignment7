package me.moegammadallie.service.physio.impl;

import me.moegammadallie.domain.physio.PTTools;
import me.moegammadallie.repository.physio.PTToolsRepository;
import me.moegammadallie.repository.physio.impl.PTToolsRepositoryImpl;
import me.moegammadallie.service.physio.PTToolsService;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PTToolsServiceImpl implements PTToolsService {

    private static PTToolsServiceImpl service = null;
    private PTToolsRepository repository;

    private PTToolsServiceImpl() {
        this.repository = PTToolsRepositoryImpl.getRepository();
    }

    public static PTToolsServiceImpl getService(){
        if(service == null) service = new PTToolsServiceImpl();
        return service;
    }

    @Override
    public Set<PTTools> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PTTools create(PTTools ptt) {
        return this.repository.create(ptt);
    }

    @Override
    public PTTools update(PTTools ptt) {
        return this.repository.update(ptt);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PTTools read(String s) {
        return this.repository.read(s);
    }
}
