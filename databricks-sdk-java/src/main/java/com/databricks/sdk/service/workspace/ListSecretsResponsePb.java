// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListSecretsResponsePb {
  @JsonProperty("secrets")
  private Collection<SecretMetadata> secrets;

  public ListSecretsResponsePb setSecrets(Collection<SecretMetadata> secrets) {
    this.secrets = secrets;
    return this;
  }

  public Collection<SecretMetadata> getSecrets() {
    return secrets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSecretsResponsePb that = (ListSecretsResponsePb) o;
    return Objects.equals(secrets, that.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secrets);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSecretsResponsePb.class).add("secrets", secrets).toString();
  }
}
