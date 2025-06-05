// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListServicePrincipalSecretsResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("secrets")
  private Collection<SecretInfo> secrets;

  public ListServicePrincipalSecretsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListServicePrincipalSecretsResponsePb setSecrets(Collection<SecretInfo> secrets) {
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
    ListServicePrincipalSecretsResponsePb that = (ListServicePrincipalSecretsResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(secrets, that.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, secrets);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalSecretsResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("secrets", secrets)
        .toString();
  }
}
