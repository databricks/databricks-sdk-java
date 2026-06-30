// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EndpointCoreConfigSummary {
  /** The list of served entities under the serving endpoint config. */
  @JsonProperty("served_entities")
  private Collection<ServedEntitySpec> servedEntities;

  /**
   * (Deprecated, use served_entities instead) The list of served models under the serving endpoint
   * config.
   */
  @JsonProperty("served_models")
  private Collection<ServedModelSpec> servedModels;

  public EndpointCoreConfigSummary setServedEntities(Collection<ServedEntitySpec> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntitySpec> getServedEntities() {
    return servedEntities;
  }

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
    return Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(servedModels, that.servedModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedEntities, servedModels);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigSummary.class)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .toString();
  }
}
