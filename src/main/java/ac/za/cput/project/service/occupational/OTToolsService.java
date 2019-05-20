package ac.za.cput.project.service.occupational;

import ac.za.cput.project.domain.occupational.OTTools;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface OTToolsService extends IService<OTTools,String> {
    Set<OTTools>getAll();
}
