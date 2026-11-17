// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** References to operations on a materialized feature. */
@Generated
public class MaterializedFeatureOperations {
  /** Name of the latest entity purge operation. Format: operations/{operation_id}. */
  @JsonProperty("latest_entity_purge_operation")
  private String latestEntityPurgeOperation;

  public MaterializedFeatureOperations setLatestEntityPurgeOperation(
      String latestEntityPurgeOperation) {
    this.latestEntityPurgeOperation = latestEntityPurgeOperation;
    return this;
  }

  public String getLatestEntityPurgeOperation() {
    return latestEntityPurgeOperation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializedFeatureOperations that = (MaterializedFeatureOperations) o;
    return Objects.equals(latestEntityPurgeOperation, that.latestEntityPurgeOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestEntityPurgeOperation);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializedFeatureOperations.class)
        .add("latestEntityPurgeOperation", latestEntityPurgeOperation)
        .toString();
  }
}
