// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  public void createScope(String scope) {
    createScope(new CreateScope().setScope(scope));
  }

  /**
   * The scope name must consist of alphanumeric characters, dashes, underscores, and periods, and
   * may not exceed 128 characters.
   */
  public void createScope(CreateScope request) {
    impl.createScope(request);
  }

  public void deleteAcl(String scope, String principal) {
    deleteAcl(new DeleteAcl().setScope(scope).setPrincipal(principal));
  }

  /**
   * Deletes the given ACL on the given scope.
   *
   * <p>Users must have the `MANAGE` permission to invoke this API. Throws `RESOURCE_DOES_NOT_EXIST`
   * if no such secret scope, principal, or ACL exists. Throws `PERMISSION_DENIED` if the user does
   * not have permission to make this API call.
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
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if the scope does not exist. Throws `PERMISSION_DENIED` if
   * the user does not have permission to make this API call.
   */
  public void deleteScope(DeleteScope request) {
    impl.deleteScope(request);
  }

  public void deleteSecret(String scope, String key) {
    deleteSecret(new DeleteSecret().setScope(scope).setKey(key));
  }

  /**
   * Deletes the secret stored in this secret scope. You must have `WRITE` or `MANAGE` permission on
   * the secret scope.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope or secret exists. Throws
   * `PERMISSION_DENIED` if the user does not have permission to make this API call.
   */
  public void deleteSecret(DeleteSecret request) {
    impl.deleteSecret(request);
  }

  public AclItem getAcl(String scope, String principal) {
    return getAcl(new GetAclRequest().setScope(scope).setPrincipal(principal));
  }

  /**
   * Gets the details about the given ACL, such as the group and permission. Users must have the
   * `MANAGE` permission to invoke this API.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws `PERMISSION_DENIED`
   * if the user does not have permission to make this API call.
   */
  public AclItem getAcl(GetAclRequest request) {
    return impl.getAcl(request);
  }

  public GetSecretResponse getSecret(String scope, String key) {
    return getSecret(new GetSecretRequest().setScope(scope).setKey(key));
  }

  /**
   * Gets the bytes representation of a secret value for the specified scope and key.
   *
   * <p>Users need the READ permission to make this call.
   *
   * <p>Note that the secret value returned is in bytes. The interpretation of the bytes is
   * determined by the caller in DBUtils and the type the data is decoded into.
   *
   * <p>Throws ``PERMISSION_DENIED`` if the user does not have permission to make this API call.
   * Throws ``RESOURCE_DOES_NOT_EXIST`` if no such secret or secret scope exists.
   */
  public GetSecretResponse getSecret(GetSecretRequest request) {
    return impl.getSecret(request);
  }

  public Iterable<AclItem> listAcls(String scope) {
    return listAcls(new ListAclsRequest().setScope(scope));
  }

  /**
   * List the ACLs for a given secret scope. Users must have the `MANAGE` permission to invoke this
   * API.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws `PERMISSION_DENIED`
   * if the user does not have permission to make this API call.
   */
  public Iterable<AclItem> listAcls(ListAclsRequest request) {
    return new Paginator<>(request, impl::listAcls, ListAclsResponse::getItems, response -> null);
  }

  /**
   * Lists all secret scopes available in the workspace.
   *
   * <p>Throws `PERMISSION_DENIED` if the user does not have permission to make this API call.
   */
  public Iterable<SecretScope> listScopes() {
    return new Paginator<>(
        null, (Void v) -> impl.listScopes(), ListScopesResponse::getScopes, response -> null);
  }

  public Iterable<SecretMetadata> listSecrets(String scope) {
    return listSecrets(new ListSecretsRequest().setScope(scope));
  }

  /**
   * Lists the secret keys that are stored at this scope. This is a metadata-only operation; secret
   * data cannot be retrieved using this API. Users need the READ permission to make this call.
   *
   * <p>The lastUpdatedTimestamp returned is in milliseconds since epoch. Throws
   * `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws `PERMISSION_DENIED` if the
   * user does not have permission to make this API call.
   */
  public Iterable<SecretMetadata> listSecrets(ListSecretsRequest request) {
    return new Paginator<>(
        request, impl::listSecrets, ListSecretsResponse::getSecrets, response -> null);
  }

  public void putAcl(String scope, String principal, AclPermission permission) {
    putAcl(new PutAcl().setScope(scope).setPrincipal(principal).setPermission(permission));
  }

  /**
   * Creates or overwrites the Access Control List (ACL) associated with the given principal (user
   * or group) on the specified scope point.
   *
   * <p>In general, a user or group will use the most powerful permission available to them, and
   * permissions are ordered as follows:
   *
   * <p>* `MANAGE` - Allowed to change ACLs, and read and write to this secret scope. * `WRITE` -
   * Allowed to read and write to this secret scope. * `READ` - Allowed to read this secret scope
   * and list what secrets are available.
   *
   * <p>Note that in general, secret values can only be read from within a command on a cluster (for
   * example, through a notebook). There is no API to read the actual secret value material outside
   * of a cluster. However, the user's permission will be applied based on who is executing the
   * command, and they must have at least READ permission.
   *
   * <p>Users must have the `MANAGE` permission to invoke this API.
   *
   * <p>The principal is a user or group name corresponding to an existing Databricks principal to
   * be granted or revoked access.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws
   * `RESOURCE_ALREADY_EXISTS` if a permission for the principal already exists. Throws
   * `INVALID_PARAMETER_VALUE` if the permission or principal is invalid. Throws `PERMISSION_DENIED`
   * if the user does not have permission to make this API call.
   */
  public void putAcl(PutAcl request) {
    impl.putAcl(request);
  }

  public void putSecret(String scope, String key) {
    putSecret(new PutSecret().setScope(scope).setKey(key));
  }

  /**
   * Inserts a secret under the provided scope with the given name. If a secret already exists with
   * the same name, this command overwrites the existing secret's value. The server encrypts the
   * secret using the secret scope's encryption settings before storing it.
   *
   * <p>You must have `WRITE` or `MANAGE` permission on the secret scope. The secret key must
   * consist of alphanumeric characters, dashes, underscores, and periods, and cannot exceed 128
   * characters. The maximum allowed secret value size is 128 KB. The maximum number of secrets in a
   * given scope is 1000.
   *
   * <p>The input fields "string_value" or "bytes_value" specify the type of the secret, which will
   * determine the value returned when the secret value is requested. Exactly one must be specified.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws
   * `RESOURCE_LIMIT_EXCEEDED` if maximum number of secrets in scope is exceeded. Throws
   * `INVALID_PARAMETER_VALUE` if the key name or value length is invalid. Throws
   * `PERMISSION_DENIED` if the user does not have permission to make this API call.
   */
  public void putSecret(PutSecret request) {
    impl.putSecret(request);
  }

  public SecretsService impl() {
    return impl;
  }
}
