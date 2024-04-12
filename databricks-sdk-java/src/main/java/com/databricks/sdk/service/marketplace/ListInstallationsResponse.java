// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListInstallationsResponse {
  /** */
  @JsonProperty("installations")
  private Collection<InstallationDetail> installations;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListInstallationsResponse setInstallations(Collection<InstallationDetail> installations) {
    this.installations = installations;
    return this;
  }

  public Collection<InstallationDetail> getInstallations() {
    return installations;
  }

  public ListInstallationsResponse setNextPageToken(String nextPageToken) {
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
    ListInstallationsResponse that = (ListInstallationsResponse) o;
    return Objects.equals(installations, that.installations)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installations, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstallationsResponse.class)
        .add("installations", installations)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
