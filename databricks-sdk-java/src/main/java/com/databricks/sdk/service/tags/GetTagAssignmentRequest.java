// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetTagAssignmentRequest {
  /** The identifier of the entity to which the tag is assigned */
  @JsonIgnore private String entityId;

  /** The type of entity to which the tag is assigned. Allowed values are dashboards, geniespaces */
  @JsonIgnore private String entityType;

  /** The key of the tag. The characters , . : / - = and leading/trailing spaces are not allowed */
  @JsonIgnore private String tagKey;

  public GetTagAssignmentRequest setEntityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  public String getEntityId() {
    return entityId;
  }

  public GetTagAssignmentRequest setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public GetTagAssignmentRequest setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTagAssignmentRequest that = (GetTagAssignmentRequest) o;
    return Objects.equals(entityId, that.entityId)
        && Objects.equals(entityType, that.entityType)
        && Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTagAssignmentRequest.class)
        .add("entityId", entityId)
        .add("entityType", entityType)
        .add("tagKey", tagKey)
        .toString();
  }
}
