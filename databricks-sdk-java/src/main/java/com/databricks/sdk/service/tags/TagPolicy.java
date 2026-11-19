// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A tag policy makes a tag key governed and defines the values that can be assigned to it. Governed
 * tags are enforced across all workspaces in the account, and only users with the ASSIGN permission
 * on the governed tag can assign it. See https://docs.databricks.com/aws/en/admin/governed-tags/.
 */
@Generated
public class TagPolicy {
  /** Timestamp when the tag policy was created */
  @JsonProperty("create_time")
  private String createTime;

  /** A description of the governed tag, such as its purpose or the meaning of its values. */
  @JsonProperty("description")
  private String description;

  /** The unique identifier of the tag policy, generated when the policy is created. */
  @JsonProperty("id")
  private String id;

  /** The tag key that this policy governs. Tag keys are case-sensitive. */
  @JsonProperty("tag_key")
  private String tagKey;

  /** Timestamp when the tag policy was last updated */
  @JsonProperty("update_time")
  private String updateTime;

  /**
   * The allowed values of the governed tag. Only these values can be assigned to the tag key, and
   * each value must be unique. A policy without values defines a key-only governed tag.
   */
  @JsonProperty("values")
  private Collection<Value> values;

  public TagPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public TagPolicy setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public TagPolicy setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public TagPolicy setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  public TagPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public TagPolicy setValues(Collection<Value> values) {
    this.values = values;
    return this;
  }

  public Collection<Value> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagPolicy that = (TagPolicy) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(tagKey, that.tagKey)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, description, id, tagKey, updateTime, values);
  }

  @Override
  public String toString() {
    return new ToStringer(TagPolicy.class)
        .add("createTime", createTime)
        .add("description", description)
        .add("id", id)
        .add("tagKey", tagKey)
        .add("updateTime", updateTime)
        .add("values", values)
        .toString();
  }
}
