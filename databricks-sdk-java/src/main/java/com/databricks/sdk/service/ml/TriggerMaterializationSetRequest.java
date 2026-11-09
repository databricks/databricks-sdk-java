// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request to trigger materialization for a materialization set. */
@Generated
public class TriggerMaterializationSetRequest {
  /** The ID of the materialization set to trigger. */
  @JsonIgnore private String materializationSetId;

  /**
   * Idempotency token in UUID format. Reusing it returns the original operation without starting
   * additional runs, even if the request differs or the operation has finished. If omitted, each
   * request triggers independently.
   */
  @JsonProperty("request_id")
  private String requestId;

  public TriggerMaterializationSetRequest setMaterializationSetId(String materializationSetId) {
    this.materializationSetId = materializationSetId;
    return this;
  }

  public String getMaterializationSetId() {
    return materializationSetId;
  }

  public TriggerMaterializationSetRequest setRequestId(String requestId) {
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
    TriggerMaterializationSetRequest that = (TriggerMaterializationSetRequest) o;
    return Objects.equals(materializationSetId, that.materializationSetId)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializationSetId, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerMaterializationSetRequest.class)
        .add("materializationSetId", materializationSetId)
        .add("requestId", requestId)
        .toString();
  }
}
