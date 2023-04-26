// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage credential configurations for this workspace. Databricks needs access to a
 * cross-account service IAM role in your AWS account so that Databricks can deploy clusters in the
 * appropriate VPC for the new workspace. A credential configuration encapsulates this role
 * information, and its ID is used when creating a new workspace.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CredentialsAPI.class);

  private final CredentialsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public CredentialsAPI(ApiClient apiClient) {
    impl = new CredentialsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.provisioning.CredentialsService} object
   */
  public CredentialsAPI(CredentialsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param credentialsName a {@link java.lang.String} object
   * @param awsCredentials a {@link com.databricks.sdk.service.provisioning.CreateCredentialAwsCredentials} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential create(String credentialsName, CreateCredentialAwsCredentials awsCredentials) {
    return create(
        new CreateCredentialRequest()
            .setCredentialsName(credentialsName)
            .setAwsCredentials(awsCredentials));
  }

  /**
   * Create credential configuration.
   *
   * <p>Creates a Databricks credential configuration that represents cloud cross-account
   * credentials for a specified account. Databricks uses this to set up network infrastructure
   * properly to host Databricks clusters. For your AWS IAM role, you need to trust the External ID
   * (the Databricks Account API account ID) in the returned credential object, and configure the
   * required access policy.
   *
   * <p>Save the response's `credentials_id` field, which is the ID for your new credential
   * configuration object.
   *
   * <p>For information about how to create a new workspace with this API, see [Create a new
   * workspace using the Account API]
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.CreateCredentialRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential create(CreateCredentialRequest request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   */
  public void delete(String credentialsId) {
    delete(new DeleteCredentialRequest().setCredentialsId(credentialsId));
  }

  /**
   * Delete credential configuration.
   *
   * <p>Deletes a Databricks credential configuration object for an account, both specified by ID.
   * You cannot delete a credential that is associated with any workspace.
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.DeleteCredentialRequest} object
   */
  public void delete(DeleteCredentialRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential get(String credentialsId) {
    return get(new GetCredentialRequest().setCredentialsId(credentialsId));
  }

  /**
   * Get credential configuration.
   *
   * <p>Gets a Databricks credential configuration object for an account, both specified by ID.
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.GetCredentialRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.Credential} object
   */
  public Credential get(GetCredentialRequest request) {
    return impl.get(request);
  }

  /**
   * Get all credential configurations.
   *
   * <p>Gets all Databricks credential configurations associated with an account specified by ID.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Credential> list() {
    return impl.list();
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.CredentialsService} object
   */
  public CredentialsService impl() {
    return impl;
  }
}
