// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AzureKeyVaultSecretScopeMetadata {
  /** The DNS of the KeyVault */
  @JsonProperty("dns_name")
  private String dnsName;

  /** The resource id of the azure KeyVault that user wants to associate the scope with. */
  @JsonProperty("resource_id")
  private String resourceId;

  public AzureKeyVaultSecretScopeMetadata setDnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

  public String getDnsName() {
    return dnsName;
  }

  public AzureKeyVaultSecretScopeMetadata setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureKeyVaultSecretScopeMetadata that = (AzureKeyVaultSecretScopeMetadata) o;
    return Objects.equals(dnsName, that.dnsName) && Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsName, resourceId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureKeyVaultSecretScopeMetadata.class)
        .add("dnsName", dnsName)
        .add("resourceId", resourceId)
        .toString();
  }
}
