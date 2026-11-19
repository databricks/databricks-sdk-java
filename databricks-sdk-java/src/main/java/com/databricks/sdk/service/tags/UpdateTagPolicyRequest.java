// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateTagPolicyRequest {
  /** The tag key that this policy governs. Tag keys are case-sensitive. */
  @JsonIgnore private String tagKey;

  /** */
  @JsonProperty("tag_policy")
  private TagPolicy tagPolicy;

  /**
   * The comma-separated list of tag policy fields to update. When the mask includes `values`, the
   * values in the request replace all existing allowed values.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateTagPolicyRequest setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  public UpdateTagPolicyRequest setTagPolicy(TagPolicy tagPolicy) {
    this.tagPolicy = tagPolicy;
    return this;
  }

  public TagPolicy getTagPolicy() {
    return tagPolicy;
  }

  public UpdateTagPolicyRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateTagPolicyRequest that = (UpdateTagPolicyRequest) o;
    return Objects.equals(tagKey, that.tagKey)
        && Objects.equals(tagPolicy, that.tagPolicy)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagPolicy, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateTagPolicyRequest.class)
        .add("tagKey", tagKey)
        .add("tagPolicy", tagPolicy)
        .add("updateMask", updateMask)
        .toString();
  }
}
