// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetPublishedAppIntegrationsOutput {
  /** Array of Published OAuth App Integrations defined for the account. */
  @JsonProperty("apps")
  private Collection<GetPublishedAppIntegrationOutput> apps;

  public GetPublishedAppIntegrationsOutput setApps(
      Collection<GetPublishedAppIntegrationOutput> apps) {
    this.apps = apps;
    return this;
  }

  public Collection<GetPublishedAppIntegrationOutput> getApps() {
    return apps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedAppIntegrationsOutput that = (GetPublishedAppIntegrationsOutput) o;
    return Objects.equals(apps, that.apps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppIntegrationsOutput.class).add("apps", apps).toString();
  }
}
