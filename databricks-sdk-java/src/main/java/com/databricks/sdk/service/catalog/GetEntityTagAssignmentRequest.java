// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetEntityTagAssignmentRequest {
  /** The fully qualified name of the entity to which the tag is assigned */
  @JsonIgnore private String entityName;

  /**
   * The type of the entity to which the tag is assigned. Allowed values are: catalogs, schemas,
   * tables, columns, volumes.
   */
  @JsonIgnore private String entityType;

  /** Required. The key of the tag */
  @JsonIgnore private String tagKey;

  public GetEntityTagAssignmentRequest setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public GetEntityTagAssignmentRequest setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public GetEntityTagAssignmentRequest setTagKey(String tagKey) {
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
    GetEntityTagAssignmentRequest that = (GetEntityTagAssignmentRequest) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityType, that.entityType)
        && Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, entityType, tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEntityTagAssignmentRequest.class)
        .add("entityName", entityName)
        .add("entityType", entityType)
        .add("tagKey", tagKey)
        .toString();
  }
}
