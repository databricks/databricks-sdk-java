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
public class AzureActiveDirectoryToken {
  /**
   * Opaque token that contains claims that you can use in Azure Active Directory to access cloud
   * services.
   */
  @JsonProperty("aad_token")
  private String aadToken;

  public AzureActiveDirectoryToken setAadToken(String aadToken) {
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
    AzureActiveDirectoryToken that = (AzureActiveDirectoryToken) o;
    return Objects.equals(aadToken, that.aadToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aadToken);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureActiveDirectoryToken.class).add("aadToken", aadToken).toString();
  }
}
