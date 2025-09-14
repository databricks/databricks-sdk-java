// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;

/**
 * The Tag Policy API allows you to manage policies for governed tags in Databricks.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface TagPoliciesService {
  /** Creates a new tag policy, making the associated tag key governed. */
  TagPolicy createTagPolicy(CreateTagPolicyRequest createTagPolicyRequest);

  /** Deletes a tag policy by its associated governed tag's key, leaving that tag key ungoverned. */
  void deleteTagPolicy(DeleteTagPolicyRequest deleteTagPolicyRequest);

  /** Gets a single tag policy by its associated governed tag's key. */
  TagPolicy getTagPolicy(GetTagPolicyRequest getTagPolicyRequest);

  /** Lists the tag policies for all governed tags in the account. */
  ListTagPoliciesResponse listTagPolicies(ListTagPoliciesRequest listTagPoliciesRequest);

  /** Updates an existing tag policy for a single governed tag. */
  TagPolicy updateTagPolicy(UpdateTagPolicyRequest updateTagPolicyRequest);
}
