package repository.physio;

import domain.physio.PTTools;
import repository.IRepository;

import java.util.Set;

public interface PTToolsRepository extends IRepository<PTTools,String> {
    Set<PTTools> getAll();
}