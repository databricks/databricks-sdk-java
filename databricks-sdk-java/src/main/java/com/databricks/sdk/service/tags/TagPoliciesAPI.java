// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tags;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The Tag Policy API allows you to manage policies for governed tags in Databricks. */
@Generated
public class TagPoliciesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TagPoliciesAPI.class);

  private final TagPoliciesService impl;

  /** Regular-use constructor */
  public TagPoliciesAPI(ApiClient apiClient) {
    impl = new TagPoliciesImpl(apiClient);
  }

  /** Constructor for mocks */
  public TagPoliciesAPI(TagPoliciesService mock) {
    impl = mock;
  }

  /** Creates a new tag policy, making the associated tag key governed. */
  public TagPolicy createTagPolicy(CreateTagPolicyRequest request) {
    return impl.createTagPolicy(request);
  }

  public void deleteTagPolicy(String tagKey) {
    deleteTagPolicy(new DeleteTagPolicyRequest().setTagKey(tagKey));
  }

  /** Deletes a tag policy by its associated governed tag's key, leaving that tag key ungoverned. */
  public void deleteTagPolicy(DeleteTagPolicyRequest request) {
    impl.deleteTagPolicy(request);
  }

  public TagPolicy getTagPolicy(String tagKey) {
    return getTagPolicy(new GetTagPolicyRequest().setTagKey(tagKey));
  }

  /** Gets a single tag policy by its associated governed tag's key. */
  public TagPolicy getTagPolicy(GetTagPolicyRequest request) {
    return impl.getTagPolicy(request);
  }

  /** Lists the tag policies for all governed tags in the account. */
  public Iterable<TagPolicy> listTagPolicies(ListTagPoliciesRequest request) {
    return new Paginator<>(
        request,
        impl::listTagPolicies,
        ListTagPoliciesResponse::getTagPolicies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates an existing tag policy for a single governed tag. */
  public TagPolicy updateTagPolicy(UpdateTagPolicyRequest request) {
    return impl.updateTagPolicy(request);
  }

  public TagPoliciesService impl() {
    return impl;
  }
}
