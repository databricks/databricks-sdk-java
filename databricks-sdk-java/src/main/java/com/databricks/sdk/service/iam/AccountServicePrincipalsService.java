// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
 * platforms. Databricks recommends creating service principals to run production jobs or modify
 * production data. If all processes that act on production data run with service principals,
 * interactive users do not need any write, delete, or modify privileges in production. This
 * eliminates the risk of a user overwriting production data by accident.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountServicePrincipalsService {
  /**
   * Create a service principal.
   *
   * <p>Creates a new service principal in the Databricks account.
   */
  ServicePrincipal create(ServicePrincipal servicePrincipal);

  /**
   * Delete a service principal.
   *
   * <p>Delete a single service principal in the Databricks account.
   */
  DeleteResponse delete(DeleteAccountServicePrincipalRequest deleteAccountServicePrincipalRequest);

  /**
   * Get service principal details.
   *
   * <p>Gets the details for a single service principal define in the Databricks account.
   */
  ServicePrincipal get(GetAccountServicePrincipalRequest getAccountServicePrincipalRequest);

  /**
   * List service principals.
   *
   * <p>Gets the set of service principals associated with a Databricks account.
   */
  ListServicePrincipalResponse list(
      ListAccountServicePrincipalsRequest listAccountServicePrincipalsRequest);

  /**
   * Update service principal details.
   *
   * <p>Partially updates the details of a single service principal in the Databricks account.
   */
  PatchResponse patch(PartialUpdate partialUpdate);

  /**
   * Replace service principal.
   *
   * <p>Updates the details of a single service principal.
   *
   * <p>This action replaces the existing service principal with the same name.
   */
  UpdateResponse update(ServicePrincipal servicePrincipal);
}
