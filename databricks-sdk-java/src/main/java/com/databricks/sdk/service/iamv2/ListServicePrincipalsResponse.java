// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of service principals. */
@Generated
public class ListServicePrincipalsResponse {
  /** The token for the next page. Not set on the last page. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The service principals on this page. */
  @JsonProperty("service_principals")
  private Collection<ServicePrincipal> servicePrincipals;

  public ListServicePrincipalsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListServicePrincipalsResponse setServicePrincipals(
      Collection<ServicePrincipal> servicePrincipals) {
    this.servicePrincipals = servicePrincipals;
    return this;
  }

  public Collection<ServicePrincipal> getServicePrincipals() {
    return servicePrincipals;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalsResponse that = (ListServicePrincipalsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(servicePrincipals, that.servicePrincipals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, servicePrincipals);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("servicePrincipals", servicePrincipals)
        .toString();
  }
}
