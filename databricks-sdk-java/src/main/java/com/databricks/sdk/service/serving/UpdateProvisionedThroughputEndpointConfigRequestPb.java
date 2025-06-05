// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateProvisionedThroughputEndpointConfigRequestPb {
  @JsonProperty("config")
  private PtEndpointCoreConfig config;

  @JsonIgnore private String name;

  public UpdateProvisionedThroughputEndpointConfigRequestPb setConfig(PtEndpointCoreConfig config) {
    this.config = config;
    return this;
  }

  public PtEndpointCoreConfig getConfig() {
    return config;
  }

  public UpdateProvisionedThroughputEndpointConfigRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateProvisionedThroughputEndpointConfigRequestPb that =
        (UpdateProvisionedThroughputEndpointConfigRequestPb) o;
    return Objects.equals(config, that.config) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProvisionedThroughputEndpointConfigRequestPb.class)
        .add("config", config)
        .add("name", name)
        .toString();
  }
}
