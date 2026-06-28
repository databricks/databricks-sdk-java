// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;

/**
 * The Tag Policy API allows you to manage policies for governed tags in Databricks. For Terraform
 * usage, see the [Tag Policy Terraform documentation]. Permissions for tag policies can be managed
 * using the [Account Access Control Proxy API].
 *
 * <p>[Account Access Control Proxy API]:
 * https://docs.databricks.com/api/workspace/accountaccesscontrolproxy [Tag Policy Terraform
 * documentation]:
 * https://registry.terraform.io/providers/databricks/databricks/latest/docs/resources/tag_policy
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface TagPoliciesService {
  /**
   * Creates a new tag policy, making the associated tag key governed. For Terraform usage, see the
   * [Tag Policy Terraform documentation]. To manage permissions for tag policies, use the [Account
   * Access Control Proxy API].
   *
   * <p>[Account Access Control Proxy API]:
   * https://docs.databricks.com/api/workspace/accountaccesscontrolproxy [Tag Policy Terraform
   * documentation]:
   * https://registry.terraform.io/providers/databricks/databricks/latest/docs/resources/tag_policy
   */
  TagPolicy createTagPolicy(CreateTagPolicyRequest createTagPolicyRequest);

  /**
   * Deletes a tag policy by its associated governed tag's key, leaving that tag key ungoverned. For
   * Terraform usage, see the [Tag Policy Terraform documentation].
   *
   * <p>[Tag Policy Terraform documentation]:
   * https://registry.terraform.io/providers/databricks/databricks/latest/docs/resources/tag_policy
   */
  void deleteTagPolicy(DeleteTagPolicyRequest deleteTagPolicyRequest);

  /**
   * Gets a single tag policy by its associated governed tag's key. For Terraform usage, see the
   * [Tag Policy Terraform documentation]. To list granted permissions for tag policies, use the
   * [Account Access Control Proxy API].
   *
   * <p>[Account Access Control Proxy API]:
   * https://docs.databricks.com/api/workspace/accountaccesscontrolproxy [Tag Policy Terraform
   * documentation]:
   * https://registry.terraform.io/providers/databricks/databricks/latest/docs/data-sources/tag_policy
   */
  TagPolicy getTagPolicy(GetTagPolicyRequest getTagPolicyRequest);

  /**
   * Lists the tag policies for all governed tags in the account. For Terraform usage, see the [Tag
   * Policy Terraform documentation]. To list granted permissions for tag policies, use the [Account
   * Access Control Proxy API].
   *
   * <p>[Account Access Control Proxy API]:
   * https://docs.databricks.com/api/workspace/accountaccesscontrolproxy [Tag Policy Terraform
   * documentation]:
   * https://registry.terraform.io/providers/databricks/databricks/latest/docs/data-sources/tag_policies
   */
  ListTagPoliciesResponse listTagPolicies(ListTagPoliciesRequest listTagPoliciesRequest);

  /**
   * Updates an existing tag policy for a single governed tag. For Terraform usage, see the [Tag
   * Policy Terraform documentation]. To manage permissions for tag policies, use the [Account
   * Access Control Proxy API].
   *
   * <p>[Account Access Control Proxy API]:
   * https://docs.databricks.com/api/workspace/accountaccesscontrolproxy [Tag Policy Terraform
   * documentation]:
   * https://registry.terraform.io/providers/databricks/databricks/latest/docs/resources/tag_policy
   */
  TagPolicy updateTagPolicy(UpdateTagPolicyRequest updateTagPolicyRequest);
}
