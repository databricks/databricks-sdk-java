// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Result of purging one feature. */
@Generated
public class PurgeFeatureEntitiesResult {
  /** Error encountered while purging this feature, if any. */
  @JsonProperty("error")
  private DatabricksServiceExceptionWithDetailsProto error;

  /** Fully qualified name of the feature that was purged. */
  @JsonProperty("feature")
  private String feature;

  /** State of the offline purge for this feature. */
  @JsonProperty("offline_state")
  private PurgeFeatureEntitiesResultState offlineState;

  /** State of the online purge for this feature. */
  @JsonProperty("online_state")
  private PurgeFeatureEntitiesResultState onlineState;

  public PurgeFeatureEntitiesResult setError(DatabricksServiceExceptionWithDetailsProto error) {
    this.error = error;
    return this;
  }

  public DatabricksServiceExceptionWithDetailsProto getError() {
    return error;
  }

  public PurgeFeatureEntitiesResult setFeature(String feature) {
    this.feature = feature;
    return this;
  }

  public String getFeature() {
    return feature;
  }

  public PurgeFeatureEntitiesResult setOfflineState(PurgeFeatureEntitiesResultState offlineState) {
    this.offlineState = offlineState;
    return this;
  }

  public PurgeFeatureEntitiesResultState getOfflineState() {
    return offlineState;
  }

  public PurgeFeatureEntitiesResult setOnlineState(PurgeFeatureEntitiesResultState onlineState) {
    this.onlineState = onlineState;
    return this;
  }

  public PurgeFeatureEntitiesResultState getOnlineState() {
    return onlineState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurgeFeatureEntitiesResult that = (PurgeFeatureEntitiesResult) o;
    return Objects.equals(error, that.error)
        && Objects.equals(feature, that.feature)
        && Objects.equals(offlineState, that.offlineState)
        && Objects.equals(onlineState, that.onlineState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, feature, offlineState, onlineState);
  }

  @Override
  public String toString() {
    return new ToStringer(PurgeFeatureEntitiesResult.class)
        .add("error", error)
        .add("feature", feature)
        .add("offlineState", offlineState)
        .add("onlineState", onlineState)
        .toString();
  }
}
