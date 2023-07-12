// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;



/**
 * Identities for use with jobs, automated tools, and systems such as scripts,
 * apps, and CI/CD platforms. Databricks recommends creating service principals
 * to run production jobs or modify production data. If all processes that act
 * on production data run with service principals, interactive users do not need
 * any write, delete, or modify privileges in production. This eliminates the
 * risk of a user overwriting production data by accident.
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
   * Creates a new service principal in the Databricks workspace.
   */
  public ServicePrincipal create(ServicePrincipal request) {
    return impl.create(request);
  }
  
	
  public void delete(String id) {
    delete(new DeleteServicePrincipalRequest()
      .setId(id));
  }
  

	/**
   * Delete a service principal.
   * 
   * Delete a single service principal in the Databricks workspace.
   */
  public void delete(DeleteServicePrincipalRequest request) {
    impl.delete(request);
  }
  
	
  public ServicePrincipal get(String id) {
    return get(new GetServicePrincipalRequest()
      .setId(id));
  }
  

	/**
   * Get service principal details.
   * 
   * Gets the details for a single service principal define in the Databricks
   * workspace.
   */
  public ServicePrincipal get(GetServicePrincipalRequest request) {
    return impl.get(request);
  }
  
	

	/**
   * List service principals.
   * 
   * Gets the set of service principals associated with a Databricks workspace.
   */
  public Iterable<ServicePrincipal> list(ListServicePrincipalsRequest request) {
    return impl.list(request).getResources();
  }
  
	
  public void patch(String id) {
    patch(new PartialUpdate()
      .setId(id));
  }
  

	/**
   * Update service principal details.
   * 
   * Partially updates the details of a single service principal in the
   * Databricks workspace.
   */
  public void patch(PartialUpdate request) {
    impl.patch(request);
  }
  
	
  public void update(String id) {
    update(new ServicePrincipal()
      .setId(id));
  }
  

	/**
   * Replace service principal.
   * 
   * Updates the details of a single service principal.
   * 
   * This action replaces the existing service principal with the same name.
   */
  public void update(ServicePrincipal request) {
    impl.update(request);
  }
  
  public ServicePrincipalsService impl() {
    return impl;
  }
}












