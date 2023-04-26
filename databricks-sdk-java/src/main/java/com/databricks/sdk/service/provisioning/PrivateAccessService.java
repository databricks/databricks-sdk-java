// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import java.util.Collection;

/**
 * These APIs manage private access settings for this account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface PrivateAccessService {
  /**
   * Create private access settings.
   *
   * <p>Creates a private access settings object, which specifies how your workspace is accessed
   * over [AWS PrivateLink]. To use AWS PrivateLink, a workspace must have a private access settings
   * object referenced by ID in the workspace's `private_access_settings_id` property.
   *
   * <p>You can share one private access settings with multiple workspaces in a single account.
   * However, private access settings are specific to AWS regions, so only workspaces in the same
   * AWS region can use a given private access settings object.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   *
   * @param upsertPrivateAccessSettingsRequest a {@link com.databricks.sdk.service.provisioning.UpsertPrivateAccessSettingsRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  PrivateAccessSettings create(
      UpsertPrivateAccessSettingsRequest upsertPrivateAccessSettingsRequest);

  /**
   * Delete a private access settings object.
   *
   * <p>Deletes a private access settings object, which determines how your workspace is accessed
   * over [AWS PrivateLink].
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   *
   * @param deletePrivateAccesRequest a {@link com.databricks.sdk.service.provisioning.DeletePrivateAccesRequest} object
   */
  void delete(DeletePrivateAccesRequest deletePrivateAccesRequest);

  /**
   * Get a private access settings object.
   *
   * <p>Gets a private access settings object, which specifies how your workspace is accessed over
   * [AWS PrivateLink].
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   *
   * @param getPrivateAccesRequest a {@link com.databricks.sdk.service.provisioning.GetPrivateAccesRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessSettings} object
   */
  PrivateAccessSettings get(GetPrivateAccesRequest getPrivateAccesRequest);

  /**
   * Get all private access settings objects.
   *
   * <p>Gets a list of all private access settings objects for an account, specified by ID.
   *
   * @return a {@link java.util.Collection} object
   */
  Collection<PrivateAccessSettings> list();

  /**
   * Replace private access settings.
   *
   * <p>Updates an existing private access settings object, which specifies how your workspace is
   * accessed over [AWS PrivateLink]. To use AWS PrivateLink, a workspace must have a private access
   * settings object referenced by ID in the workspace's `private_access_settings_id` property.
   *
   * <p>This operation completely overwrites your existing private access settings object attached
   * to your workspaces. All workspaces attached to the private access settings are affected by any
   * change. If `public_access_enabled`, `private_access_level`, or `allowed_vpc_endpoint_ids` are
   * updated, effects of these changes might take several minutes to propagate to the workspace API.
   *
   * <p>You can share one private access settings object with multiple workspaces in a single
   * account. However, private access settings are specific to AWS regions, so only workspaces in
   * the same AWS region can use a given private access settings object.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   *
   * @param upsertPrivateAccessSettingsRequest a {@link com.databricks.sdk.service.provisioning.UpsertPrivateAccessSettingsRequest} object
   */
  void replace(UpsertPrivateAccessSettingsRequest upsertPrivateAccessSettingsRequest);
}
