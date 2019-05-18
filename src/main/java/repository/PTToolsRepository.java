package repository;

import domain.physio.PTTools;

import java.util.Set;

public interface PTToolsRepository extends IRepository<PTTools,String> {
    Set<PTTools> getAll();
}