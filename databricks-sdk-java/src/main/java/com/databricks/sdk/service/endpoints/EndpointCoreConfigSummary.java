// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class EndpointCoreConfigSummary {
  /** The list of served models under the serving endpoint config. */
  @JsonProperty("served_models")
  private Collection<ServedModelSpec> servedModels;

  public EndpointCoreConfigSummary setServedModels(Collection<ServedModelSpec> servedModels) {
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
    EndpointCoreConfigSummary that = (EndpointCoreConfigSummary) o;
    return Objects.equals(servedModels, that.servedModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedModels);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigSummary.class)
        .add("servedModels", servedModels)
        .toString();
  }
}
