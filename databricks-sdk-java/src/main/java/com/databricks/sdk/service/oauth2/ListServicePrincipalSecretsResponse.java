// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListServicePrincipalSecretsResponse {
  /** List of the secrets */
  @JsonProperty("secrets")
  private Collection<SecretInfo> secrets;

  public ListServicePrincipalSecretsResponse setSecrets(Collection<SecretInfo> secrets) {
    this.secrets = secrets;
    return this;
  }

  public Collection<SecretInfo> getSecrets() {
    return secrets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalSecretsResponse that = (ListServicePrincipalSecretsResponse) o;
    return Objects.equals(secrets, that.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secrets);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalSecretsResponse.class)
        .add("secrets", secrets)
        .toString();
  }
}
