// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateScope class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>initialManagePrincipal</code>.</p>
   *
   * @param initialManagePrincipal a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateScope} object
   */
  public CreateScope setInitialManagePrincipal(String initialManagePrincipal) {
    this.initialManagePrincipal = initialManagePrincipal;
    return this;
  }

  /**
   * <p>Getter for the field <code>initialManagePrincipal</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInitialManagePrincipal() {
    return initialManagePrincipal;
  }

  /**
   * <p>Setter for the field <code>keyvaultMetadata</code>.</p>
   *
   * @param keyvaultMetadata a {@link com.databricks.sdk.service.workspace.AzureKeyVaultSecretScopeMetadata} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateScope} object
   */
  public CreateScope setKeyvaultMetadata(AzureKeyVaultSecretScopeMetadata keyvaultMetadata) {
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
   * <p>Setter for the field <code>scope</code>.</p>
   *
   * @param scope a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateScope} object
   */
  public CreateScope setScope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>Getter for the field <code>scope</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScope() {
    return scope;
  }

  /**
   * <p>Setter for the field <code>scopeBackendType</code>.</p>
   *
   * @param scopeBackendType a {@link com.databricks.sdk.service.workspace.ScopeBackendType} object
   * @return a {@link com.databricks.sdk.service.workspace.CreateScope} object
   */
  public CreateScope setScopeBackendType(ScopeBackendType scopeBackendType) {
    this.scopeBackendType = scopeBackendType;
    return this;
  }

  /**
   * <p>Getter for the field <code>scopeBackendType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.ScopeBackendType} object
   */
  public ScopeBackendType getScopeBackendType() {
    return scopeBackendType;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(initialManagePrincipal, keyvaultMetadata, scope, scopeBackendType);
  }

  /** {@inheritDoc} */
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
