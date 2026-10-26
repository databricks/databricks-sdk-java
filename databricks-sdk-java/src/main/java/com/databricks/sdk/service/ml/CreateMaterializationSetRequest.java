// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateMaterializationSetRequest {
  /**
   * The materialization set to create. Supply materialization_set_id to choose the identifier;
   * leave it unset to have one assigned.
   */
  @JsonProperty("materialization_set")
  private MaterializationSet materializationSet;

  /**
   * Idempotency token for the request. A second request carrying a token that has already been used
   * returns the operation the first one created, whatever state it reached, and creates no second
   * set. The token is not checked against the rest of the request, so reusing one for a different
   * set returns the original operation rather than an error. Omit it and each request creates its
   * own set.
   */
  @JsonIgnore
  @QueryParam("request_id")
  private String requestId;

  public CreateMaterializationSetRequest setMaterializationSet(
      MaterializationSet materializationSet) {
    this.materializationSet = materializationSet;
    return this;
  }

  public MaterializationSet getMaterializationSet() {
    return materializationSet;
  }

  public CreateMaterializationSetRequest setRequestId(String requestId) {
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
    CreateMaterializationSetRequest that = (CreateMaterializationSetRequest) o;
    return Objects.equals(materializationSet, that.materializationSet)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializationSet, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMaterializationSetRequest.class)
        .add("materializationSet", materializationSet)
        .add("requestId", requestId)
        .toString();
  }
}
