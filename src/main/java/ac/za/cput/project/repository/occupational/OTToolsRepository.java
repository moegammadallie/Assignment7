package ac.za.cput.project.repository.occupational;

import ac.za.cput.project.domain.occupational.OTTools;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface OTToolsRepository extends IRepository<OTTools,String> {
    Set<OTTools>getAll();
}
