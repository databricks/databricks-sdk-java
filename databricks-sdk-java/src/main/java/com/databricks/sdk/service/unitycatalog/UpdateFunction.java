// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateFunction {
    /**
     * The fully-qualified name of the function (of the form
     * __catalog_name__.__schema_name__.__function__name__).
     */
    
    private String name;
    
    /**
     * Username of current owner of function.
     */
    @JsonProperty("owner")
    private String owner;
    
    public UpdateFunction setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateFunction setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
}
