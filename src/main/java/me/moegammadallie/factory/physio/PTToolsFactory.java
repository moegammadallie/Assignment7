package me.moegammadallie.factory.physio;

import me.moegammadallie.domain.physio.PTTools;
import me.moegammadallie.domain.physio.PTTools;

public class PTToolsFactory {
    public static PTTools getPTToolCode(int toolCode){
        return new PTTools.Builder().toolCode(toolCode).build();
    }

    public static PTTools getPTToolName(String toolName){
        return new PTTools.Builder().toolName(toolName).build();
    }

    public static PTTools getPTQuantity(int quantity){
        return new PTTools.Builder().quantity(quantity).build();
    }
}
