// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetCustomAppIntegrationsOutputPb {
  @JsonProperty("apps")
  private Collection<GetCustomAppIntegrationOutput> apps;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GetCustomAppIntegrationsOutputPb setApps(Collection<GetCustomAppIntegrationOutput> apps) {
    this.apps = apps;
    return this;
  }

  public Collection<GetCustomAppIntegrationOutput> getApps() {
    return apps;
  }

  public GetCustomAppIntegrationsOutputPb setNextPageToken(String nextPageToken) {
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
    GetCustomAppIntegrationsOutputPb that = (GetCustomAppIntegrationsOutputPb) o;
    return Objects.equals(apps, that.apps) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCustomAppIntegrationsOutputPb.class)
        .add("apps", apps)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
