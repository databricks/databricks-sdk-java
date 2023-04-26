// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs enable administrators to manage custom oauth app integrations, which is required for
 * adding/using Custom OAuth App Integration like Tableau Cloud for Databricks in AWS cloud.
 *
 * <p>**Note:** You can only add/use the OAuth custom application integrations when OAuth enrollment
 * status is enabled. For more details see :method:OAuthEnrollment/create
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CustomAppIntegrationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CustomAppIntegrationAPI.class);

  private final CustomAppIntegrationService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public CustomAppIntegrationAPI(ApiClient apiClient) {
    impl = new CustomAppIntegrationImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.oauth2.CustomAppIntegrationService} object
   */
  public CustomAppIntegrationAPI(CustomAppIntegrationService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param redirectUrls a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegrationOutput} object
   */
  public CreateCustomAppIntegrationOutput create(String name, Collection<String> redirectUrls) {
    return create(new CreateCustomAppIntegration().setName(name).setRedirectUrls(redirectUrls));
  }

  /**
   * Create Custom OAuth App Integration.
   *
   * <p>Create Custom OAuth App Integration.
   *
   * <p>You can retrieve the custom oauth app integration via :method:get.
   *
   * @param request a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegration} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegrationOutput} object
   */
  public CreateCustomAppIntegrationOutput create(CreateCustomAppIntegration request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   */
  public void delete(String integrationId) {
    delete(new DeleteCustomAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /**
   * Delete Custom OAuth App Integration.
   *
   * <p>Delete an existing Custom OAuth App Integration. You can retrieve the custom oauth app
   * integration via :method:get.
   *
   * @param request a {@link com.databricks.sdk.service.oauth2.DeleteCustomAppIntegrationRequest} object
   */
  public void delete(DeleteCustomAppIntegrationRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  public GetCustomAppIntegrationOutput get(String integrationId) {
    return get(new GetCustomAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /**
   * Get OAuth Custom App Integration.
   *
   * <p>Gets the Custom OAuth App Integration for the given integration id.
   *
   * @param request a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationRequest} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput} object
   */
  public GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest request) {
    return impl.get(request);
  }

  /**
   * Get custom oauth app integrations.
   *
   * <p>Get the list of custom oauth app integrations for the specified Databricks Account
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<GetCustomAppIntegrationOutput> list() {
    return impl.list().getApps();
  }

  /**
   * <p>update.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   */
  public void update(String integrationId) {
    update(new UpdateCustomAppIntegration().setIntegrationId(integrationId));
  }

  /**
   * Updates Custom OAuth App Integration.
   *
   * <p>Updates an existing custom OAuth App Integration. You can retrieve the custom oauth app
   * integration via :method:get.
   *
   * @param request a {@link com.databricks.sdk.service.oauth2.UpdateCustomAppIntegration} object
   */
  public void update(UpdateCustomAppIntegration request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.oauth2.CustomAppIntegrationService} object
   */
  public CustomAppIntegrationService impl() {
    return impl;
  }
}
