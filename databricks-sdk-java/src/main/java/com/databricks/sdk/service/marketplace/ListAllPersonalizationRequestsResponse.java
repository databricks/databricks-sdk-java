// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListAllPersonalizationRequestsResponse {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("personalization_requests")
  private Collection<PersonalizationRequest> personalizationRequests;

  public ListAllPersonalizationRequestsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListAllPersonalizationRequestsResponse setPersonalizationRequests(
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
    ListAllPersonalizationRequestsResponse that = (ListAllPersonalizationRequestsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(personalizationRequests, that.personalizationRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, personalizationRequests);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAllPersonalizationRequestsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("personalizationRequests", personalizationRequests)
        .toString();
  }
}
