// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a VPC endpoint configuration
 */
public class GetVpcEndpointRequest {
    /**
     * Databricks VPC endpoint ID.
     */
    
    private String vpcEndpointId;
    
    public GetVpcEndpointRequest setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    public String getVpcEndpointId() {
        return vpcEndpointId;
    }
    
}
