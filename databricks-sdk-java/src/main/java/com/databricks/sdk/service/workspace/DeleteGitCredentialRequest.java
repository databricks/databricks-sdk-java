// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a credential */
public class DeleteGitCredentialRequest {
  /** The ID for the corresponding credential to access. */
  private Long credentialId;

  public DeleteGitCredentialRequest setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteGitCredentialRequest that = (DeleteGitCredentialRequest) o;
    return Objects.equals(credentialId, that.credentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteGitCredentialRequest.class)
        .add("credentialId", credentialId)
        .toString();
  }
}
