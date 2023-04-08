// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.secrets;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Secrets API allows you to manage secrets, secret scopes, and access
 * permissions.
 * 
 * Sometimes accessing data requires that you authenticate to external data
 * sources through JDBC. Instead of directly entering your credentials into a
 * notebook, use Databricks secrets to store your credentials and reference them
 * in notebooks and jobs.
 * 
 * Administrators, secret creators, and users granted permission can read
 * Databricks secrets. While Databricks makes an effort to redact secret values
 * that might be displayed in notebooks, it is not possible to prevent such
 * users from reading secrets.
 */
public class SecretsAPI {
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
     * Create a new secret scope.
     * 
     * The scope name must consist of alphanumeric characters, dashes,
     * underscores, and periods, and may not exceed 128 characters. The maximum
     * number of scopes in a workspace is 100.
     */
    public void createScope(CreateScope request) {
        impl.createScope(request);
    }
    
	/**
     * Delete an ACL.
     * 
     * Deletes the given ACL on the given scope.
     * 
     * Users must have the `MANAGE` permission to invoke this API. Throws
     * `RESOURCE_DOES_NOT_EXIST` if no such secret scope, principal, or ACL
     * exists. Throws `PERMISSION_DENIED` if the user does not have permission
     * to make this API call.
     */
    public void deleteAcl(DeleteAcl request) {
        impl.deleteAcl(request);
    }
    
	/**
     * Delete a secret scope.
     * 
     * Deletes a secret scope.
     * 
     * Throws `RESOURCE_DOES_NOT_EXIST` if the scope does not exist. Throws
     * `PERMISSION_DENIED` if the user does not have permission to make this API
     * call.
     */
    public void deleteScope(DeleteScope request) {
        impl.deleteScope(request);
    }
    
	/**
     * Delete a secret.
     * 
     * Deletes the secret stored in this secret scope. You must have `WRITE` or
     * `MANAGE` permission on the secret scope.
     * 
     * Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope or secret
     * exists. Throws `PERMISSION_DENIED` if the user does not have permission
     * to make this API call.
     */
    public void deleteSecret(DeleteSecret request) {
        impl.deleteSecret(request);
    }
    
	/**
     * Get secret ACL details.
     * 
     * Gets the details about the given ACL, such as the group and permission.
     * Users must have the `MANAGE` permission to invoke this API.
     * 
     * Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws
     * `PERMISSION_DENIED` if the user does not have permission to make this API
     * call.
     */
    public AclItem getAcl(GetAcl request) {
        return impl.getAcl(request);
    }
    
	/**
     * Lists ACLs.
     * 
     * List the ACLs for a given secret scope. Users must have the `MANAGE`
     * permission to invoke this API.
     * 
     * Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws
     * `PERMISSION_DENIED` if the user does not have permission to make this API
     * call.
     */
    public ListAclsResponse listAcls(ListAcls request) {
        return impl.listAcls(request);
    }
    
	/**
     * List all scopes.
     * 
     * Lists all secret scopes available in the workspace.
     * 
     * Throws `PERMISSION_DENIED` if the user does not have permission to make
     * this API call.
     */
    public ListScopesResponse listScopes() {
        return impl.listScopes();
    }
    
	/**
     * List secret keys.
     * 
     * Lists the secret keys that are stored at this scope. This is a
     * metadata-only operation; secret data cannot be retrieved using this API.
     * Users need the READ permission to make this call.
     * 
     * The lastUpdatedTimestamp returned is in milliseconds since epoch. Throws
     * `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws
     * `PERMISSION_DENIED` if the user does not have permission to make this API
     * call.
     */
    public ListSecretsResponse listSecrets(ListSecrets request) {
        return impl.listSecrets(request);
    }
    
	/**
     * Create/update an ACL.
     * 
     * Creates or overwrites the Access Control List (ACL) associated with the
     * given principal (user or group) on the specified scope point.
     * 
     * In general, a user or group will use the most powerful permission
     * available to them, and permissions are ordered as follows:
     * 
     * * `MANAGE` - Allowed to change ACLs, and read and write to this secret
     * scope. * `WRITE` - Allowed to read and write to this secret scope. *
     * `READ` - Allowed to read this secret scope and list what secrets are
     * available.
     * 
     * Note that in general, secret values can only be read from within a
     * command on a cluster (for example, through a notebook). There is no API
     * to read the actual secret value material outside of a cluster. However,
     * the user's permission will be applied based on who is executing the
     * command, and they must have at least READ permission.
     * 
     * Users must have the `MANAGE` permission to invoke this API.
     * 
     * The principal is a user or group name corresponding to an existing
     * Databricks principal to be granted or revoked access.
     * 
     * Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws
     * `RESOURCE_ALREADY_EXISTS` if a permission for the principal already
     * exists. Throws `INVALID_PARAMETER_VALUE` if the permission is invalid.
     * Throws `PERMISSION_DENIED` if the user does not have permission to make
     * this API call.
     */
    public void putAcl(PutAcl request) {
        impl.putAcl(request);
    }
    
	/**
     * Add a secret.
     * 
     * Inserts a secret under the provided scope with the given name. If a
     * secret already exists with the same name, this command overwrites the
     * existing secret's value. The server encrypts the secret using the secret
     * scope's encryption settings before storing it.
     * 
     * You must have `WRITE` or `MANAGE` permission on the secret scope. The
     * secret key must consist of alphanumeric characters, dashes, underscores,
     * and periods, and cannot exceed 128 characters. The maximum allowed secret
     * value size is 128 KB. The maximum number of secrets in a given scope is
     * 1000.
     * 
     * The input fields "string_value" or "bytes_value" specify the type of the
     * secret, which will determine the value returned when the secret value is
     * requested. Exactly one must be specified.
     * 
     * Throws `RESOURCE_DOES_NOT_EXIST` if no such secret scope exists. Throws
     * `RESOURCE_LIMIT_EXCEEDED` if maximum number of secrets in scope is
     * exceeded. Throws `INVALID_PARAMETER_VALUE` if the key name or value
     * length is invalid. Throws `PERMISSION_DENIED` if the user does not have
     * permission to make this API call.
     */
    public void putSecret(PutSecret request) {
        impl.putSecret(request);
    }
    
    public SecretsService impl() {
        return impl;
    }
}