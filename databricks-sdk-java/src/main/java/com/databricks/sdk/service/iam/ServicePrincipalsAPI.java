// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
 * platforms. Databricks recommends creating service principals to run production jobs or modify
 * production data. If all processes that act on production data run with service principals,
 * interactive users do not need any write, delete, or modify privileges in production. This
 * eliminates the risk of a user overwriting production data by accident.
 */
@Generated
public class ServicePrincipalsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ServicePrincipalsAPI.class);

  private final ServicePrincipalsService impl;

  /** Regular-use constructor */
  public ServicePrincipalsAPI(ApiClient apiClient) {
    impl = new ServicePrincipalsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ServicePrincipalsAPI(ServicePrincipalsService mock) {
    impl = mock;
  }

  /**
   * Create a service principal.
   *
   * <p>Creates a new service principal in the Databricks workspace.
   */
  public ServicePrincipal create(ServicePrincipal request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteServicePrincipalRequest().setId(id));
  }

  /**
   * Delete a service principal.
   *
   * <p>Delete a single service principal in the Databricks workspace.
   */
  public void delete(DeleteServicePrincipalRequest request) {
    impl.delete(request);
  }

  public ServicePrincipal get(String id) {
    return get(new GetServicePrincipalRequest().setId(id));
  }

  /**
   * Get service principal details.
   *
   * <p>Gets the details for a single service principal define in the Databricks workspace.
   */
  public ServicePrincipal get(GetServicePrincipalRequest request) {
    return impl.get(request);
  }

  /**
   * List service principals.
   *
   * <p>Gets the set of service principals associated with a Databricks workspace.
   */
  public Iterable<ServicePrincipal> list(ListServicePrincipalsRequest request) {
    request.setStartIndex(1L);
    if (request.getCount() == 0) {
      request.setCount(100L);
    }
    return new Paginator<>(
            request,
            impl::list,
            ListServicePrincipalResponse::getResources,
            response -> {
              Long offset = request.getStartIndex();
              if (offset == null) {
                offset = 0L;
              }
              offset += response.getResources().size();
              return request.setStartIndex(offset);
            })
        .withDedupe(ServicePrincipal::getId);
  }

  public void patch(String id) {
    patch(new PartialUpdate().setId(id));
  }

  /**
   * Update service principal details.
   *
   * <p>Partially updates the details of a single service principal in the Databricks workspace.
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }

  public void update(String id) {
    update(new ServicePrincipal().setId(id));
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

  public ServicePrincipalsService impl() {
    return impl;
  }
}
