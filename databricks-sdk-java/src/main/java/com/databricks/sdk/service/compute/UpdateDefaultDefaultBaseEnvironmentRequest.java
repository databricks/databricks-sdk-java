// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDefaultDefaultBaseEnvironmentRequest {
  /** */
  @JsonProperty("base_environment_type")
  private BaseEnvironmentType baseEnvironmentType;

  /** */
  @JsonProperty("id")
  private String id;

  public UpdateDefaultDefaultBaseEnvironmentRequest setBaseEnvironmentType(
      BaseEnvironmentType baseEnvironmentType) {
    this.baseEnvironmentType = baseEnvironmentType;
    return this;
  }

  public BaseEnvironmentType getBaseEnvironmentType() {
    return baseEnvironmentType;
  }

  public UpdateDefaultDefaultBaseEnvironmentRequest setId(String id) {
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
    UpdateDefaultDefaultBaseEnvironmentRequest that =
        (UpdateDefaultDefaultBaseEnvironmentRequest) o;
    return Objects.equals(baseEnvironmentType, that.baseEnvironmentType)
        && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseEnvironmentType, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDefaultDefaultBaseEnvironmentRequest.class)
        .add("baseEnvironmentType", baseEnvironmentType)
        .add("id", id)
        .toString();
  }
}
