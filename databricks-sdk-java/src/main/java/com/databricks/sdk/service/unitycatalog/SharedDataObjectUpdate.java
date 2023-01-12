// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SharedDataObjectUpdate {
    /**
     * One of: **ADD**, **REMOVE**, **UPDATE**.
     */
    @JsonProperty("action")
    private SharedDataObjectUpdateAction action;
    
    /**
     * The data object that is being added, removed, or updated.
     */
    @JsonProperty("data_object")
    private SharedDataObject dataObject;
    
    public SharedDataObjectUpdate setAction(SharedDataObjectUpdateAction action) {
        this.action = action;
        return this;
    }

    public SharedDataObjectUpdateAction getAction() {
        return action;
    }
    
    public SharedDataObjectUpdate setDataObject(SharedDataObject dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public SharedDataObject getDataObject() {
        return dataObject;
    }
    
}
