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
   * Creates a private access settings object, which specifies how your workspace is accessed over
   * [AWS PrivateLink]. To use AWS PrivateLink, a workspace must have a private access settings
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
   */
  public PrivateAccessSettings create(UpsertPrivateAccessSettingsRequest request) {
    return impl.create(request);
  }

  public void delete(String privateAccessSettingsId) {
    delete(new DeletePrivateAccesRequest().setPrivateAccessSettingsId(privateAccessSettingsId));
  }

  /**
   * Deletes a private access settings object, which determines how your workspace is accessed over
   * [AWS PrivateLink].
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].",
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   */
  public void delete(DeletePrivateAccesRequest request) {
    impl.delete(request);
  }

  public PrivateAccessSettings get(String privateAccessSettingsId) {
    return get(new GetPrivateAccesRequest().setPrivateAccessSettingsId(privateAccessSettingsId));
  }

  /**
   * Gets a private access settings object, which specifies how your workspace is accessed over [AWS
   * PrivateLink].
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].",
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   */
  public PrivateAccessSettings get(GetPrivateAccesRequest request) {
    return impl.get(request);
  }

  /** Gets a list of all private access settings objects for an account, specified by ID. */
  public Iterable<PrivateAccessSettings> list() {
    return impl.list();
  }

  /**
   * Updates an existing private access settings object, which specifies how your workspace is
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
   */
  public void replace(UpsertPrivateAccessSettingsRequest request) {
    impl.replace(request);
  }

  public PrivateAccessService impl() {
    return impl;
  }
}
