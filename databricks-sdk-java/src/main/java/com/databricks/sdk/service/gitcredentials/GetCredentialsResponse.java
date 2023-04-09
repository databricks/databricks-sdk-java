// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.gitcredentials;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class GetCredentialsResponse {
  /** */
  @JsonProperty("credentials")
  private Collection<CredentialInfo> credentials;

  public GetCredentialsResponse setCredentials(Collection<CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Collection<CredentialInfo> getCredentials() {
    return credentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCredentialsResponse that = (GetCredentialsResponse) o;
    return Objects.equals(credentials, that.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialsResponse.class).add("credentials", credentials).toString();
  }
}
