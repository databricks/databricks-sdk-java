// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetPublishedAppIntegrationsOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetPublishedAppIntegrationsOutput {
  /** Array of Published OAuth App Integrations defined for the account. */
  @JsonProperty("apps")
  private Collection<GetPublishedAppIntegrationOutput> apps;

  /**
   * <p>Setter for the field <code>apps</code>.</p>
   *
   * @param apps a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationsOutput} object
   */
  public GetPublishedAppIntegrationsOutput setApps(
      Collection<GetPublishedAppIntegrationOutput> apps) {
    this.apps = apps;
    return this;
  }

  /**
   * <p>Getter for the field <code>apps</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<GetPublishedAppIntegrationOutput> getApps() {
    return apps;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedAppIntegrationsOutput that = (GetPublishedAppIntegrationsOutput) o;
    return Objects.equals(apps, that.apps);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(apps);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppIntegrationsOutput.class).add("apps", apps).toString();
  }
}
