// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Restrict Workspace Admins setting lets you control the capabilities of workspace admins. With
 * the setting status set to ALLOW_ALL, workspace admins can create service principal personal
 * access tokens on behalf of any service principal in their workspace. Workspace admins can also
 * change a job owner or the job run_as setting to any user in their workspace or a service
 * principal on which they have the Service Principal User role. With the setting status set to
 * RESTRICT_TOKENS_AND_JOB_RUN_AS, workspace admins can only create personal access tokens on behalf
 * of service principals they have the Service Principal User role on. They can also only change a
 * job owner or the job run_as setting to themselves or a service principal on which they have the
 * Service Principal User role.
 */
@Generated
public class RestrictWorkspaceAdminsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RestrictWorkspaceAdminsAPI.class);

  private final RestrictWorkspaceAdminsService impl;

  /** Regular-use constructor */
  public RestrictWorkspaceAdminsAPI(ApiClient apiClient) {
    impl = new RestrictWorkspaceAdminsImpl(apiClient);
  }

  /** Constructor for mocks */
  public RestrictWorkspaceAdminsAPI(RestrictWorkspaceAdminsService mock) {
    impl = mock;
  }

  /**
   * Delete the restrict workspace admins setting.
   *
   * <p>Reverts the restrict workspace admins setting status for the workspace. A fresh etag needs
   * to be provided in DELETE requests (as a query parameter). The etag can be retrieved by making a
   * GET request before the DELETE request. If the setting is updated/deleted concurrently, DELETE
   * will fail with 409 and the request will need to be retried by using the fresh etag in the 409
   * response.
   */
  public DeleteRestrictWorkspaceAdminsSettingResponse deleteRestrictWorkspaceAdminsSetting(
      DeleteRestrictWorkspaceAdminsSettingRequest request) {
    return impl.deleteRestrictWorkspaceAdminsSetting(request);
  }

  /**
   * Get the restrict workspace admins setting.
   *
   * <p>Gets the restrict workspace admins setting.
   */
  public RestrictWorkspaceAdminsSetting getRestrictWorkspaceAdminsSetting(
      GetRestrictWorkspaceAdminsSettingRequest request) {
    return impl.getRestrictWorkspaceAdminsSetting(request);
  }

  public RestrictWorkspaceAdminsSetting updateRestrictWorkspaceAdminsSetting(
      boolean allowMissing, RestrictWorkspaceAdminsSetting setting, String fieldMask) {
    return updateRestrictWorkspaceAdminsSetting(
        new UpdateRestrictWorkspaceAdminsSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update the restrict workspace admins setting.
   *
   * <p>Updates the restrict workspace admins setting for the workspace. A fresh etag needs to be
   * provided in PATCH requests (as part of the setting field). The etag can be retrieved by making
   * a GET request before the PATCH request. If the setting is updated concurrently, PATCH will fail
   * with 409 and the request will need to be retried by using the fresh etag in the 409 response.
   */
  public RestrictWorkspaceAdminsSetting updateRestrictWorkspaceAdminsSetting(
      UpdateRestrictWorkspaceAdminsSettingRequest request) {
    return impl.updateRestrictWorkspaceAdminsSetting(request);
  }

  public RestrictWorkspaceAdminsService impl() {
    return impl;
  }
}
