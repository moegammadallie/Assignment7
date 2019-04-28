package repository;

import domain.services.PTTools;

import java.util.Set;

public interface PTToolsRepository extends IRepository<PTTools,String> {
    Set<PTTools> getAll();
}