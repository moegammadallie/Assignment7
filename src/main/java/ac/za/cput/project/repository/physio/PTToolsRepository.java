package ac.za.cput.project.repository.physio;

import ac.za.cput.project.domain.physio.PTTools;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PTToolsRepository extends IRepository<PTTools,String> {
    Set<PTTools> getAll();
}