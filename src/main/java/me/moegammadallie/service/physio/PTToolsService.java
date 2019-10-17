package me.moegammadallie.service.physio;

import me.moegammadallie.domain.physio.PTTools;
import me.moegammadallie.service.IService;
import me.moegammadallie.domain.physio.PTTools;

import java.util.Set;

public interface PTToolsService extends IService<PTTools,String> {
    Set<PTTools> getAll();
}
