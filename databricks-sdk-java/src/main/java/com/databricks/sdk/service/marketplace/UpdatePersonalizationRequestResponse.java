// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdatePersonalizationRequestResponse {
  /** */
  @JsonProperty("request")
  private PersonalizationRequest request;

  public UpdatePersonalizationRequestResponse setRequest(PersonalizationRequest request) {
    this.request = request;
    return this;
  }

  public PersonalizationRequest getRequest() {
    return request;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePersonalizationRequestResponse that = (UpdatePersonalizationRequestResponse) o;
    return Objects.equals(request, that.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePersonalizationRequestResponse.class)
        .add("request", request)
        .toString();
  }
}
