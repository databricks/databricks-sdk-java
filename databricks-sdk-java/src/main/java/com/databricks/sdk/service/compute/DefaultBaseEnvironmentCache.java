// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DefaultBaseEnvironmentCache {
  /** */
  @JsonProperty("indefinite_materialized_environment")
  private MaterializedEnvironment indefiniteMaterializedEnvironment;

  /** */
  @JsonProperty("materialized_environment")
  private MaterializedEnvironment materializedEnvironment;

  /** */
  @JsonProperty("message")
  private String message;

  /** */
  @JsonProperty("status")
  private DefaultBaseEnvironmentCacheStatus status;

  public DefaultBaseEnvironmentCache setIndefiniteMaterializedEnvironment(
      MaterializedEnvironment indefiniteMaterializedEnvironment) {
    this.indefiniteMaterializedEnvironment = indefiniteMaterializedEnvironment;
    return this;
  }

  public MaterializedEnvironment getIndefiniteMaterializedEnvironment() {
    return indefiniteMaterializedEnvironment;
  }

  public DefaultBaseEnvironmentCache setMaterializedEnvironment(
      MaterializedEnvironment materializedEnvironment) {
    this.materializedEnvironment = materializedEnvironment;
    return this;
  }

  public MaterializedEnvironment getMaterializedEnvironment() {
    return materializedEnvironment;
  }

  public DefaultBaseEnvironmentCache setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public DefaultBaseEnvironmentCache setStatus(DefaultBaseEnvironmentCacheStatus status) {
    this.status = status;
    return this;
  }

  public DefaultBaseEnvironmentCacheStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultBaseEnvironmentCache that = (DefaultBaseEnvironmentCache) o;
    return Objects.equals(indefiniteMaterializedEnvironment, that.indefiniteMaterializedEnvironment)
        && Objects.equals(materializedEnvironment, that.materializedEnvironment)
        && Objects.equals(message, that.message)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        indefiniteMaterializedEnvironment, materializedEnvironment, message, status);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultBaseEnvironmentCache.class)
        .add("indefiniteMaterializedEnvironment", indefiniteMaterializedEnvironment)
        .add("materializedEnvironment", materializedEnvironment)
        .add("message", message)
        .add("status", status)
        .toString();
  }
}
