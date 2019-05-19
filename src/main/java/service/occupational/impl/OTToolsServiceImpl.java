package service.occupational.impl;

import domain.occupational.OTTools;
import service.occupational.OTToolsService;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OTToolsServiceImpl implements OTToolsService {

    private static OTToolsServiceImpl repository = null;
    private Set<OTTools> OTToolsRepositorys;

    private OTToolsServiceImpl() {
        this.OTToolsRepositorys = new HashSet<>();
    }

    public static OTToolsService getRepository(){
        if(repository == null) repository = new OTToolsServiceImpl();
        return repository;
    }

    @Override
    public Set<OTTools> getAll() {
        return OTToolsRepositorys;
    }

    private OTTools findOTTools(String OTT){
        return this.OTToolsRepositorys.stream()
            .filter(OTTools -> Objects.equals(OTTools.getOTToolCode(), OTTools))
            .findAny().orElse(null);
    }

    @Override
    public OTTools create(OTTools otTools) {
        this.OTToolsRepositorys.add(otTools);
        return otTools;
    }

    @Override
    public OTTools update(OTTools otTools) {
        String id = Integer.toString(otTools.getOTToolCode());
        OTTools pFind = findOTTools(id);
        OTToolsRepositorys.remove(pFind);
        OTToolsRepositorys.add(otTools);
        return null;
    }

    @Override
    public void delete(String s) {
        OTTools OTT = findOTTools(s);
        OTToolsRepositorys.remove(OTT);
    }

    @Override
    public OTTools read(String s) {
        OTTools ott = findOTTools(s);
        return ott == null ? null : ott;
    }
}
