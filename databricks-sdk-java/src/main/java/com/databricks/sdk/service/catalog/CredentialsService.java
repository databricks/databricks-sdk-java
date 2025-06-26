// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A credential represents an authentication and authorization mechanism for accessing services on
 * your cloud tenant. Each credential is subject to Unity Catalog access-control policies that
 * control which users and groups can access the credential.
 *
 * <p>To create credentials, you must be a Databricks account admin or have the `CREATE SERVICE
 * CREDENTIAL` privilege. The user who creates the credential can delegate ownership to another user
 * or group to manage permissions on it.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CredentialsService {
  /**
   * Creates a new credential. The type of credential to be created is determined by the **purpose**
   * field, which should be either **SERVICE** or **STORAGE**.
   *
   * <p>The caller must be a metastore admin or have the metastore privilege
   * **CREATE_STORAGE_CREDENTIAL** for storage credentials, or **CREATE_SERVICE_CREDENTIAL** for
   * service credentials.
   */
  CredentialInfo createCredential(CreateCredentialRequest createCredentialRequest);

  /**
   * Deletes a service or storage credential from the metastore. The caller must be an owner of the
   * credential.
   */
  void deleteCredential(DeleteCredentialRequest deleteCredentialRequest);

  /**
   * Returns a set of temporary credentials generated using the specified service credential. The
   * caller must be a metastore admin or have the metastore privilege **ACCESS** on the service
   * credential.
   */
  TemporaryCredentials generateTemporaryServiceCredential(
      GenerateTemporaryServiceCredentialRequest generateTemporaryServiceCredentialRequest);

  /**
   * Gets a service or storage credential from the metastore. The caller must be a metastore admin,
   * the owner of the credential, or have any permission on the credential.
   */
  CredentialInfo getCredential(GetCredentialRequest getCredentialRequest);

  /**
   * Gets an array of credentials (as __CredentialInfo__ objects).
   *
   * <p>The array is limited to only the credentials that the caller has permission to access. If
   * the caller is a metastore admin, retrieval of credentials is unrestricted. There is no
   * guarantee of a specific ordering of the elements in the array.
   */
  ListCredentialsResponse listCredentials(ListCredentialsRequest listCredentialsRequest);

  /**
   * Updates a service or storage credential on the metastore.
   *
   * <p>The caller must be the owner of the credential or a metastore admin or have the `MANAGE`
   * permission. If the caller is a metastore admin, only the __owner__ field can be changed.
   */
  CredentialInfo updateCredential(UpdateCredentialRequest updateCredentialRequest);

  /**
   * Validates a credential.
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
  ValidateCredentialResponse validateCredential(
      ValidateCredentialRequest validateCredentialRequest);
}
