// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;

/**
 * The Tag Policy API allows you to manage tag policies in Databricks.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface TagPoliciesService {
  /** Creates a new tag policy. */
  TagPolicy createTagPolicy(CreateTagPolicyRequest createTagPolicyRequest);

  /** Deletes a tag policy by its key. */
  void deleteTagPolicy(DeleteTagPolicyRequest deleteTagPolicyRequest);

  /** Gets a single tag policy by its key. */
  TagPolicy getTagPolicy(GetTagPolicyRequest getTagPolicyRequest);

  /** Lists all tag policies in the account. */
  ListTagPoliciesResponse listTagPolicies(ListTagPoliciesRequest listTagPoliciesRequest);

  /** Updates an existing tag policy. */
  TagPolicy updateTagPolicy(UpdateTagPolicyRequest updateTagPolicyRequest);
}
