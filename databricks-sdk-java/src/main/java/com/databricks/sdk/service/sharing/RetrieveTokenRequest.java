// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get an access token
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RetrieveTokenRequest {
  /** The one time activation url. It also accepts activation token. */
  private String activationUrl;

  /**
   * <p>Setter for the field <code>activationUrl</code>.</p>
   *
   * @param activationUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RetrieveTokenRequest} object
   */
  public RetrieveTokenRequest setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>activationUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getActivationUrl() {
    return activationUrl;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RetrieveTokenRequest that = (RetrieveTokenRequest) o;
    return Objects.equals(activationUrl, that.activationUrl);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(activationUrl);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RetrieveTokenRequest.class)
        .add("activationUrl", activationUrl)
        .toString();
  }
}
