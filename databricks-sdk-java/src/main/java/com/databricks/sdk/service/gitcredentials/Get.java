// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get a credential entry */
public class Get {
  /** The ID for the corresponding credential to access. */
  private Long credentialId;

  public Get setCredentialId(Long credentialId) {
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
    Get that = (Get) o;
    return Objects.equals(credentialId, that.credentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId);
  }

  @Override
  public String toString() {
    return new ToStringer(Get.class).add("credentialId", credentialId).toString();
  }
}
