package ac.za.cput.project.service.physio.impl;

import ac.za.cput.project.domain.physio.PTTools;
import ac.za.cput.project.repository.physio.PTToolsRepository;
import ac.za.cput.project.repository.physio.impl.PTToolsRepositoryImpl;
import ac.za.cput.project.service.physio.PTToolsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("PTToolsServiceImpl")
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
