package me.moegammadallie.repository.physio;

import me.moegammadallie.domain.physio.PTTools;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PTToolsRepository extends IRepository<PTTools,String> {
    Set<PTTools> getAll();
}
