// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDefaultBaseEnvironmentRequest {
  /** */
  @JsonProperty("default_base_environment")
  private DefaultBaseEnvironment defaultBaseEnvironment;

  /** */
  @JsonIgnore private String id;

  public UpdateDefaultBaseEnvironmentRequest setDefaultBaseEnvironment(
      DefaultBaseEnvironment defaultBaseEnvironment) {
    this.defaultBaseEnvironment = defaultBaseEnvironment;
    return this;
  }

  public DefaultBaseEnvironment getDefaultBaseEnvironment() {
    return defaultBaseEnvironment;
  }

  public UpdateDefaultBaseEnvironmentRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDefaultBaseEnvironmentRequest that = (UpdateDefaultBaseEnvironmentRequest) o;
    return Objects.equals(defaultBaseEnvironment, that.defaultBaseEnvironment)
        && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultBaseEnvironment, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDefaultBaseEnvironmentRequest.class)
        .add("defaultBaseEnvironment", defaultBaseEnvironment)
        .add("id", id)
        .toString();
  }
}
