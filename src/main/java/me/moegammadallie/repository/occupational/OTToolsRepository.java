package me.moegammadallie.repository.occupational;

import me.moegammadallie.domain.occupational.OTTools;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface OTToolsRepository extends IRepository<OTTools,String> {
    Set<OTTools>getAll();
}
