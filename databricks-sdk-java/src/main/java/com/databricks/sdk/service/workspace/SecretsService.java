// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;

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
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SecretsService {
  /**
   * Creates a new secret scope.
   *
   * <p>The scope name must consist of alphanumeric characters, dashes, underscores, and periods,
   * and may not exceed 128 characters.
   *
   * <p>Example request:
   *
   * <p>.. code::
   *
   * <p>{ "scope": "my-simple-databricks-scope", "initial_manage_principal": "users"
   * "scope_backend_type": "databricks|azure_keyvault", # below is only required if scope type is
   * azure_keyvault "backend_azure_keyvault": { "resource_id":
   * "/subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/xxxx/providers/Microsoft.KeyVault/vaults/xxxx",
   * "tenant_id": "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", "dns_name":
   * "https://xxxx.vault.azure.net/", } }
   *
   * <p>If ``initial_manage_principal`` is specified, the initial ACL applied to the scope is
   * applied to the supplied principal (user or group) with ``MANAGE`` permissions. The only
   * supported principal for this option is the group ``users``, which contains all users in the
   * workspace. If ``initial_manage_principal`` is not specified, the initial ACL with ``MANAGE``
   * permission applied to the scope is assigned to the API request issuer's user identity.
   *
   * <p>If ``scope_backend_type`` is ``azure_keyvault``, a secret scope is created with secrets from
   * a given Azure KeyVault. The caller must provide the keyvault_resource_id and the tenant_id for
   * the key vault. If ``scope_backend_type`` is ``databricks`` or is unspecified, an empty secret
   * scope is created and stored in Databricks's own storage.
   *
   * <p>Throws ``RESOURCE_ALREADY_EXISTS`` if a scope with the given name already exists. Throws
   * ``RESOURCE_LIMIT_EXCEEDED`` if maximum number of scopes in the workspace is exceeded. Throws
   * ``INVALID_PARAMETER_VALUE`` if the scope name is invalid. Throws ``BAD_REQUEST`` if request
   * violated constraints. Throws ``CUSTOMER_UNAUTHORIZED`` if normal user attempts to create a
   * scope with name reserved for databricks internal usage. Throws ``UNAUTHENTICATED`` if unable to
   * verify user access permission on Azure KeyVault
   */
  void createScope(CreateScope createScope);

  /**
   * Deletes the given ACL on the given scope.
   *
   * <p>Users must have the ``MANAGE`` permission to invoke this API.
   *
   * <p>Example request:
   *
   * <p>.. code::
   *
   * <p>{ "scope": "my-secret-scope", "principal": "data-scientists" }
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope, principal, or ACL exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call. Throws
   * ``INVALID_PARAMETER_VALUE`` if the permission or principal is invalid.
   */
  void deleteAcl(DeleteAcl deleteAcl);

  /**
   * Deletes a secret scope.
   *
   * <p>Example request:
   *
   * <p>.. code::
   *
   * <p>{ "scope": "my-secret-scope" }
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if the scope does not exist. Throws ``PERMISSION_DENIED``
   * if the user does not have permission to make this API call. Throws ``BAD_REQUEST`` if system
   * user attempts to delete internal secret scope.
   */
  void deleteScope(DeleteScope deleteScope);

  /**
   * Deletes the secret stored in this secret scope. You must have ``WRITE`` or ``MANAGE``
   * permission on the Secret Scope.
   *
   * <p>Example request:
   *
   * <p>.. code::
   *
   * <p>{ "scope": "my-secret-scope", "key": "my-secret-key" }
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope or secret exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call. Throws
   * ``BAD_REQUEST`` if system user attempts to delete an internal secret, or request is made
   * against Azure KeyVault backed scope.
   */
  void deleteSecret(DeleteSecret deleteSecret);

  /**
   * Describes the details about the given ACL, such as the group and permission.
   *
   * <p>Users must have the ``MANAGE`` permission to invoke this API.
   *
   * <p>Example response:
   *
   * <p>.. code::
   *
   * <p>{ "principal": "data-scientists", "permission": "READ" }
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call. Throws
   * ``INVALID_PARAMETER_VALUE`` if the permission or principal is invalid.
   */
  AclItem getAcl(GetAclRequest getAclRequest);

  /**
   * Gets a secret for a given key and scope. This API can only be called from the DBUtils
   * interface. Users need the READ permission to make this call.
   *
   * <p>Example response:
   *
   * <p>.. code::
   *
   * <p>{ "key": "my-string-key", "value": <bytes of the secret value> }
   *
   * <p>Note that the secret value returned is in bytes. The interpretation of the bytes is
   * determined by the caller in DBUtils and the type the data is decoded into.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret or secret scope exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   *
   * <p>Note: This is explicitly an undocumented API. It also doesn't need to be supported for the
   * /preview prefix, because it's not a customer-facing API (i.e. only used for DBUtils SecretUtils
   * to fetch secrets).
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope or secret exists. Throws
   * ``BAD_REQUEST`` if normal user calls get secret outside of a notebook. AKV specific errors:
   * Throws ``INVALID_PARAMETER_VALUE`` if secret name is not alphanumeric or too long. Throws
   * ``PERMISSION_DENIED`` if secret manager cannot access AKV with 403 error Throws
   * ``MALFORMED_REQUEST`` if secret manager cannot access AKV with any other 4xx error
   */
  GetSecretResponse getSecret(GetSecretRequest getSecretRequest);

  /**
   * Lists the ACLs set on the given scope.
   *
   * <p>Users must have the ``MANAGE`` permission to invoke this API.
   *
   * <p>Example response:
   *
   * <p>.. code::
   *
   * <p>{ "acls": [{ "principal": "admins", "permission": "MANAGE" },{ "principal":
   * "data-scientists", "permission": "READ" }] }
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   */
  ListAclsResponse listAcls(ListAclsRequest listAclsRequest);

  /**
   * Lists all secret scopes available in the workspace.
   *
   * <p>Example response:
   *
   * <p>.. code::
   *
   * <p>{ "scopes": [{ "name": "my-databricks-scope", "backend_type": "DATABRICKS" },{ "name":
   * "mount-points", "backend_type": "DATABRICKS" }] }
   *
   * <p>Throws ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   */
  ListScopesResponse listScopes();

  /**
   * Lists the secret keys that are stored at this scope. This is a metadata-only operation; secret
   * data cannot be retrieved using this API. Users need the READ permission to make this call.
   *
   * <p>Example response:
   *
   * <p>.. code::
   *
   * <p>{ "secrets": [ { "key": "my-string-key"", "last_updated_timestamp": "1520467595000" }, {
   * "key": "my-byte-key", "last_updated_timestamp": "1520467595000" }, ] }
   *
   * <p>The lastUpdatedTimestamp returned is in milliseconds since epoch.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   */
  ListSecretsResponse listSecrets(ListSecretsRequest listSecretsRequest);

  /**
   * Creates or overwrites the ACL associated with the given principal (user or group) on the
   * specified scope point. In general, a user or group will use the most powerful permission
   * available to them, and permissions are ordered as follows:
   *
   * <p>* ``MANAGE`` - Allowed to change ACLs, and read and write to this secret scope. * ``WRITE``
   * - Allowed to read and write to this secret scope. * ``READ`` - Allowed to read this secret
   * scope and list what secrets are available.
   *
   * <p>Note that in general, secret values can only be read from within a command on a cluster (for
   * example, through a notebook). There is no API to read the actual secret value material outside
   * of a cluster. However, the user's permission will be applied based on who is executing the
   * command, and they must have at least READ permission.
   *
   * <p>Users must have the ``MANAGE`` permission to invoke this API.
   *
   * <p>Example request:
   *
   * <p>.. code::
   *
   * <p>{ "scope": "my-secret-scope", "principal": "data-scientists", "permission": "READ" }
   *
   * <p>The principal is a user or group name corresponding to an existing Databricks principal to
   * be granted or revoked access.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``RESOURCE_ALREADY_EXISTS`` if a permission for the principal already exists. Throws
   * ``INVALID_PARAMETER_VALUE`` if the permission or principal is invalid. Throws
   * ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   */
  void putAcl(PutAcl putAcl);

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
   * <p>Example request:
   *
   * <p>.. code::
   *
   * <p>{ "scope": "my-databricks-scope", "key": "my-string-key", "string_value": "foobar" }
   *
   * <p>The input fields "string_value" or "bytes_value" specify the type of the secret, which will
   * determine the value returned when the secret value is requested. Exactly one must be specified.
   *
   * <p>Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret scope exists. Throws
   * ``RESOURCE_LIMIT_EXCEEDED`` if maximum number of secrets in scope is exceeded. Throws
   * ``INVALID_PARAMETER_VALUE`` if the request parameters are invalid. Throws ``PERMISSION_DENIED``
   * if the user does not have permission to make this API call. Throws ``MALFORMED_REQUEST`` if
   * request is incorrectly formatted or conflicting. Throws ``BAD_REQUEST`` if request is made
   * against Azure KeyVault backed scope.
   */
  void putSecret(PutSecret putSecret);
}
