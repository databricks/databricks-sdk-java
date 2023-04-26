// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SecretScope class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SecretScope {
  /** The type of secret scope backend. */
  @JsonProperty("backend_type")
  private ScopeBackendType backendType;

  /** The metadata for the secret scope if the type is `AZURE_KEYVAULT` */
  @JsonProperty("keyvault_metadata")
  private AzureKeyVaultSecretScopeMetadata keyvaultMetadata;

  /** A unique name to identify the secret scope. */
  @JsonProperty("name")
  private String name;

  /**
   * <p>Setter for the field <code>backendType</code>.</p>
   *
   * @param backendType a {@link com.databricks.sdk.service.workspace.ScopeBackendType} object
   * @return a {@link com.databricks.sdk.service.workspace.SecretScope} object
   */
  public SecretScope setBackendType(ScopeBackendType backendType) {
    this.backendType = backendType;
    return this;
  }

  /**
   * <p>Getter for the field <code>backendType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.ScopeBackendType} object
   */
  public ScopeBackendType getBackendType() {
    return backendType;
  }

  /**
   * <p>Setter for the field <code>keyvaultMetadata</code>.</p>
   *
   * @param keyvaultMetadata a {@link com.databricks.sdk.service.workspace.AzureKeyVaultSecretScopeMetadata} object
   * @return a {@link com.databricks.sdk.service.workspace.SecretScope} object
   */
  public SecretScope setKeyvaultMetadata(AzureKeyVaultSecretScopeMetadata keyvaultMetadata) {
    this.keyvaultMetadata = keyvaultMetadata;
    return this;
  }

  /**
   * <p>Getter for the field <code>keyvaultMetadata</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.AzureKeyVaultSecretScopeMetadata} object
   */
  public AzureKeyVaultSecretScopeMetadata getKeyvaultMetadata() {
    return keyvaultMetadata;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.SecretScope} object
   */
  public SecretScope setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecretScope that = (SecretScope) o;
    return Objects.equals(backendType, that.backendType)
        && Objects.equals(keyvaultMetadata, that.keyvaultMetadata)
        && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(backendType, keyvaultMetadata, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SecretScope.class)
        .add("backendType", backendType)
        .add("keyvaultMetadata", keyvaultMetadata)
        .add("name", name)
        .toString();
  }
}
