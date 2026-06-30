// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListTagPoliciesResponse {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("tag_policies")
  private Collection<TagPolicy> tagPolicies;

  public ListTagPoliciesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListTagPoliciesResponse setTagPolicies(Collection<TagPolicy> tagPolicies) {
    this.tagPolicies = tagPolicies;
    return this;
  }

  public Collection<TagPolicy> getTagPolicies() {
    return tagPolicies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTagPoliciesResponse that = (ListTagPoliciesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(tagPolicies, that.tagPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tagPolicies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTagPoliciesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tagPolicies", tagPolicies)
        .toString();
  }
}
