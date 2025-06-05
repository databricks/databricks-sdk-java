// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListInstallationsResponsePb {
  @JsonProperty("installations")
  private Collection<InstallationDetail> installations;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListInstallationsResponsePb setInstallations(
      Collection<InstallationDetail> installations) {
    this.installations = installations;
    return this;
  }

  public Collection<InstallationDetail> getInstallations() {
    return installations;
  }

  public ListInstallationsResponsePb setNextPageToken(String nextPageToken) {
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
    ListInstallationsResponsePb that = (ListInstallationsResponsePb) o;
    return Objects.equals(installations, that.installations)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installations, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstallationsResponsePb.class)
        .add("installations", installations)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
