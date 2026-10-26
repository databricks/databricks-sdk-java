// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteMaterializationSetRequest {
  /**
   * Return success instead of NOT_FOUND when the set does not exist, so a repeated destroy is
   * idempotent.
   */
  @JsonIgnore
  @QueryParam("allow_missing")
  private Boolean allowMissing;

  /** The ID of the materialization set to delete. */
  @JsonIgnore private String materializationSetId;

  /**
   * Idempotency token for the request. A second request carrying a token that has already been used
   * returns the operation the first one created, whatever state it reached, and deletes nothing
   * further. The token is not checked against the rest of the request. Omit it and each request
   * deletes independently.
   */
  @JsonIgnore
  @QueryParam("request_id")
  private String requestId;

  public DeleteMaterializationSetRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public DeleteMaterializationSetRequest setMaterializationSetId(String materializationSetId) {
    this.materializationSetId = materializationSetId;
    return this;
  }

  public String getMaterializationSetId() {
    return materializationSetId;
  }

  public DeleteMaterializationSetRequest setRequestId(String requestId) {
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
    DeleteMaterializationSetRequest that = (DeleteMaterializationSetRequest) o;
    return Objects.equals(allowMissing, that.allowMissing)
        && Objects.equals(materializationSetId, that.materializationSetId)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, materializationSetId, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteMaterializationSetRequest.class)
        .add("allowMissing", allowMissing)
        .add("materializationSetId", materializationSetId)
        .add("requestId", requestId)
        .toString();
  }
}
