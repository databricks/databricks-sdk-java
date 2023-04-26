// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AzureKeyVaultSecretScopeMetadata class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AzureKeyVaultSecretScopeMetadata {
  /** The DNS of the KeyVault */
  @JsonProperty("dns_name")
  private String dnsName;

  /** The resource id of the azure KeyVault that user wants to associate the scope with. */
  @JsonProperty("resource_id")
  private String resourceId;

  /**
   * <p>Setter for the field <code>dnsName</code>.</p>
   *
   * @param dnsName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.AzureKeyVaultSecretScopeMetadata} object
   */
  public AzureKeyVaultSecretScopeMetadata setDnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

  /**
   * <p>Getter for the field <code>dnsName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDnsName() {
    return dnsName;
  }

  /**
   * <p>Setter for the field <code>resourceId</code>.</p>
   *
   * @param resourceId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.AzureKeyVaultSecretScopeMetadata} object
   */
  public AzureKeyVaultSecretScopeMetadata setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>resourceId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getResourceId() {
    return resourceId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureKeyVaultSecretScopeMetadata that = (AzureKeyVaultSecretScopeMetadata) o;
    return Objects.equals(dnsName, that.dnsName) && Objects.equals(resourceId, that.resourceId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(dnsName, resourceId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AzureKeyVaultSecretScopeMetadata.class)
        .add("dnsName", dnsName)
        .add("resourceId", resourceId)
        .toString();
  }
}
