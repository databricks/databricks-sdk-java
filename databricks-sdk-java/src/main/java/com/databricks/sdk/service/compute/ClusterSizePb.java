// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ClusterSizePb {
  @JsonProperty("autoscale")
  private AutoScale autoscale;

  @JsonProperty("num_workers")
  private Long numWorkers;

  public ClusterSizePb setAutoscale(AutoScale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  public AutoScale getAutoscale() {
    return autoscale;
  }

  public ClusterSizePb setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  public Long getNumWorkers() {
    return numWorkers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterSizePb that = (ClusterSizePb) o;
    return Objects.equals(autoscale, that.autoscale) && Objects.equals(numWorkers, that.numWorkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscale, numWorkers);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterSizePb.class)
        .add("autoscale", autoscale)
        .add("numWorkers", numWorkers)
        .toString();
  }
}
