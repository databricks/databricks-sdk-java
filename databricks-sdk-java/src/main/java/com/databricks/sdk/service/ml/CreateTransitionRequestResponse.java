// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateTransitionRequestResponse {
  /** New activity generated for stage transition request. */
  @JsonProperty("request")
  private TransitionRequest request;

  public CreateTransitionRequestResponse setRequest(TransitionRequest request) {
    this.request = request;
    return this;
  }

  public TransitionRequest getRequest() {
    return request;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTransitionRequestResponse that = (CreateTransitionRequestResponse) o;
    return Objects.equals(request, that.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTransitionRequestResponse.class).add("request", request).toString();
  }
}
