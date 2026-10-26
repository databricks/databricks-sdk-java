// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Why one materialization set member could not be changed. */
@Generated
public class MaterializedFeatureChangeFailure {
  /** Databricks error code name of the failure, for example "RESOURCE_CONFLICT". */
  @JsonProperty("error_code")
  private String errorCode;

  /** The member that could not be changed. */
  @JsonProperty("materialized_feature_id")
  private String materializedFeatureId;

  /** The failure's message. */
  @JsonProperty("message")
  private String message;

  public MaterializedFeatureChangeFailure setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public MaterializedFeatureChangeFailure setMaterializedFeatureId(String materializedFeatureId) {
    this.materializedFeatureId = materializedFeatureId;
    return this;
  }

  public String getMaterializedFeatureId() {
    return materializedFeatureId;
  }

  public MaterializedFeatureChangeFailure setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializedFeatureChangeFailure that = (MaterializedFeatureChangeFailure) o;
    return Objects.equals(errorCode, that.errorCode)
        && Objects.equals(materializedFeatureId, that.materializedFeatureId)
        && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, materializedFeatureId, message);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializedFeatureChangeFailure.class)
        .add("errorCode", errorCode)
        .add("materializedFeatureId", materializedFeatureId)
        .add("message", message)
        .toString();
  }
}
