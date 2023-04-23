// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public SecretScope setBackendType(ScopeBackendType backendType) {
    this.backendType = backendType;
    return this;
  }

  public ScopeBackendType getBackendType() {
    return backendType;
  }

  public SecretScope setKeyvaultMetadata(AzureKeyVaultSecretScopeMetadata keyvaultMetadata) {
    this.keyvaultMetadata = keyvaultMetadata;
    return this;
  }

  public AzureKeyVaultSecretScopeMetadata getKeyvaultMetadata() {
    return keyvaultMetadata;
  }

  public SecretScope setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecretScope that = (SecretScope) o;
    return Objects.equals(backendType, that.backendType)
        && Objects.equals(keyvaultMetadata, that.keyvaultMetadata)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendType, keyvaultMetadata, name);
  }

  @Override
  public String toString() {
    return new ToStringer(SecretScope.class)
        .add("backendType", backendType)
        .add("keyvaultMetadata", keyvaultMetadata)
        .add("name", name)
        .toString();
  }
}
