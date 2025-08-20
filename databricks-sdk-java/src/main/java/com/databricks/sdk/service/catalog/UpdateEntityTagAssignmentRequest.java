// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateEntityTagAssignmentRequest {
  /** The fully qualified name of the entity to which the tag is assigned */
  @JsonIgnore private String entityName;

  /**
   * The type of the entity to which the tag is assigned. Allowed values are: catalogs, schemas,
   * tables, columns, volumes.
   */
  @JsonIgnore private String entityType;

  /** */
  @JsonProperty("tag_assignment")
  private EntityTagAssignment tagAssignment;

  /** The key of the tag */
  @JsonIgnore private String tagKey;

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

  public UpdateEntityTagAssignmentRequest setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public UpdateEntityTagAssignmentRequest setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public UpdateEntityTagAssignmentRequest setTagAssignment(EntityTagAssignment tagAssignment) {
    this.tagAssignment = tagAssignment;
    return this;
  }

  public EntityTagAssignment getTagAssignment() {
    return tagAssignment;
  }

  public UpdateEntityTagAssignmentRequest setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  public UpdateEntityTagAssignmentRequest setUpdateMask(String updateMask) {
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
    UpdateEntityTagAssignmentRequest that = (UpdateEntityTagAssignmentRequest) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityType, that.entityType)
        && Objects.equals(tagAssignment, that.tagAssignment)
        && Objects.equals(tagKey, that.tagKey)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, entityType, tagAssignment, tagKey, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateEntityTagAssignmentRequest.class)
        .add("entityName", entityName)
        .add("entityType", entityType)
        .add("tagAssignment", tagAssignment)
        .add("tagKey", tagKey)
        .add("updateMask", updateMask)
        .toString();
  }
}
