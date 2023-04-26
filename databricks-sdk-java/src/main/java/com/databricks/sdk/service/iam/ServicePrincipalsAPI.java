// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
 * platforms. Databricks recommends creating service principals to run production jobs or modify
 * production data. If all processes that act on production data run with service principals,
 * interactive users do not need any write, delete, or modify privileges in production. This
 * eliminates the risk of a user overwriting production data by accident.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ServicePrincipalsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ServicePrincipalsAPI.class);

  private final ServicePrincipalsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ServicePrincipalsAPI(ApiClient apiClient) {
    impl = new ServicePrincipalsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.iam.ServicePrincipalsService} object
   */
  public ServicePrincipalsAPI(ServicePrincipalsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal create(String id) {
    return create(new ServicePrincipal().setId(id));
  }

  /**
   * Create a service principal.
   *
   * <p>Creates a new service principal in the Databricks Workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal create(ServicePrincipal request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void delete(String id) {
    delete(new DeleteServicePrincipalRequest().setId(id));
  }

  /**
   * Delete a service principal.
   *
   * <p>Delete a single service principal in the Databricks Workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.DeleteServicePrincipalRequest} object
   */
  public void delete(DeleteServicePrincipalRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal get(String id) {
    return get(new GetServicePrincipalRequest().setId(id));
  }

  /**
   * Get service principal details.
   *
   * <p>Gets the details for a single service principal define in the Databricks Workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.GetServicePrincipalRequest} object
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public ServicePrincipal get(GetServicePrincipalRequest request) {
    return impl.get(request);
  }

  /**
   * List service principals.
   *
   * <p>Gets the set of service principals associated with a Databricks Workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.ListServicePrincipalsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<ServicePrincipal> list(ListServicePrincipalsRequest request) {
    return impl.list(request).getResources();
  }

  /**
   * <p>patch.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void patch(String id) {
    patch(new PartialUpdate().setId(id));
  }

  /**
   * Update service principal details.
   *
   * <p>Partially updates the details of a single service principal in the Databricks Workspace.
   *
   * @param request a {@link com.databricks.sdk.service.iam.PartialUpdate} object
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }

  /**
   * <p>update.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void update(String id) {
    update(new ServicePrincipal().setId(id));
  }

  /**
   * Replace service principal.
   *
   * <p>Updates the details of a single service principal.
   *
   * <p>This action replaces the existing service principal with the same name.
   *
   * @param request a {@link com.databricks.sdk.service.iam.ServicePrincipal} object
   */
  public void update(ServicePrincipal request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.ServicePrincipalsService} object
   */
  public ServicePrincipalsService impl() {
    return impl;
  }
}
