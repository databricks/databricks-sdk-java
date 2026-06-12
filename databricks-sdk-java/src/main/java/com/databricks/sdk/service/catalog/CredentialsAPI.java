// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * A credential represents an authentication and authorization mechanism for accessing services on
 * your cloud tenant. Each credential is subject to Unity Catalog access-control policies that
 * control which users and groups can access the credential.
 *
 * <p>To create credentials, you must be a Databricks account admin or have the {@code CREATE
 * SERVICE CREDENTIAL} privilege. The user who creates the credential can delegate ownership to
 * another user or group to manage permissions on it.
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

  /**
   * Creates a new credential. The type of credential to be created is determined by the
   * <b>purpose</b> field, which should be either <b>SERVICE</b> or <b>STORAGE</b>.
   *
   * <p>The caller must be a metastore admin or have the metastore privilege
   * <b>CREATE_STORAGE_CREDENTIAL</b> for storage credentials, or <b>CREATE_SERVICE_CREDENTIAL</b>
   * for service credentials.
   */
  public CredentialInfo createCredential(CreateCredentialRequest request) {
    return impl.createCredential(request);
  }

  public void deleteCredential(String nameArg) {
    deleteCredential(new DeleteCredentialRequest().setNameArg(nameArg));
  }

  /**
   * Deletes a service or storage credential from the metastore. The caller must be an owner of the
   * credential.
   */
  public void deleteCredential(DeleteCredentialRequest request) {
    impl.deleteCredential(request);
  }

  /**
   * Returns a set of temporary credentials generated using the specified service credential. The
   * caller must be a metastore admin or have the metastore privilege <b>ACCESS</b> on the service
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
   * Gets a service or storage credential from the metastore. The caller must be a metastore admin,
   * the owner of the credential, or have any permission on the credential.
   */
  public CredentialInfo getCredential(GetCredentialRequest request) {
    return impl.getCredential(request);
  }

  /**
   * Gets an array of credentials (as <b>CredentialInfo</b> objects).
   *
   * <p>The array is limited to only the credentials that the caller has permission to access. If
   * the caller is a metastore admin, retrieval of credentials is unrestricted. There is no
   * guarantee of a specific ordering of the elements in the array.
   *
   * <p>PAGINATION BEHAVIOR: The API is by default paginated, a page may contain zero results while
   * still providing a next_page_token. Clients must continue reading pages until next_page_token is
   * absent, which is the only indication that the end of results has been reached.
   */
  public Iterable<CredentialInfo> listCredentials(ListCredentialsRequest request) {
    return Paginator.newTokenPagination(
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

  /**
   * Updates a service or storage credential on the metastore.
   *
   * <p>The caller must be the owner of the credential or a metastore admin or have the {@code
   * MANAGE} permission. If the caller is a metastore admin, only the <b>owner</b> field can be
   * changed.
   */
  public CredentialInfo updateCredential(UpdateCredentialRequest request) {
    return impl.updateCredential(request);
  }

  /**
   * Validates a credential.
   *
   * <p>For service credentials (purpose is <b>SERVICE</b>), either the <b>credential_name</b> or
   * the cloud-specific credential must be provided.
   *
   * <p>For storage credentials (purpose is <b>STORAGE</b>), at least one of
   * <b>external_location_name</b> and <b>url</b> need to be provided. If only one of them is
   * provided, it will be used for validation. And if both are provided, the <b>url</b> will be used
   * for validation, and <b>external_location_name</b> will be ignored when checking overlapping
   * urls. Either the <b>credential_name</b> or the cloud-specific credential must be provided.
   *
   * <p>The caller must be a metastore admin or the credential owner or have the required permission
   * on the metastore and the credential (e.g., <b>CREATE_EXTERNAL_LOCATION</b> when purpose is
   * <b>STORAGE</b>).
   */
  public ValidateCredentialResponse validateCredential(ValidateCredentialRequest request) {
    return impl.validateCredential(request);
  }

  public CredentialsService impl() {
    return impl;
  }
}
