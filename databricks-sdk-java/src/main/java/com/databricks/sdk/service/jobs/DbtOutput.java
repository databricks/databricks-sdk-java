// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DbtOutput {
    /**
     * An optional map of headers to send when retrieving the artifact from the
     * `artifacts_link`.
     */
    @JsonProperty("artifacts_headers")
    private Map<String,String> artifactsHeaders;
    
    /**
     * A pre-signed URL to download the (compressed) dbt artifacts. This link is
     * valid for a limited time (30 minutes). This information is only available
     * after the run has finished.
     */
    @JsonProperty("artifacts_link")
    private String artifactsLink;
    
    public DbtOutput setArtifactsHeaders(Map<String,String> artifactsHeaders) {
        this.artifactsHeaders = artifactsHeaders;
        return this;
    }

    public Map<String,String> getArtifactsHeaders() {
        return artifactsHeaders;
    }
    
    public DbtOutput setArtifactsLink(String artifactsLink) {
        this.artifactsLink = artifactsLink;
        return this;
    }

    public String getArtifactsLink() {
        return artifactsLink;
    }
    
}
