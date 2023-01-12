// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CloudProviderNodeInfo {
    /**
     
     */
    @JsonProperty("status")
    private java.util.List<CloudProviderNodeStatus> status;
    
    public CloudProviderNodeInfo setStatus(java.util.List<CloudProviderNodeStatus> status) {
        this.status = status;
        return this;
    }

    public java.util.List<CloudProviderNodeStatus> getStatus() {
        return status;
    }
    
}
