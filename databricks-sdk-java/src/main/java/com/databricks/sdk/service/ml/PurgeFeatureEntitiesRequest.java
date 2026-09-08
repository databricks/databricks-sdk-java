// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Request to purge materialized feature values for entities listed in a Unity Catalog Delta table.
 */
@Generated
public class PurgeFeatureEntitiesRequest {
  /**
   * Fully qualified name of the Unity Catalog Delta table containing the entity keys to purge. The
   * table may contain a subset of each feature's entity-key columns. A partial key match deletes
   * all feature rows matching the provided key values. Non-key columns are rejected; null key
   * values are allowed.
   */
  @JsonProperty("entities_table")
  private String entitiesTable;

  /**
   * Fully qualified names of the features to purge. At least one nonempty feature name is required.
   * A request may contain at most 10000 features; submit additional features in separate requests.
   * Duplicate features are rejected.
   */
  @JsonProperty("features")
  private Collection<String> features;

  /** Optional UUID4 idempotency token for the request. */
  @JsonProperty("request_id")
  private String requestId;

  public PurgeFeatureEntitiesRequest setEntitiesTable(String entitiesTable) {
    this.entitiesTable = entitiesTable;
    return this;
  }

  public String getEntitiesTable() {
    return entitiesTable;
  }

  public PurgeFeatureEntitiesRequest setFeatures(Collection<String> features) {
    this.features = features;
    return this;
  }

  public Collection<String> getFeatures() {
    return features;
  }

  public PurgeFeatureEntitiesRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurgeFeatureEntitiesRequest that = (PurgeFeatureEntitiesRequest) o;
    return Objects.equals(entitiesTable, that.entitiesTable)
        && Objects.equals(features, that.features)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesTable, features, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(PurgeFeatureEntitiesRequest.class)
        .add("entitiesTable", entitiesTable)
        .add("features", features)
        .add("requestId", requestId)
        .toString();
  }
}
