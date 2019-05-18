package repository.occupational;

import domain.occupational.OTTools;
import repository.IRepository;

import java.util.Set;

public interface OTToolsRepository extends IRepository<OTTools,String> {
    Set<OTTools>getAll();
}
