// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a credential
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteGitCredentialRequest {
  /** The ID for the corresponding credential to access. */
  private Long credentialId;

  /**
   * <p>Setter for the field <code>credentialId</code>.</p>
   *
   * @param credentialId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.DeleteGitCredentialRequest} object
   */
  public DeleteGitCredentialRequest setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCredentialId() {
    return credentialId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteGitCredentialRequest that = (DeleteGitCredentialRequest) o;
    return Objects.equals(credentialId, that.credentialId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(credentialId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteGitCredentialRequest.class)
        .add("credentialId", credentialId)
        .toString();
  }
}
