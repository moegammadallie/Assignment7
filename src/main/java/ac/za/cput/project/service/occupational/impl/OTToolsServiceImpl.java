package ac.za.cput.project.service.occupational.impl;

import ac.za.cput.project.domain.occupational.OTTools;
import ac.za.cput.project.repository.occupational.OTToolsRepository;
import ac.za.cput.project.repository.occupational.impl.OTToolsRepositoryImpl;
import ac.za.cput.project.service.occupational.OTToolsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("OTToolsServiceImpl")
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
