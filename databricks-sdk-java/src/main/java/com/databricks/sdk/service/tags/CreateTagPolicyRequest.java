// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateTagPolicyRequest {
  /** */
  @JsonProperty("tag_policy")
  private TagPolicy tagPolicy;

  public CreateTagPolicyRequest setTagPolicy(TagPolicy tagPolicy) {
    this.tagPolicy = tagPolicy;
    return this;
  }

  public TagPolicy getTagPolicy() {
    return tagPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTagPolicyRequest that = (CreateTagPolicyRequest) o;
    return Objects.equals(tagPolicy, that.tagPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTagPolicyRequest.class).add("tagPolicy", tagPolicy).toString();
  }
}
