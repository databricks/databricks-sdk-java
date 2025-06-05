// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateScopePb {
  @JsonProperty("backend_azure_keyvault")
  private AzureKeyVaultSecretScopeMetadata backendAzureKeyvault;

  @JsonProperty("initial_manage_principal")
  private String initialManagePrincipal;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("scope_backend_type")
  private ScopeBackendType scopeBackendType;

  public CreateScopePb setBackendAzureKeyvault(
      AzureKeyVaultSecretScopeMetadata backendAzureKeyvault) {
    this.backendAzureKeyvault = backendAzureKeyvault;
    return this;
  }

  public AzureKeyVaultSecretScopeMetadata getBackendAzureKeyvault() {
    return backendAzureKeyvault;
  }

  public CreateScopePb setInitialManagePrincipal(String initialManagePrincipal) {
    this.initialManagePrincipal = initialManagePrincipal;
    return this;
  }

  public String getInitialManagePrincipal() {
    return initialManagePrincipal;
  }

  public CreateScopePb setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  public CreateScopePb setScopeBackendType(ScopeBackendType scopeBackendType) {
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
    CreateScopePb that = (CreateScopePb) o;
    return Objects.equals(backendAzureKeyvault, that.backendAzureKeyvault)
        && Objects.equals(initialManagePrincipal, that.initialManagePrincipal)
        && Objects.equals(scope, that.scope)
        && Objects.equals(scopeBackendType, that.scopeBackendType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendAzureKeyvault, initialManagePrincipal, scope, scopeBackendType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateScopePb.class)
        .add("backendAzureKeyvault", backendAzureKeyvault)
        .add("initialManagePrincipal", initialManagePrincipal)
        .add("scope", scope)
        .add("scopeBackendType", scopeBackendType)
        .toString();
  }
}
