// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetSparkVersionsResponse {
  /** All the available Spark versions. */
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
