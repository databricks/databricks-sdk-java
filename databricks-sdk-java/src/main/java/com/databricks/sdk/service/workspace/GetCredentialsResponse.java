// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetCredentialsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetCredentialsResponse {
  /** */
  @JsonProperty("credentials")
  private Collection<CredentialInfo> credentials;

  /**
   * <p>Setter for the field <code>credentials</code>.</p>
   *
   * @param credentials a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.workspace.GetCredentialsResponse} object
   */
  public GetCredentialsResponse setCredentials(Collection<CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentials</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<CredentialInfo> getCredentials() {
    return credentials;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialsResponse that = (GetCredentialsResponse) o;
    return Objects.equals(credentials, that.credentials);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(credentials);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetCredentialsResponse.class).add("credentials", credentials).toString();
  }
}
