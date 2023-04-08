// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
 * platforms. Databricks recommends creating service principals to run production jobs or modify
 * production data. If all processes that act on production data run with service principals,
 * interactive users do not need any write, delete, or modify privileges in production. This
 * eliminates the risk of a user overwriting production data by accident.
 */
public class AccountServicePrincipalsAPI {
  private final AccountServicePrincipalsService impl;

  /** Regular-use constructor */
  public AccountServicePrincipalsAPI(ApiClient apiClient) {
    impl = new AccountServicePrincipalsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountServicePrincipalsAPI(AccountServicePrincipalsService mock) {
    impl = mock;
  }

  /**
   * Create a service principal.
   *
   * <p>Creates a new service principal in the Databricks Account.
   */
  public ServicePrincipal create(ServicePrincipal request) {
    return impl.create(request);
  }

  /**
   * Delete a service principal.
   *
   * <p>Delete a single service principal in the Databricks Account.
   */
  public void delete(DeleteServicePrincipalRequest request) {
    impl.delete(request);
  }

  /**
   * Get service principal details.
   *
   * <p>Gets the details for a single service principal define in the Databricks Account.
   */
  public ServicePrincipal get(GetServicePrincipalRequest request) {
    return impl.get(request);
  }

  /**
   * List service principals.
   *
   * <p>Gets the set of service principals associated with a Databricks Account.
   */
  public ListServicePrincipalResponse list(ListServicePrincipalsRequest request) {
    return impl.list(request);
  }

  /**
   * Update service principal details.
   *
   * <p>Partially updates the details of a single service principal in the Databricks Account.
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }

  /**
   * Replace service principal.
   *
   * <p>Updates the details of a single service principal.
   *
   * <p>This action replaces the existing service principal with the same name.
   */
  public void update(ServicePrincipal request) {
    impl.update(request);
  }

  public AccountServicePrincipalsService impl() {
    return impl;
  }
}
