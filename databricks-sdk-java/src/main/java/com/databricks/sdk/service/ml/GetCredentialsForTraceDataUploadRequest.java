// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get credentials to upload trace data */
@Generated
public class GetCredentialsForTraceDataUploadRequest {
  /** The ID of the trace to fetch artifact upload credentials for. */
  @JsonIgnore private String requestId;

  public GetCredentialsForTraceDataUploadRequest setRequestId(String requestId) {
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
    GetCredentialsForTraceDataUploadRequest that = (GetCredentialsForTraceDataUploadRequest) o;
    return Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialsForTraceDataUploadRequest.class)
        .add("requestId", requestId)
        .toString();
  }
}
