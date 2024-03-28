// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs provide specific management operations for Lakeview dashboards. Generic resource
 * management can be done with Workspace API (import, export, get-status, list, delete).
 */
@Generated
public class LakeviewAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LakeviewAPI.class);

  private final LakeviewService impl;

  /** Regular-use constructor */
  public LakeviewAPI(ApiClient apiClient) {
    impl = new LakeviewImpl(apiClient);
  }

  /** Constructor for mocks */
  public LakeviewAPI(LakeviewService mock) {
    impl = mock;
  }

  public Dashboard create(String displayName) {
    return create(new CreateDashboardRequest().setDisplayName(displayName));
  }

  /**
   * Create dashboard.
   *
   * <p>Create a draft dashboard.
   */
  public Dashboard create(CreateDashboardRequest request) {
    return impl.create(request);
  }

  public Dashboard get(String dashboardId) {
    return get(new GetDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Get dashboard.
   *
   * <p>Get a draft dashboard.
   */
  public Dashboard get(GetDashboardRequest request) {
    return impl.get(request);
  }

  public PublishedDashboard getPublished(String dashboardId) {
    return getPublished(new GetPublishedDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Get published dashboard.
   *
   * <p>Get the current published dashboard.
   */
  public PublishedDashboard getPublished(GetPublishedDashboardRequest request) {
    return impl.getPublished(request);
  }

  public Dashboard migrate(String sourceDashboardId) {
    return migrate(new MigrateDashboardRequest().setSourceDashboardId(sourceDashboardId));
  }

  /**
   * Migrate dashboard.
   *
   * <p>Migrates a classic SQL dashboard to Lakeview.
   */
  public Dashboard migrate(MigrateDashboardRequest request) {
    return impl.migrate(request);
  }

  public PublishedDashboard publish(String dashboardId) {
    return publish(new PublishRequest().setDashboardId(dashboardId));
  }

  /**
   * Publish dashboard.
   *
   * <p>Publish the current draft dashboard.
   */
  public PublishedDashboard publish(PublishRequest request) {
    return impl.publish(request);
  }

  public void trash(String dashboardId) {
    trash(new TrashDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Trash dashboard.
   *
   * <p>Trash a dashboard.
   */
  public void trash(TrashDashboardRequest request) {
    impl.trash(request);
  }

  public void unpublish(String dashboardId) {
    unpublish(new UnpublishDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Unpublish dashboard.
   *
   * <p>Unpublish the dashboard.
   */
  public void unpublish(UnpublishDashboardRequest request) {
    impl.unpublish(request);
  }

  public Dashboard update(String dashboardId) {
    return update(new UpdateDashboardRequest().setDashboardId(dashboardId));
  }

  /**
   * Update dashboard.
   *
   * <p>Update a draft dashboard.
   */
  public Dashboard update(UpdateDashboardRequest request) {
    return impl.update(request);
  }

  public LakeviewService impl() {
    return impl;
  }
}
