// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>OAuthEnrollmentStatus class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class OAuthEnrollmentStatus {
  /** Is OAuth enrolled for the account. */
  @JsonProperty("is_enabled")
  private Boolean isEnabled;

  /**
   * <p>Setter for the field <code>isEnabled</code>.</p>
   *
   * @param isEnabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.oauth2.OAuthEnrollmentStatus} object
   */
  public OAuthEnrollmentStatus setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>isEnabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OAuthEnrollmentStatus that = (OAuthEnrollmentStatus) o;
    return Objects.equals(isEnabled, that.isEnabled);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(isEnabled);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(OAuthEnrollmentStatus.class).add("isEnabled", isEnabled).toString();
  }
}
