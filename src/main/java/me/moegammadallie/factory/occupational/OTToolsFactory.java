package me.moegammadallie.factory.occupational;

import me.moegammadallie.domain.occupational.OTTools;

public class OTToolsFactory {
    public static OTTools getOTToolCode(int toolCode){
        return new OTTools.Builder().toolCode(toolCode).build();
    }
    public static OTTools getOTToolName(String toolName){
        return new OTTools.Builder().toolName(toolName).build();
    }
    public static OTTools getOTQuantity(int quantity){
        return new OTTools.Builder().quantity(quantity).build();
    }
}
