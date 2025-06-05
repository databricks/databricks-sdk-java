// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AzureKeyVaultSecretScopeMetadataPb {
  @JsonProperty("dns_name")
  private String dnsName;

  @JsonProperty("resource_id")
  private String resourceId;

  public AzureKeyVaultSecretScopeMetadataPb setDnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

  public String getDnsName() {
    return dnsName;
  }

  public AzureKeyVaultSecretScopeMetadataPb setResourceId(String resourceId) {
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
    AzureKeyVaultSecretScopeMetadataPb that = (AzureKeyVaultSecretScopeMetadataPb) o;
    return Objects.equals(dnsName, that.dnsName) && Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsName, resourceId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureKeyVaultSecretScopeMetadataPb.class)
        .add("dnsName", dnsName)
        .add("resourceId", resourceId)
        .toString();
  }
}
