// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The GCP cloud options to customize the requested temporary credential */
@Generated
public class GenerateTemporaryServiceCredentialGcpOptions {
  /**
   * The scopes to which the temporary GCP credential should apply. These resources are the scopes
   * that are passed to the token provider (see
   * https://google-auth.readthedocs.io/en/latest/reference/google.auth.html#google.auth.credentials.Credentials)
   */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  public GenerateTemporaryServiceCredentialGcpOptions setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryServiceCredentialGcpOptions that =
        (GenerateTemporaryServiceCredentialGcpOptions) o;
    return Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryServiceCredentialGcpOptions.class)
        .add("scopes", scopes)
        .toString();
  }
}
