// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a tag assignment to an entity */
@Generated
public class EntityTagAssignment {
  /** The fully qualified name of the entity to which the tag is assigned */
  @JsonProperty("entity_name")
  private String entityName;

  /**
   * The type of the entity to which the tag is assigned. Allowed values are: catalogs, schemas,
   * tables, columns, volumes.
   */
  @JsonProperty("entity_type")
  private String entityType;

  /** The key of the tag */
  @JsonProperty("tag_key")
  private String tagKey;

  /** The value of the tag */
  @JsonProperty("tag_value")
  private String tagValue;

  public EntityTagAssignment setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public EntityTagAssignment setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public EntityTagAssignment setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  public EntityTagAssignment setTagValue(String tagValue) {
    this.tagValue = tagValue;
    return this;
  }

  public String getTagValue() {
    return tagValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EntityTagAssignment that = (EntityTagAssignment) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityType, that.entityType)
        && Objects.equals(tagKey, that.tagKey)
        && Objects.equals(tagValue, that.tagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, entityType, tagKey, tagValue);
  }

  @Override
  public String toString() {
    return new ToStringer(EntityTagAssignment.class)
        .add("entityName", entityName)
        .add("entityType", entityType)
        .add("tagKey", tagKey)
        .add("tagValue", tagValue)
        .toString();
  }
}
