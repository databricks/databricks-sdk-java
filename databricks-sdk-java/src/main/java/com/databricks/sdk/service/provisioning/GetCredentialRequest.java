// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get credential configuration
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetCredentialRequest {
  /** Databricks Account API credential configuration ID */
  private String credentialsId;

  /**
   * <p>Setter for the field <code>credentialsId</code>.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GetCredentialRequest} object
   */
  public GetCredentialRequest setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialsId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialsId() {
    return credentialsId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialRequest that = (GetCredentialRequest) o;
    return Objects.equals(credentialsId, that.credentialsId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(credentialsId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetCredentialRequest.class)
        .add("credentialsId", credentialsId)
        .toString();
  }
}
