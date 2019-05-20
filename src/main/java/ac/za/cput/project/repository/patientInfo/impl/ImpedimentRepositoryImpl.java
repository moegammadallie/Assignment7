package ac.za.cput.project.repository.patientInfo.impl;

import ac.za.cput.project.domain.patientInfo.Impediment;
import ac.za.cput.project.repository.patientInfo.ImpedimentRepository;

import java.util.HashSet;
import java.util.Set;

public class ImpedimentRepositoryImpl implements ImpedimentRepository {

    private static ImpedimentRepositoryImpl repository = null;
    private Set<Impediment> ImpedimentRepositorys;

    private ImpedimentRepositoryImpl() {
        this.ImpedimentRepositorys = new HashSet<>();
    }

    public static ImpedimentRepository getRepository(){
        if(repository == null) repository = new ImpedimentRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Impediment> getAll() {
        return ImpedimentRepositorys;
    }

    @Override
    public Impediment create(Impediment impediment) {
        this.ImpedimentRepositorys.add(impediment);
        return impediment;
    }

    private Impediment findImpediment(String impediment){
        return this.ImpedimentRepositorys.stream()
                .filter(Impediment -> Impediment.getImpedimentCode().trim()
                        .equals(Impediment)).findAny().orElse(null);
    }
    @Override
    public Impediment update(Impediment impediment) {
        String id = impediment.getImpedimentCode();
        Impediment pFind = findImpediment(id);
        ImpedimentRepositorys.remove(pFind);
        ImpedimentRepositorys.add(impediment);
        return null;
    }

    @Override
    public void delete(String s) {
        Impediment impediment = findImpediment(s);
        ImpedimentRepositorys.remove(impediment);
    }

    @Override
    public Impediment read(String s) {
        Impediment impediment = findImpediment(s);
        return impediment == null ? null : impediment;
    }
}
