// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateOAuthEnrollment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateOAuthEnrollment {
  /** If true, enable OAuth for all the published applications in the account. */
  @JsonProperty("enable_all_published_apps")
  private Boolean enableAllPublishedApps;

  /**
   * <p>Setter for the field <code>enableAllPublishedApps</code>.</p>
   *
   * @param enableAllPublishedApps a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreateOAuthEnrollment} object
   */
  public CreateOAuthEnrollment setEnableAllPublishedApps(Boolean enableAllPublishedApps) {
    this.enableAllPublishedApps = enableAllPublishedApps;
    return this;
  }

  /**
   * <p>Getter for the field <code>enableAllPublishedApps</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableAllPublishedApps() {
    return enableAllPublishedApps;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOAuthEnrollment that = (CreateOAuthEnrollment) o;
    return Objects.equals(enableAllPublishedApps, that.enableAllPublishedApps);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(enableAllPublishedApps);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateOAuthEnrollment.class)
        .add("enableAllPublishedApps", enableAllPublishedApps)
        .toString();
  }
}
