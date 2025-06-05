// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateTransitionRequestResponsePb {
  @JsonProperty("request")
  private TransitionRequest request;

  public CreateTransitionRequestResponsePb setRequest(TransitionRequest request) {
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
    CreateTransitionRequestResponsePb that = (CreateTransitionRequestResponsePb) o;
    return Objects.equals(request, that.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTransitionRequestResponsePb.class)
        .add("request", request)
        .toString();
  }
}
