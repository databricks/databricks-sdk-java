// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateServingEndpoint class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>config</code>.</p>
   *
   * @param config a {@link com.databricks.sdk.service.serving.EndpointCoreConfigInput} object
   * @return a {@link com.databricks.sdk.service.serving.CreateServingEndpoint} object
   */
  public CreateServingEndpoint setConfig(EndpointCoreConfigInput config) {
    this.config = config;
    return this;
  }

  /**
   * <p>Getter for the field <code>config</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigInput} object
   */
  public EndpointCoreConfigInput getConfig() {
    return config;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.CreateServingEndpoint} object
   */
  public CreateServingEndpoint setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServingEndpoint that = (CreateServingEndpoint) o;
    return Objects.equals(config, that.config) && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(config, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateServingEndpoint.class)
        .add("config", config)
        .add("name", name)
        .toString();
  }
}
