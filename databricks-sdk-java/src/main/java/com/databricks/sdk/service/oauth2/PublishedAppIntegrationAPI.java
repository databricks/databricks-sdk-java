// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs enable administrators to manage published oauth app integrations, which is required
 * for adding/using Published OAuth App Integration like Tableau Cloud for Databricks in AWS cloud.
 *
 * <p>**Note:** You can only add/use the OAuth published application integrations when OAuth
 * enrollment status is enabled. For more details see :method:OAuthEnrollment/create
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PublishedAppIntegrationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PublishedAppIntegrationAPI.class);

  private final PublishedAppIntegrationService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public PublishedAppIntegrationAPI(ApiClient apiClient) {
    impl = new PublishedAppIntegrationImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.oauth2.PublishedAppIntegrationService} object
   */
  public PublishedAppIntegrationAPI(PublishedAppIntegrationService mock) {
    impl = mock;
  }

  /**
   * Create Published OAuth App Integration.
   *
   * <p>Create Published OAuth App Integration.
   *
   * <p>You can retrieve the published oauth app integration via :method:get.
   *
   * @param request a {@link com.databricks.sdk.service.oauth2.CreatePublishedAppIntegration} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreatePublishedAppIntegrationOutput} object
   */
  public CreatePublishedAppIntegrationOutput create(CreatePublishedAppIntegration request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   */
  public void delete(String integrationId) {
    delete(new DeletePublishedAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /**
   * Delete Published OAuth App Integration.
   *
   * <p>Delete an existing Published OAuth App Integration. You can retrieve the published oauth app
   * integration via :method:get.
   *
   * @param request a {@link com.databricks.sdk.service.oauth2.DeletePublishedAppIntegrationRequest} object
   */
  public void delete(DeletePublishedAppIntegrationRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationOutput} object
   */
  public GetPublishedAppIntegrationOutput get(String integrationId) {
    return get(new GetPublishedAppIntegrationRequest().setIntegrationId(integrationId));
  }

  /**
   * Get OAuth Published App Integration.
   *
   * <p>Gets the Published OAuth App Integration for the given integration id.
   *
   * @param request a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationRequest} object
   * @return a {@link com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationOutput} object
   */
  public GetPublishedAppIntegrationOutput get(GetPublishedAppIntegrationRequest request) {
    return impl.get(request);
  }

  /**
   * Get published oauth app integrations.
   *
   * <p>Get the list of published oauth app integrations for the specified Databricks Account
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<GetPublishedAppIntegrationOutput> list() {
    return impl.list().getApps();
  }

  /**
   * <p>update.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   */
  public void update(String integrationId) {
    update(new UpdatePublishedAppIntegration().setIntegrationId(integrationId));
  }

  /**
   * Updates Published OAuth App Integration.
   *
   * <p>Updates an existing published OAuth App Integration. You can retrieve the published oauth
   * app integration via :method:get.
   *
   * @param request a {@link com.databricks.sdk.service.oauth2.UpdatePublishedAppIntegration} object
   */
  public void update(UpdatePublishedAppIntegration request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.oauth2.PublishedAppIntegrationService} object
   */
  public PublishedAppIntegrationService impl() {
    return impl;
  }
}
