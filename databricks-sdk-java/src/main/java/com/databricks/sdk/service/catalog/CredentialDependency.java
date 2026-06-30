// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A credential that is dependent on a SQL object. */
@Generated
public class CredentialDependency {
  /** Full name of the dependent credential, in the form of __credential_name__. */
  @JsonProperty("credential_name")
  private String credentialName;

  public CredentialDependency setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CredentialDependency that = (CredentialDependency) o;
    return Objects.equals(credentialName, that.credentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(CredentialDependency.class)
        .add("credentialName", credentialName)
        .toString();
  }
}
