package ac.za.cput.project.service.physio;

import ac.za.cput.project.domain.physio.PTTools;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PTToolsService extends IService<PTTools,String> {
    Set<PTTools> getAll();
}