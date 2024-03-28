// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * These APIs provide specific management operations for Lakeview dashboards. Generic resource
 * management can be done with Workspace API (import, export, get-status, list, delete).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LakeviewService {
  /**
   * Create dashboard.
   *
   * <p>Create a draft dashboard.
   */
  Dashboard create(CreateDashboardRequest createDashboardRequest);

  /**
   * Get dashboard.
   *
   * <p>Get a draft dashboard.
   */
  Dashboard get(GetDashboardRequest getDashboardRequest);

  /**
   * Get published dashboard.
   *
   * <p>Get the current published dashboard.
   */
  PublishedDashboard getPublished(GetPublishedDashboardRequest getPublishedDashboardRequest);

  /**
   * Migrate dashboard.
   *
   * <p>Migrates a classic SQL dashboard to Lakeview.
   */
  Dashboard migrate(MigrateDashboardRequest migrateDashboardRequest);

  /**
   * Publish dashboard.
   *
   * <p>Publish the current draft dashboard.
   */
  PublishedDashboard publish(PublishRequest publishRequest);

  /**
   * Trash dashboard.
   *
   * <p>Trash a dashboard.
   */
  void trash(TrashDashboardRequest trashDashboardRequest);

  /**
   * Unpublish dashboard.
   *
   * <p>Unpublish the dashboard.
   */
  void unpublish(UnpublishDashboardRequest unpublishDashboardRequest);

  /**
   * Update dashboard.
   *
   * <p>Update a draft dashboard.
   */
  Dashboard update(UpdateDashboardRequest updateDashboardRequest);
}
