// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CloneClusterPb {
  @JsonProperty("source_cluster_id")
  private String sourceClusterId;

  public CloneClusterPb setSourceClusterId(String sourceClusterId) {
    this.sourceClusterId = sourceClusterId;
    return this;
  }

  public String getSourceClusterId() {
    return sourceClusterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloneClusterPb that = (CloneClusterPb) o;
    return Objects.equals(sourceClusterId, that.sourceClusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceClusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(CloneClusterPb.class).add("sourceClusterId", sourceClusterId).toString();
  }
}
