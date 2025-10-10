// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** TODO: Write description later when this method is implemented */
@Generated
public class ListServicePrincipalsResponse {
  /**
   * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
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
