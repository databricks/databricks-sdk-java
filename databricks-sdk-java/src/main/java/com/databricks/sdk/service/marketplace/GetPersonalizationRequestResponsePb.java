// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetPersonalizationRequestResponsePb {
  @JsonProperty("personalization_requests")
  private Collection<PersonalizationRequest> personalizationRequests;

  public GetPersonalizationRequestResponsePb setPersonalizationRequests(
      Collection<PersonalizationRequest> personalizationRequests) {
    this.personalizationRequests = personalizationRequests;
    return this;
  }

  public Collection<PersonalizationRequest> getPersonalizationRequests() {
    return personalizationRequests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPersonalizationRequestResponsePb that = (GetPersonalizationRequestResponsePb) o;
    return Objects.equals(personalizationRequests, that.personalizationRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalizationRequests);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPersonalizationRequestResponsePb.class)
        .add("personalizationRequests", personalizationRequests)
        .toString();
  }
}
