// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * The Instance Profiles API allows admins to add, list, and remove instance profiles that users can
 * launch clusters with. Regular users can list the instance profiles available to them. See <a
 * href="https://docs.databricks.com/administration-guide/cloud-configurations/aws/instance-profiles.html">Secure
 * access to S3 buckets</a> using instance profiles for more information.
 */
@Generated
public class InstanceProfilesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(InstanceProfilesAPI.class);

  private final InstanceProfilesService impl;

  /** Regular-use constructor */
  public InstanceProfilesAPI(ApiClient apiClient) {
    impl = new InstanceProfilesImpl(apiClient);
  }

  /** Constructor for mocks */
  public InstanceProfilesAPI(InstanceProfilesService mock) {
    impl = mock;
  }

  /**
   * Registers an instance profile in Databricks. In the UI, you can then give users the permission
   * to use this instance profile when launching clusters.
   *
   * <p>This API is only available to admin users.
   */
  public void add(AddInstanceProfile request) {
    impl.add(request);
  }

  /**
   * The only supported field to change is the optional IAM role ARN associated with the instance
   * profile. It is required to specify the IAM role ARN if both of the following are true:
   *
   * <ul>
   *   <li>Your role name and instance profile name do not match. The name is the part after the
   *       last slash in each ARN.
   *   <li>You want to use the instance profile with <a
   *       href="https://docs.databricks.com/sql/admin/serverless.html">Databricks SQL
   *       Serverless</a>.
   * </ul>
   *
   * <p>To understand where these fields are in the AWS console, see <a
   * href="https://docs.databricks.com/sql/admin/serverless.html">Enable serverless SQL
   * warehouses</a>.
   *
   * <p>This API is only available to admin users.
   */
  public void edit(InstanceProfile request) {
    impl.edit(request);
  }

  /**
   * List the instance profiles that the calling user can use to launch a cluster.
   *
   * <p>This API is available to all users.
   */
  public Iterable<InstanceProfile> list() {
    return Paginator.newOffsetPagination(
        null,
        (Void v) -> impl.list(),
        ListInstanceProfilesResponse::getInstanceProfiles,
        response -> null);
  }

  public void remove(String instanceProfileArn) {
    remove(new RemoveInstanceProfile().setInstanceProfileArn(instanceProfileArn));
  }

  /**
   * Remove the instance profile with the provided ARN. Existing clusters with this instance profile
   * will continue to function.
   *
   * <p>This API is only accessible to admin users.
   */
  public void remove(RemoveInstanceProfile request) {
    impl.remove(request);
  }

  public InstanceProfilesService impl() {
    return impl;
  }
}
