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
 * change a job owner to any user in their workspace. And they can change the job run_as setting to
 * any user in their workspace or to a service principal on which they have the Service Principal
 * User role. With the setting status set to RESTRICT_TOKENS_AND_JOB_RUN_AS, workspace admins can
 * only create personal access tokens on behalf of service principals they have the Service
 * Principal User role on. They can also only change a job owner to themselves. And they can change
 * the job run_as setting to themselves or to a service principal on which they have the Service
 * Principal User role.
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
   * Reverts the restrict workspace admins setting status for the workspace. A fresh etag needs to
   * be provided in `DELETE` requests (as a query parameter). The etag can be retrieved by making a
   * `GET` request before the DELETE request. If the setting is updated/deleted concurrently,
   * `DELETE` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  public DeleteRestrictWorkspaceAdminsSettingResponse delete(
      DeleteRestrictWorkspaceAdminsSettingRequest request) {
    return impl.delete(request);
  }

  /** Gets the restrict workspace admins setting. */
  public RestrictWorkspaceAdminsSetting get(GetRestrictWorkspaceAdminsSettingRequest request) {
    return impl.get(request);
  }

  public RestrictWorkspaceAdminsSetting update(
      boolean allowMissing, RestrictWorkspaceAdminsSetting setting, String fieldMask) {
    return update(
        new UpdateRestrictWorkspaceAdminsSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Updates the restrict workspace admins setting for the workspace. A fresh etag needs to be
   * provided in `PATCH` requests (as part of the setting field). The etag can be retrieved by
   * making a GET request before the `PATCH` request. If the setting is updated concurrently,
   * `PATCH` fails with 409 and the request must be retried by using the fresh etag in the 409
   * response.
   */
  public RestrictWorkspaceAdminsSetting update(
      UpdateRestrictWorkspaceAdminsSettingRequest request) {
    return impl.update(request);
  }

  public RestrictWorkspaceAdminsService impl() {
    return impl;
  }
}
