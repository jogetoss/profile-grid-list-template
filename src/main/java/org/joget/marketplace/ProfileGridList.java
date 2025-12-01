package org.joget.marketplace;

import java.util.HashMap;
import java.util.Map;

import org.joget.apps.app.service.AppUtil;
import org.joget.apps.datalist.model.DataListTemplate;

public class ProfileGridList extends DataListTemplate {
    
    private final static String MESSAGE_PATH = "messages/ProfileGridList";
    
    @Override
    public String getName() {
        return "ProfileGridListTemplate";
    }

    @Override
    public String getVersion() {
        return "8.0.0";
    }

    @Override
    public String getDescription() {
        return "";
    }
    
    @Override
    public String getLabel() {
        return "List - Profile Grid";
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }

    @Override
    public String getPropertyOptions() {
        return AppUtil.readPluginResource(getClass().getName(), "/properties/profileGridList.json", null, true, MESSAGE_PATH);
    }
    
    @Override
    public String getTemplate() {
        String separator = getPropertyString("separator");
        Map<String, String> data = new HashMap<>();
        data.put("separator", separator);
        return getTemplate(data, "/templates/profileGridListTemplate.ftl", null);
    }
    
}
