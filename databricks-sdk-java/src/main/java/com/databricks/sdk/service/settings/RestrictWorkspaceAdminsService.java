// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The Restrict Workspace Admins setting lets you control the capabilities of workspace admins. With
 * the setting status set to ALLOW_ALL, workspace admins can create service principal personal
 * access tokens on behalf of any service principal in their workspace. Workspace admins can also
 * change a job owner to any user in their workspace. And they can change the job run_as setting to
 * any user in their workspace or to a service principal on which they have the Service Principal
 * User role. With the setting status set to RESTRICT_TOKENS_AND_JOB_RUN_AS, workspace admins can
 * only create personal access tokens on behalf of service principals they have the Service
 * Principal User role on. They can also only change a job owner to themselves. And they can change
 * the job run_as setting to themselves or to a service principal on which they have the Service
 * Principal User role.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface RestrictWorkspaceAdminsService {
  /**
   * Delete the restrict workspace admins setting.
   *
   * <p>Reverts the restrict workspace admins setting status for the workspace. A fresh etag needs
   * to be provided in `DELETE` requests (as a query parameter). The etag can be retrieved by making
   * a `GET` request before the DELETE request. If the setting is updated/deleted concurrently,
   * `DELETE` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  DeleteRestrictWorkspaceAdminsSettingResponse delete(
      DeleteRestrictWorkspaceAdminRequest deleteRestrictWorkspaceAdminRequest);

  /**
   * Get the restrict workspace admins setting.
   *
   * <p>Gets the restrict workspace admins setting.
   */
  RestrictWorkspaceAdminsSetting get(
      GetRestrictWorkspaceAdminRequest getRestrictWorkspaceAdminRequest);

  /**
   * Update the restrict workspace admins setting.
   *
   * <p>Updates the restrict workspace admins setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a GET request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  RestrictWorkspaceAdminsSetting update(
      UpdateRestrictWorkspaceAdminsSettingRequest updateRestrictWorkspaceAdminsSettingRequest);
}
