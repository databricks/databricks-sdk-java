// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a service principal
 */
@Generated("databricks-sdk-generator")
public class DeleteServicePrincipalRequest {
    /**
     * Unique ID for a service principal in the Databricks Account.
     */
    
    private String id;
    
    public DeleteServicePrincipalRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}
