// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** These APIs manage private access settings for this account. */
@Generated
public class PrivateAccessAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PrivateAccessAPI.class);

  private final PrivateAccessService impl;

  /** Regular-use constructor */
  public PrivateAccessAPI(ApiClient apiClient) {
    impl = new PrivateAccessImpl(apiClient);
  }

  /** Constructor for mocks */
  public PrivateAccessAPI(PrivateAccessService mock) {
    impl = mock;
  }

  /**
   * Creates a private access settings configuration, which represents network access restrictions
   * for workspace resources. Private access settings configure whether workspaces can be accessed
   * from the public internet or only from private endpoints.
   */
  public PrivateAccessSettings create(CreatePrivateAccessSettingsRequest request) {
    return impl.create(request);
  }

  public PrivateAccessSettings delete(String privateAccessSettingsId) {
    return delete(
        new DeletePrivateAccesRequest().setPrivateAccessSettingsId(privateAccessSettingsId));
  }

  /** Deletes a Databricks private access settings configuration, both specified by ID. */
  public PrivateAccessSettings delete(DeletePrivateAccesRequest request) {
    return impl.delete(request);
  }

  public PrivateAccessSettings get(String privateAccessSettingsId) {
    return get(new GetPrivateAccesRequest().setPrivateAccessSettingsId(privateAccessSettingsId));
  }

  /** Gets a Databricks private access settings configuration, both specified by ID. */
  public PrivateAccessSettings get(GetPrivateAccesRequest request) {
    return impl.get(request);
  }

  /** Lists Databricks private access settings for an account. */
  public Iterable<PrivateAccessSettings> list() {
    return impl.list();
  }

  /**
   * Updates an existing private access settings object, which specifies how your workspace is
   * accessed over AWS PrivateLink. To use AWS PrivateLink, a workspace must have a private access
   * settings object referenced by ID in the workspace's private_access_settings_id property. This
   * operation completely overwrites your existing private access settings object attached to your
   * workspaces. All workspaces attached to the private access settings are affected by any change.
   * If public_access_enabled, private_access_level, or allowed_vpc_endpoint_ids are updated,
   * effects of these changes might take several minutes to propagate to the workspace API. You can
   * share one private access settings object with multiple workspaces in a single account. However,
   * private access settings are specific to AWS regions, so only workspaces in the same AWS region
   * can use a given private access settings object. Before configuring PrivateLink, read the
   * Databricks article about PrivateLink.
   */
  public PrivateAccessSettings replace(ReplacePrivateAccessSettingsRequest request) {
    return impl.replace(request);
  }

  public PrivateAccessService impl() {
    return impl;
  }
}
