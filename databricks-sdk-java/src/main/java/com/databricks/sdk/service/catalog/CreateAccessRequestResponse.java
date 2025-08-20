// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateAccessRequestResponse {
  /** The principal the request was made on behalf of. */
  @JsonProperty("behalf_of")
  private Principal behalfOf;

  /** The access request destinations for all the securables the principal requested. */
  @JsonProperty("request_destinations")
  private Collection<AccessRequestDestinations> requestDestinations;

  public CreateAccessRequestResponse setBehalfOf(Principal behalfOf) {
    this.behalfOf = behalfOf;
    return this;
  }

  public Principal getBehalfOf() {
    return behalfOf;
  }

  public CreateAccessRequestResponse setRequestDestinations(
      Collection<AccessRequestDestinations> requestDestinations) {
    this.requestDestinations = requestDestinations;
    return this;
  }

  public Collection<AccessRequestDestinations> getRequestDestinations() {
    return requestDestinations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAccessRequestResponse that = (CreateAccessRequestResponse) o;
    return Objects.equals(behalfOf, that.behalfOf)
        && Objects.equals(requestDestinations, that.requestDestinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behalfOf, requestDestinations);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccessRequestResponse.class)
        .add("behalfOf", behalfOf)
        .add("requestDestinations", requestDestinations)
        .toString();
  }
}
