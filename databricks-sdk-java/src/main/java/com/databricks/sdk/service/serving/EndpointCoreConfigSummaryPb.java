// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EndpointCoreConfigSummaryPb {
  @JsonProperty("served_entities")
  private Collection<ServedEntitySpec> servedEntities;

  @JsonProperty("served_models")
  private Collection<ServedModelSpec> servedModels;

  public EndpointCoreConfigSummaryPb setServedEntities(
      Collection<ServedEntitySpec> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntitySpec> getServedEntities() {
    return servedEntities;
  }

  public EndpointCoreConfigSummaryPb setServedModels(Collection<ServedModelSpec> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelSpec> getServedModels() {
    return servedModels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointCoreConfigSummaryPb that = (EndpointCoreConfigSummaryPb) o;
    return Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(servedModels, that.servedModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedEntities, servedModels);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigSummaryPb.class)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .toString();
  }
}
