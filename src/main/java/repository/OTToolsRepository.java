package repository;

import domain.services.OTTools;

import java.util.Set;

public interface OTToolsRepository extends IRepository<OTTools,String> {
    Set<OTTools>getAll();
}
