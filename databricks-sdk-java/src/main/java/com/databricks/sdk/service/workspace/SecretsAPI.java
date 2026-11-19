// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * The Secrets API allows you to manage secrets, secret scopes, and access permissions.
 *
 * <p>Sometimes accessing data requires that you authenticate to external data sources through JDBC.
 * Instead of directly entering your credentials into a notebook, use Databricks secrets to store
 * your credentials and reference them in notebooks and jobs.
 *
 * <p>Administrators, secret creators, and users granted permission can read Databricks secrets.
 * While Databricks makes an effort to redact secret values that might be displayed in notebooks, it
 * is not possible to prevent such users from reading secrets.
 */
@Generated
public class SecretsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SecretsAPI.class);

  private final SecretsService impl;

  /** Regular-use constructor */
  public SecretsAPI(ApiClient apiClient) {
    impl = new SecretsImpl(apiClient);
  }

  /** Constructor for mocks */
  public SecretsAPI(SecretsService mock) {
    impl = mock;
  }

  /**
   * Creates a new secret scope.
   *
   * <p>The scope name must consist of alphanumeric characters, dashes, underscores, and periods,
   * and may not exceed 128 characters.
   *
   * <p>If ``initial_manage_principal`` is specified, the initial ACL applied to the scope is
   * applied to the supplied principal (user or group) with ``MANAGE`` permissions. The only
   * supported principal for this option is the group ``users``, which contains all users in the
   * workspace. If ``initial_manage_principal`` is not specified, the initial ACL with ``MANAGE``
   * permission applied to the scope is assigned to the API request issuer's user identity.
   *
   * <p>If ``scope_backend_type`` is ``AZURE_KEYVAULT``, a secret scope is created with secrets from
   * an existing Azure key vault. The caller must provide the key vault's resource ID and DNS name
   * in ``backend_azure_keyvault``. If ``scope_backend_type`` is ``DATABRICKS`` or is unspecified,
   * an empty secret scope is created and stored in Databricks-managed storage.
   *
   * <p>Throws ``RESOURCE_ALREADY_EXISTS`` if a scope with the given name already exists. Throws
   * ``RESOURCE_LIMIT_EXCEEDED`` if maximum number of scopes in the workspace is exceeded. Throws
   * ``INVALID_PARAMETER_VALUE`` if the scope name is invalid. Throws ``BAD_REQUEST`` if request
   * violated constraints. Throws ``CUSTOMER_UNAUTHORIZED`` if the scope name is reserved for
   * Databricks internal use. Throws ``UNAUTHENTICATED`` if Databricks cannot verify the caller's
   * access to the Azure key vault.
   */
  public void createScope(CreateScope request) {
    impl.createScope(request);
  }

  /**
   * Deletes the given ACL on the given scope.
   *
   * <p>Users must have the ``MANAGE`` permission to invoke this API.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope, principal, or ACL exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call. Throws
   * ``INVALID_PARAMETER_VALUE`` if the permission or principal is invalid.
   */
  public void deleteAcl(DeleteAcl request) {
    impl.deleteAcl(request);
  }

  public void deleteScope(String scope) {
    deleteScope(new DeleteScope().setScope(scope));
  }

  /**
   * Deletes a secret scope.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if the scope does not exist. Throws ``PERMISSION_DENIED``
   * if the user does not have permission to make this API call.
   */
  public void deleteScope(DeleteScope request) {
    impl.deleteScope(request);
  }

  /**
   * Deletes the secret stored in this secret scope. You must have ``WRITE`` or ``MANAGE``
   * permission on the Secret Scope.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope or secret exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call. Throws
   * ``BAD_REQUEST`` if the request is made against an Azure Key Vault-backed scope.
   */
  public void deleteSecret(DeleteSecret request) {
    impl.deleteSecret(request);
  }

  public AclItem getAcl(String scope, String principal) {
    return getAcl(new GetAclRequest().setScope(scope).setPrincipal(principal));
  }

  /**
   * Describes the details about the given ACL, such as the group and permission.
   *
   * <p>Users must have the ``MANAGE`` permission to invoke this API.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call. Throws
   * ``INVALID_PARAMETER_VALUE`` if the permission or principal is invalid.
   */
  public AclItem getAcl(GetAclRequest request) {
    return impl.getAcl(request);
  }

  public GetSecretResponse getSecret(String scope, String key) {
    return getSecret(new GetSecretRequest().setScope(scope).setKey(key));
  }

  /**
   * Gets the bytes representation of a secret value for the specified scope and key. Users need the
   * READ permission to make this call.
   *
   * <p>The secret value is returned as bytes regardless of whether it was written with
   * ``string_value`` or ``bytes_value``, so the caller decides how to decode it. Values returned by
   * this API are not redacted.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret or secret scope exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call. Azure Key
   * Vault-backed scopes can also return the following errors: Throws ``INVALID_PARAMETER_VALUE`` if
   * the secret name is not alphanumeric or is too long. Throws ``PERMISSION_DENIED`` if Databricks
   * cannot access the key vault (HTTP 403). Throws ``MALFORMED_REQUEST`` if Databricks cannot
   * access the key vault with any other 4xx error.
   */
  public GetSecretResponse getSecret(GetSecretRequest request) {
    return impl.getSecret(request);
  }

  public Iterable<AclItem> listAcls(String scope) {
    return listAcls(new ListAclsRequest().setScope(scope));
  }

  /**
   * Lists the ACLs set on the given scope.
   *
   * <p>Users must have the ``MANAGE`` permission to invoke this API.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   */
  public Iterable<AclItem> listAcls(ListAclsRequest request) {
    return Paginator.newOffsetPagination(
        request, impl::listAcls, ListAclsResponse::getItems, response -> null);
  }

  /**
   * Lists all secret scopes available in the workspace.
   *
   * <p>Throws ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   */
  public Iterable<SecretScope> listScopes() {
    return Paginator.newOffsetPagination(
        null, (Void v) -> impl.listScopes(), ListScopesResponse::getScopes, response -> null);
  }

  public Iterable<SecretMetadata> listSecrets(String scope) {
    return listSecrets(new ListSecretsRequest().setScope(scope));
  }

  /**
   * Lists the secret keys that are stored at this scope. This is a metadata-only operation; secret
   * data cannot be retrieved using this API. Users need the READ permission to make this call.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   */
  public Iterable<SecretMetadata> listSecrets(ListSecretsRequest request) {
    return Paginator.newOffsetPagination(
        request, impl::listSecrets, ListSecretsResponse::getSecrets, response -> null);
  }

  /**
   * Creates or overwrites the ACL associated with the given principal (user or group) on the
   * specified scope point. In general, a user or group will use the most powerful permission
   * available to them, and permissions are ordered as follows:
   *
   * <p>* ``MANAGE`` - Allowed to change ACLs, and read and write to this secret scope. * ``WRITE``
   * - Allowed to read and write to this secret scope. * ``READ`` - Allowed to read this secret
   * scope and list what secrets are available.
   *
   * <p>Users must have the ``MANAGE`` permission to invoke this API.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``INVALID_PARAMETER_VALUE`` if the permission or principal is invalid. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   */
  public void putAcl(PutAcl request) {
    impl.putAcl(request);
  }

  /**
   * Inserts a secret under the provided scope with the given name. If a secret already exists with
   * the same name, this command overwrites the existing secret's value. The server encrypts the
   * secret using the secret scope's encryption settings before storing it. You must have ``WRITE``
   * or ``MANAGE`` permission on the secret scope.
   *
   * <p>The secret key must consist of alphanumeric characters, dashes, underscores, and periods,
   * and cannot exceed 128 characters. The maximum allowed secret value size is 128 KB. The maximum
   * number of secrets in a given scope is 1000.
   *
   * <p>Exactly one of ``string_value`` or ``bytes_value`` must be specified. The server stores both
   * kinds of value as bytes and does not record which one was used.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``RESOURCE_LIMIT_EXCEEDED`` if maximum number of secrets in scope is exceeded. Throws
   * ``INVALID_PARAMETER_VALUE`` if the request parameters are invalid. Throws ``PERMISSION_DENIED``
   * if the user does not have permission to make this API call. Throws ``MALFORMED_REQUEST`` if
   * request is incorrectly formatted or conflicting. Throws ``BAD_REQUEST`` if request is made
   * against Azure KeyVault backed scope.
   */
  public void putSecret(PutSecret request) {
    impl.putSecret(request);
  }

  public SecretsService impl() {
    return impl;
  }
}
