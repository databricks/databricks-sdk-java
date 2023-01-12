// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetSparkVersionsResponse {
    /**
     * All the available Spark versions.
     */
    @JsonProperty("versions")
    private java.util.List<SparkVersion> versions;
    
    public GetSparkVersionsResponse setVersions(java.util.List<SparkVersion> versions) {
        this.versions = versions;
        return this;
    }

    public java.util.List<SparkVersion> getVersions() {
        return versions;
    }
    
}
