// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Azure Active Directory token, essentially the Oauth token for Azure Service Principal or Managed
 * Identity. Read more at
 * https://learn.microsoft.com/en-us/azure/databricks/dev-tools/api/latest/aad/service-prin-aad-token
 */
@Generated
class AzureActiveDirectoryTokenPb {
  @JsonProperty("aad_token")
  private String aadToken;

  public AzureActiveDirectoryTokenPb setAadToken(String aadToken) {
    this.aadToken = aadToken;
    return this;
  }

  public String getAadToken() {
    return aadToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureActiveDirectoryTokenPb that = (AzureActiveDirectoryTokenPb) o;
    return Objects.equals(aadToken, that.aadToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aadToken);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureActiveDirectoryTokenPb.class).add("aadToken", aadToken).toString();
  }
}
