// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The Instance Profiles API allows admins to add, list, and remove instance profiles that users can
 * launch clusters with. Regular users can list the instance profiles available to them. See [Secure
 * access to S3 buckets] using instance profiles for more information.
 *
 * <p>[Secure access to S3 buckets]:
 * https://docs.databricks.com/administration-guide/cloud-configurations/aws/instance-profiles.html
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface InstanceProfilesService {
  /**
   * Register an instance profile.
   *
   * <p>In the UI, you can select the instance profile when launching clusters. This API is only
   * available to admin users.
   */
  void add(AddInstanceProfile addInstanceProfile);

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
   */
  void edit(InstanceProfile instanceProfile);

  /**
   * List available instance profiles.
   *
   * <p>List the instance profiles that the calling user can use to launch a cluster.
   *
   * <p>This API is available to all users.
   */
  ListInstanceProfilesResponse list();

  /**
   * Remove the instance profile.
   *
   * <p>Remove the instance profile with the provided ARN. Existing clusters with this instance
   * profile will continue to function.
   *
   * <p>This API is only accessible to admin users.
   */
  void remove(RemoveInstanceProfile removeInstanceProfile);
}
