// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateMaterializationSetRequest {
  /**
   * The desired state of the updated materialization set. materialization_set_id selects the set.
   */
  @JsonProperty("materialization_set")
  private MaterializationSet materializationSet;

  /** Server-assigned unique identifier for the materialization set. */
  @JsonIgnore private String materializationSetId;

  /**
   * Idempotency token for the request. A second request carrying a token that has already been used
   * returns the operation the first one created, whatever state it reached, and changes nothing
   * further. The token is not checked against the rest of the request. Omit it and each request
   * updates independently.
   */
  @JsonIgnore
  @QueryParam("request_id")
  private String requestId;

  /** The fields to update. Only 'materialized_features' or '*' is supported. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateMaterializationSetRequest setMaterializationSet(
      MaterializationSet materializationSet) {
    this.materializationSet = materializationSet;
    return this;
  }

  public MaterializationSet getMaterializationSet() {
    return materializationSet;
  }

  public UpdateMaterializationSetRequest setMaterializationSetId(String materializationSetId) {
    this.materializationSetId = materializationSetId;
    return this;
  }

  public String getMaterializationSetId() {
    return materializationSetId;
  }

  public UpdateMaterializationSetRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public UpdateMaterializationSetRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMaterializationSetRequest that = (UpdateMaterializationSetRequest) o;
    return Objects.equals(materializationSet, that.materializationSet)
        && Objects.equals(materializationSetId, that.materializationSetId)
        && Objects.equals(requestId, that.requestId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializationSet, materializationSetId, requestId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMaterializationSetRequest.class)
        .add("materializationSet", materializationSet)
        .add("materializationSetId", materializationSetId)
        .add("requestId", requestId)
        .add("updateMask", updateMask)
        .toString();
  }
}
