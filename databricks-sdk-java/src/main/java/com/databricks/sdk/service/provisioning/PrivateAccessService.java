// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * These APIs manage private access settings for this account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PrivateAccessService {
  /**
   * Creates a private access settings configuration, which represents network access restrictions
   * for workspace resources. Private access settings configure whether workspaces can be accessed
   * from the public internet or only from private endpoints.
   */
  PrivateAccessSettings create(
      CreatePrivateAccessSettingsRequest createPrivateAccessSettingsRequest);

  /** Deletes a Databricks private access settings configuration, both specified by ID. */
  PrivateAccessSettings delete(DeletePrivateAccesRequest deletePrivateAccesRequest);

  /** Gets a Databricks private access settings configuration, both specified by ID. */
  PrivateAccessSettings get(GetPrivateAccesRequest getPrivateAccesRequest);

  /** Lists Databricks private access settings for an account. */
  Collection<PrivateAccessSettings> list();

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
  PrivateAccessSettings replace(
      ReplacePrivateAccessSettingsRequest replacePrivateAccessSettingsRequest);
}
