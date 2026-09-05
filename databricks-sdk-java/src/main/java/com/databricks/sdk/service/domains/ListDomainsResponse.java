// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.domains;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDomainsResponse {
  /** */
  @JsonProperty("domains")
  private Collection<Domain> domains;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDomainsResponse setDomains(Collection<Domain> domains) {
    this.domains = domains;
    return this;
  }

  public Collection<Domain> getDomains() {
    return domains;
  }

  public ListDomainsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDomainsResponse that = (ListDomainsResponse) o;
    return Objects.equals(domains, that.domains)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDomainsResponse.class)
        .add("domains", domains)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
