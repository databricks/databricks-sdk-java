// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A credential represents an authentication and authorization mechanism for accessing services on
 * your cloud tenant. Each credential is subject to Unity Catalog access-control policies that
 * control which users and groups can access the credential.
 *
 * <p>To create credentials, you must be a Databricks account admin or have the `CREATE SERVICE
 * CREDENTIAL` privilege. The user who creates the credential can delegate ownership to another user
 * or group to manage permissions on it.
 */
@Generated
public class CredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CredentialsAPI.class);

  private final CredentialsService impl;

  /** Regular-use constructor */
  public CredentialsAPI(ApiClient apiClient) {
    impl = new CredentialsImpl(apiClient);
  }

  /** Constructor for mocks */
  public CredentialsAPI(CredentialsService mock) {
    impl = mock;
  }

  public CredentialInfo createCredential(String name) {
    return createCredential(new CreateCredentialRequest().setName(name));
  }

  /**
   * Create a credential.
   *
   * <p>Creates a new credential. The type of credential to be created is determined by the
   * **purpose** field, which should be either **SERVICE** or **STORAGE**.
   *
   * <p>The caller must be a metastore admin or have the metastore privilege
   * **CREATE_STORAGE_CREDENTIAL** for storage credentials, or **CREATE_SERVICE_CREDENTIAL** for
   * service credentials.
   */
  public CredentialInfo createCredential(CreateCredentialRequest request) {
    return impl.createCredential(request);
  }

  public void deleteCredential(String nameArg) {
    deleteCredential(new DeleteCredentialRequest().setNameArg(nameArg));
  }

  /**
   * Delete a credential.
   *
   * <p>Deletes a service or storage credential from the metastore. The caller must be an owner of
   * the credential.
   */
  public void deleteCredential(DeleteCredentialRequest request) {
    impl.deleteCredential(request);
  }

  public TemporaryCredentials generateTemporaryServiceCredential(String credentialName) {
    return generateTemporaryServiceCredential(
        new GenerateTemporaryServiceCredentialRequest().setCredentialName(credentialName));
  }

  /**
   * Generate a temporary service credential.
   *
   * <p>Returns a set of temporary credentials generated using the specified service credential. The
   * caller must be a metastore admin or have the metastore privilege **ACCESS** on the service
   * credential.
   */
  public TemporaryCredentials generateTemporaryServiceCredential(
      GenerateTemporaryServiceCredentialRequest request) {
    return impl.generateTemporaryServiceCredential(request);
  }

  public CredentialInfo getCredential(String nameArg) {
    return getCredential(new GetCredentialRequest().setNameArg(nameArg));
  }

  /**
   * Get a credential.
   *
   * <p>Gets a service or storage credential from the metastore. The caller must be a metastore
   * admin, the owner of the credential, or have any permission on the credential.
   */
  public CredentialInfo getCredential(GetCredentialRequest request) {
    return impl.getCredential(request);
  }

  /**
   * List credentials.
   *
   * <p>Gets an array of credentials (as __CredentialInfo__ objects).
   *
   * <p>The array is limited to only the credentials that the caller has permission to access. If
   * the caller is a metastore admin, retrieval of credentials is unrestricted. There is no
   * guarantee of a specific ordering of the elements in the array.
   */
  public Iterable<CredentialInfo> listCredentials(ListCredentialsRequest request) {
    return new Paginator<>(
        request,
        impl::listCredentials,
        ListCredentialsResponse::getCredentials,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public CredentialInfo updateCredential(String nameArg) {
    return updateCredential(new UpdateCredentialRequest().setNameArg(nameArg));
  }

  /**
   * Update a credential.
   *
   * <p>Updates a service or storage credential on the metastore.
   *
   * <p>The caller must be the owner of the credential or a metastore admin or have the `MANAGE`
   * permission. If the caller is a metastore admin, only the __owner__ field can be changed.
   */
  public CredentialInfo updateCredential(UpdateCredentialRequest request) {
    return impl.updateCredential(request);
  }

  /**
   * Validate a credential.
   *
   * <p>Validates a credential.
   *
   * <p>For service credentials (purpose is **SERVICE**), either the __credential_name__ or the
   * cloud-specific credential must be provided.
   *
   * <p>For storage credentials (purpose is **STORAGE**), at least one of __external_location_name__
   * and __url__ need to be provided. If only one of them is provided, it will be used for
   * validation. And if both are provided, the __url__ will be used for validation, and
   * __external_location_name__ will be ignored when checking overlapping urls. Either the
   * __credential_name__ or the cloud-specific credential must be provided.
   *
   * <p>The caller must be a metastore admin or the credential owner or have the required permission
   * on the metastore and the credential (e.g., **CREATE_EXTERNAL_LOCATION** when purpose is
   * **STORAGE**).
   */
  public ValidateCredentialResponse validateCredential(ValidateCredentialRequest request) {
    return impl.validateCredential(request);
  }

  public CredentialsService impl() {
    return impl;
  }
}
