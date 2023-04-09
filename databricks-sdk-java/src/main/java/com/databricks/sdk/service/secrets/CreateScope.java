// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateScope {
  /** The principal that is initially granted `MANAGE` permission to the created scope. */
  @JsonProperty("initial_manage_principal")
  private String initialManagePrincipal;

  /** The metadata for the secret scope if the type is `AZURE_KEYVAULT` */
  @JsonProperty("keyvault_metadata")
  private AzureKeyVaultSecretScopeMetadata keyvaultMetadata;

  /** Scope name requested by the user. Scope names are unique. */
  @JsonProperty("scope")
  private String scope;

  /**
   * The backend type the scope will be created with. If not specified, will default to `DATABRICKS`
   */
  @JsonProperty("scope_backend_type")
  private ScopeBackendType scopeBackendType;

  public CreateScope setInitialManagePrincipal(String initialManagePrincipal) {
    this.initialManagePrincipal = initialManagePrincipal;
    return this;
  }

  public String getInitialManagePrincipal() {
    return initialManagePrincipal;
  }

  public CreateScope setKeyvaultMetadata(AzureKeyVaultSecretScopeMetadata keyvaultMetadata) {
    this.keyvaultMetadata = keyvaultMetadata;
    return this;
  }

  public AzureKeyVaultSecretScopeMetadata getKeyvaultMetadata() {
    return keyvaultMetadata;
  }

  public CreateScope setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  public CreateScope setScopeBackendType(ScopeBackendType scopeBackendType) {
    this.scopeBackendType = scopeBackendType;
    return this;
  }

  public ScopeBackendType getScopeBackendType() {
    return scopeBackendType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateScope that = (CreateScope) o;
    return Objects.equals(initialManagePrincipal, that.initialManagePrincipal)
        && Objects.equals(keyvaultMetadata, that.keyvaultMetadata)
        && Objects.equals(scope, that.scope)
        && Objects.equals(scopeBackendType, that.scopeBackendType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialManagePrincipal, keyvaultMetadata, scope, scopeBackendType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateScope.class)
        .add("initialManagePrincipal", initialManagePrincipal)
        .add("keyvaultMetadata", keyvaultMetadata)
        .add("scope", scope)
        .add("scopeBackendType", scopeBackendType)
        .toString();
  }
}
