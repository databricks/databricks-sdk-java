// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** APIs to manage workspace level settings */
@Generated
public class WorkspaceSettingsV2API {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceSettingsV2API.class);

  private final WorkspaceSettingsV2Service impl;

  /** Regular-use constructor */
  public WorkspaceSettingsV2API(ApiClient apiClient) {
    impl = new WorkspaceSettingsV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceSettingsV2API(WorkspaceSettingsV2Service mock) {
    impl = mock;
  }

  public Setting getPublicWorkspaceSetting(String name) {
    return getPublicWorkspaceSetting(new GetPublicWorkspaceSettingRequest().setName(name));
  }

  /** Get a setting value at workspace level */
  public Setting getPublicWorkspaceSetting(GetPublicWorkspaceSettingRequest request) {
    return impl.getPublicWorkspaceSetting(request);
  }

  /**
   * List valid setting keys and metadata. These settings are available to referenced via [GET
   * /api/2.1/settings/{name}](#~1api~1workspace~1settingsv2~1getpublicworkspacesetting) and [PATCH
   * /api/2.1/settings/{name}](#~1api~1workspace~1settingsv2~patchpublicworkspacesetting) APIs
   */
  public Iterable<SettingsMetadata> listWorkspaceSettingsMetadata(
      ListWorkspaceSettingsMetadataRequest request) {
    return new Paginator<>(
        request,
        impl::listWorkspaceSettingsMetadata,
        ListWorkspaceSettingsMetadataResponse::getSettingsMetadata,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Patch a setting value at workspace level */
  public Setting patchPublicWorkspaceSetting(PatchPublicWorkspaceSettingRequest request) {
    return impl.patchPublicWorkspaceSetting(request);
  }

  public WorkspaceSettingsV2Service impl() {
    return impl;
  }
}
