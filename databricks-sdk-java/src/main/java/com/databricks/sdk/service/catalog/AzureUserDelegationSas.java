// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Azure temporary credentials for API authentication. Read more at
 * https://docs.microsoft.com/en-us/rest/api/storageservices/create-user-delegation-sas
 */
@Generated
public class AzureUserDelegationSas {
  /** The signed URI (SAS Token) used to access blob services for a given path */
  @JsonProperty("sas_token")
  private String sasToken;

  public AzureUserDelegationSas setSasToken(String sasToken) {
    this.sasToken = sasToken;
    return this;
  }

  public String getSasToken() {
    return sasToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureUserDelegationSas that = (AzureUserDelegationSas) o;
    return Objects.equals(sasToken, that.sasToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sasToken);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureUserDelegationSas.class).add("sasToken", sasToken).toString();
  }
}
