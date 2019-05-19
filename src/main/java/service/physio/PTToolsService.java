package service.physio;

import domain.physio.PTTools;
import service.IService;

import java.util.Set;

public interface PTToolsService extends IService<PTTools,String> {
    Set<PTTools> getAll();
}