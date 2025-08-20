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
  /** */
  @JsonIgnore private String tagKey;

  /** */
  @JsonProperty("tag_policy")
  private TagPolicy tagPolicy;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
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
