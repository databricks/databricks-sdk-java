// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The general workspace configurations that are specific to cloud providers.
 */
@Generated("databricks-sdk-generator")
public class CloudResourceBucket {
    /**
     * The general workspace configurations that are specific to Google Cloud.
     */
    @JsonProperty("gcp")
    private GcpProjectContainer gcp;
    
    public CloudResourceBucket setGcp(GcpProjectContainer gcp) {
        this.gcp = gcp;
        return this;
    }

    public GcpProjectContainer getGcp() {
        return gcp;
    }
    
}
