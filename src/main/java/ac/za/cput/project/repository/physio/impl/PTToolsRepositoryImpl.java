package ac.za.cput.project.repository.physio.impl;

import ac.za.cput.project.domain.physio.PTTools;
import ac.za.cput.project.repository.physio.PTToolsRepository;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PTToolsRepositoryImpl implements PTToolsRepository {

    private static PTToolsRepositoryImpl repository = null;
    private Set<PTTools> PTToolsRepositorys;

    private PTToolsRepositoryImpl() {
        this.PTToolsRepositorys = new HashSet<>();
    }

    public static PTToolsRepository getRepository(){
        if(repository == null) repository = new PTToolsRepositoryImpl();
        return repository;
    }

    @Override
    public Set<PTTools> getAll() {
        return PTToolsRepositorys;
    }

    private PTTools findPTTools(String PTT){
        return this.PTToolsRepositorys.stream()
                .filter(PTTools -> Objects.equals(PTTools.getPTToolCode(), PTTools))
                .findAny().orElse(null);
    }

    @Override
    public PTTools create(PTTools ptTools) {
        this.PTToolsRepositorys.add(ptTools);
        return ptTools;
    }

    @Override
    public PTTools update(PTTools ptTools) {
        String id = Integer.toString(ptTools.getPTToolCode());
        PTTools pFind = findPTTools(id);
        PTToolsRepositorys.remove(pFind);
        PTToolsRepositorys.add(ptTools);
        return null;
    }

    @Override
    public void delete(String s) {
        PTTools PTT = findPTTools(s);
        PTToolsRepositorys.remove(PTT);
    }

    @Override
    public PTTools read(String s) {
        PTTools ptt = findPTTools(s);
        return ptt == null ? null : ptt;
    }
}
