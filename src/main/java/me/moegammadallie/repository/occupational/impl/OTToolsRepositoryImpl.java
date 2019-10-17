package me.moegammadallie.repository.occupational.impl;

import me.moegammadallie.domain.occupational.OTTools;
import me.moegammadallie.repository.occupational.OTToolsRepository;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OTToolsRepositoryImpl implements OTToolsRepository {

    private static OTToolsRepositoryImpl repository = null;
    private Set<OTTools> OTToolsRepositorys;

    private OTToolsRepositoryImpl() {
        this.OTToolsRepositorys = new HashSet<>();
    }

    public static OTToolsRepository getRepository(){
        if(repository == null) repository = new OTToolsRepositoryImpl();
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
