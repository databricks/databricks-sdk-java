// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class BatchCreateAccessRequestsResponse {
  /** The access request destinations for each securable object the principal requested. */
  @JsonProperty("responses")
  private Collection<CreateAccessRequestResponse> responses;

  public BatchCreateAccessRequestsResponse setResponses(
      Collection<CreateAccessRequestResponse> responses) {
    this.responses = responses;
    return this;
  }

  public Collection<CreateAccessRequestResponse> getResponses() {
    return responses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BatchCreateAccessRequestsResponse that = (BatchCreateAccessRequestsResponse) o;
    return Objects.equals(responses, that.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchCreateAccessRequestsResponse.class)
        .add("responses", responses)
        .toString();
  }
}
