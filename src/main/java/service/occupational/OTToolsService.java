package service.occupational;

import domain.occupational.OTTools;
import service.IService;

import java.util.Set;

public interface OTToolsService extends IService<OTTools,String> {
    Set<OTTools>getAll();
}
