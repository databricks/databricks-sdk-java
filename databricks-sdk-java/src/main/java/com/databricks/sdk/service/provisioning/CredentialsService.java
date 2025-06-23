// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * These APIs manage credential configurations for this workspace. Databricks needs access to a
 * cross-account service IAM role in your AWS account so that Databricks can deploy clusters in the
 * appropriate VPC for the new workspace. A credential configuration encapsulates this role
 * information, and its ID is used when creating a new workspace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CredentialsService {
  /**
   * Creates a Databricks credential configuration that represents cloud cross-account credentials
   * for a specified account. Databricks uses this to set up network infrastructure properly to host
   * Databricks clusters. For your AWS IAM role, you need to trust the External ID (the Databricks
   * Account API account ID) in the returned credential object, and configure the required access
   * policy.
   *
   * <p>Save the response's `credentials_id` field, which is the ID for your new credential
   * configuration object.
   *
   * <p>For information about how to create a new workspace with this API, see [Create a new
   * workspace using the Account API]
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   */
  Credential create(CreateCredentialRequest createCredentialRequest);

  /**
   * Deletes a Databricks credential configuration object for an account, both specified by ID. You
   * cannot delete a credential that is associated with any workspace.
   */
  void delete(DeleteCredentialRequest deleteCredentialRequest);

  /** Gets a Databricks credential configuration object for an account, both specified by ID. */
  Credential get(GetCredentialRequest getCredentialRequest);

  /** Gets all Databricks credential configurations associated with an account specified by ID. */
  Collection<Credential> list();
}
