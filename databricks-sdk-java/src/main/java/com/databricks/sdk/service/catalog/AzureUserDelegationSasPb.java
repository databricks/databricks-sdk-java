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
class AzureUserDelegationSasPb {
  @JsonProperty("sas_token")
  private String sasToken;

  public AzureUserDelegationSasPb setSasToken(String sasToken) {
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
    AzureUserDelegationSasPb that = (AzureUserDelegationSasPb) o;
    return Objects.equals(sasToken, that.sasToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sasToken);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureUserDelegationSasPb.class).add("sasToken", sasToken).toString();
  }
}
