// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a share recipient
 */
@Generated("databricks-sdk-generator")
public class DeleteRecipientRequest {
    /**
     * Required. Name of the recipient.
     */
    
    private String name;
    
    public DeleteRecipientRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
