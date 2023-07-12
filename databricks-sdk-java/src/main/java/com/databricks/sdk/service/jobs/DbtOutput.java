// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
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
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtOutput that = (DbtOutput) o;
    return Objects.equals(artifactsHeaders, that.artifactsHeaders)
    && Objects.equals(artifactsLink, that.artifactsLink)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactsHeaders, artifactsLink);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtOutput.class)
      .add("artifactsHeaders", artifactsHeaders)
      .add("artifactsLink", artifactsLink).toString();
  }
}
