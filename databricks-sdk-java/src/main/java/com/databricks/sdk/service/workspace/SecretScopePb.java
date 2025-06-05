// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SecretScopePb {
  @JsonProperty("backend_type")
  private ScopeBackendType backendType;

  @JsonProperty("keyvault_metadata")
  private AzureKeyVaultSecretScopeMetadata keyvaultMetadata;

  @JsonProperty("name")
  private String name;

  public SecretScopePb setBackendType(ScopeBackendType backendType) {
    this.backendType = backendType;
    return this;
  }

  public ScopeBackendType getBackendType() {
    return backendType;
  }

  public SecretScopePb setKeyvaultMetadata(AzureKeyVaultSecretScopeMetadata keyvaultMetadata) {
    this.keyvaultMetadata = keyvaultMetadata;
    return this;
  }

  public AzureKeyVaultSecretScopeMetadata getKeyvaultMetadata() {
    return keyvaultMetadata;
  }

  public SecretScopePb setName(String name) {
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
    SecretScopePb that = (SecretScopePb) o;
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
    return new ToStringer(SecretScopePb.class)
        .add("backendType", backendType)
        .add("keyvaultMetadata", keyvaultMetadata)
        .add("name", name)
        .toString();
  }
}
