// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListSecretsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListSecretsResponse {
  /** Metadata information of all secrets contained within the given scope. */
  @JsonProperty("secrets")
  private Collection<SecretMetadata> secrets;

  /**
   * <p>Setter for the field <code>secrets</code>.</p>
   *
   * @param secrets a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.workspace.ListSecretsResponse} object
   */
  public ListSecretsResponse setSecrets(Collection<SecretMetadata> secrets) {
    this.secrets = secrets;
    return this;
  }

  /**
   * <p>Getter for the field <code>secrets</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<SecretMetadata> getSecrets() {
    return secrets;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSecretsResponse that = (ListSecretsResponse) o;
    return Objects.equals(secrets, that.secrets);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(secrets);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListSecretsResponse.class).add("secrets", secrets).toString();
  }
}
