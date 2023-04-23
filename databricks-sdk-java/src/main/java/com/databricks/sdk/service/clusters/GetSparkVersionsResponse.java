// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class GetSparkVersionsResponse {
  /** All the available Spark versions. */
  @JsonProperty("versions")
  private Collection<SparkVersion> versions;

  public GetSparkVersionsResponse setVersions(Collection<SparkVersion> versions) {
    this.versions = versions;
    return this;
  }

  public Collection<SparkVersion> getVersions() {
    return versions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSparkVersionsResponse that = (GetSparkVersionsResponse) o;
    return Objects.equals(versions, that.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSparkVersionsResponse.class).add("versions", versions).toString();
  }
}
