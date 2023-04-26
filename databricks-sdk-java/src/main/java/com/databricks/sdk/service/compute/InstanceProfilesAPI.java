// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Instance Profiles API allows admins to add, list, and remove instance profiles that users can
 * launch clusters with. Regular users can list the instance profiles available to them. See [Secure
 * access to S3 buckets] using instance profiles for more information.
 *
 * <p>[Secure access to S3 buckets]:
 * https://docs.databricks.com/administration-guide/cloud-configurations/aws/instance-profiles.html
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class InstanceProfilesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(InstanceProfilesAPI.class);

  private final InstanceProfilesService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public InstanceProfilesAPI(ApiClient apiClient) {
    impl = new InstanceProfilesImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.compute.InstanceProfilesService} object
   */
  public InstanceProfilesAPI(InstanceProfilesService mock) {
    impl = mock;
  }

  /**
   * <p>add.</p>
   *
   * @param instanceProfileArn a {@link java.lang.String} object
   */
  public void add(String instanceProfileArn) {
    add(new AddInstanceProfile().setInstanceProfileArn(instanceProfileArn));
  }

  /**
   * Register an instance profile.
   *
   * <p>In the UI, you can select the instance profile when launching clusters. This API is only
   * available to admin users.
   *
   * @param request a {@link com.databricks.sdk.service.compute.AddInstanceProfile} object
   */
  public void add(AddInstanceProfile request) {
    impl.add(request);
  }

  /**
   * <p>edit.</p>
   *
   * @param instanceProfileArn a {@link java.lang.String} object
   */
  public void edit(String instanceProfileArn) {
    edit(new InstanceProfile().setInstanceProfileArn(instanceProfileArn));
  }

  /**
   * Edit an instance profile.
   *
   * <p>The only supported field to change is the optional IAM role ARN associated with the instance
   * profile. It is required to specify the IAM role ARN if both of the following are true:
   *
   * <p>* Your role name and instance profile name do not match. The name is the part after the last
   * slash in each ARN. * You want to use the instance profile with [Databricks SQL Serverless].
   *
   * <p>To understand where these fields are in the AWS console, see [Enable serverless SQL
   * warehouses].
   *
   * <p>This API is only available to admin users.
   *
   * <p>[Databricks SQL Serverless]: https://docs.databricks.com/sql/admin/serverless.html [Enable
   * serverless SQL warehouses]: https://docs.databricks.com/sql/admin/serverless.html
   *
   * @param request a {@link com.databricks.sdk.service.compute.InstanceProfile} object
   */
  public void edit(InstanceProfile request) {
    impl.edit(request);
  }

  /**
   * List available instance profiles.
   *
   * <p>List the instance profiles that the calling user can use to launch a cluster.
   *
   * <p>This API is available to all users.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<InstanceProfile> list() {
    return impl.list().getInstanceProfiles();
  }

  /**
   * <p>remove.</p>
   *
   * @param instanceProfileArn a {@link java.lang.String} object
   */
  public void remove(String instanceProfileArn) {
    remove(new RemoveInstanceProfile().setInstanceProfileArn(instanceProfileArn));
  }

  /**
   * Remove the instance profile.
   *
   * <p>Remove the instance profile with the provided ARN. Existing clusters with this instance
   * profile will continue to function.
   *
   * <p>This API is only accessible to admin users.
   *
   * @param request a {@link com.databricks.sdk.service.compute.RemoveInstanceProfile} object
   */
  public void remove(RemoveInstanceProfile request) {
    impl.remove(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.InstanceProfilesService} object
   */
  public InstanceProfilesService impl() {
    return impl;
  }
}
