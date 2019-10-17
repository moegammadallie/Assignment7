package me.moegammadallie.service.occupational;

import me.moegammadallie.domain.occupational.OTTools;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface OTToolsService extends IService<OTTools,String> {
    Set<OTTools>getAll();
}
