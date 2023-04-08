// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateServingEndpoint {
  /** The core config of the serving endpoint. */
  @JsonProperty("config")
  private EndpointCoreConfigInput config;

  /**
   * The name of the serving endpoint. This field is required and must be unique across a Databricks
   * Workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores.
   */
  @JsonProperty("name")
  private String name;

  public CreateServingEndpoint setConfig(EndpointCoreConfigInput config) {
    this.config = config;
    return this;
  }

  public EndpointCoreConfigInput getConfig() {
    return config;
  }

  public CreateServingEndpoint setName(String name) {
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
    CreateServingEndpoint that = (CreateServingEndpoint) o;
    return Objects.equals(config, that.config) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServingEndpoint.class)
        .add("config", config)
        .add("name", name)
        .toString();
  }
}
