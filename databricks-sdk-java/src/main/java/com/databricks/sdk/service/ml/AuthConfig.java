// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AuthConfig {
  /**
   * Name of the Unity Catalog service credential. This value will be set under the option
   * databricks.serviceCredential
   */
  @JsonProperty("uc_service_credential_name")
  private String ucServiceCredentialName;

  public AuthConfig setUcServiceCredentialName(String ucServiceCredentialName) {
    this.ucServiceCredentialName = ucServiceCredentialName;
    return this;
  }

  public String getUcServiceCredentialName() {
    return ucServiceCredentialName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AuthConfig that = (AuthConfig) o;
    return Objects.equals(ucServiceCredentialName, that.ucServiceCredentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ucServiceCredentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(AuthConfig.class)
        .add("ucServiceCredentialName", ucServiceCredentialName)
        .toString();
  }
}
