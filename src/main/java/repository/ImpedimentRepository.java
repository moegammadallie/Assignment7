package repository;

import domain.services.Impediment;

import java.util.Set;

public interface ImpedimentRepository extends IRepository<Impediment, String>{
        Set<Impediment> getAll();
}
