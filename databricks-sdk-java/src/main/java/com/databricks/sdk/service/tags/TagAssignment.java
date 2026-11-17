// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A tag assignment attaches a tag, which is a key with an optional value, to a workspace object
 * such as a dashboard, notebook, Genie space or app. An object can have at most one assignment for
 * each tag key. If the key belongs to a governed tag, the caller needs the ASSIGN permission on
 * that governed tag, and the value must be one of its allowed values. See
 * https://docs.databricks.com/aws/en/admin/governed-tags/.
 */
@Generated
public class TagAssignment {
  /**
   * The identifier of the entity to which the tag is assigned. For apps, the entity_id is the app
   * name
   */
  @JsonProperty("entity_id")
  private String entityId;

  /**
   * The type of entity to which the tag is assigned. Allowed values are apps, dashboards,
   * geniespaces, notebooks
   */
  @JsonProperty("entity_type")
  private String entityType;

  /** The key of the tag. The characters , . : / - = and leading/trailing spaces are not allowed */
  @JsonProperty("tag_key")
  private String tagKey;

  /** The value of the tag. If the value is omitted, the tag is assigned with its key only. */
  @JsonProperty("tag_value")
  private String tagValue;

  public TagAssignment setEntityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  public String getEntityId() {
    return entityId;
  }

  public TagAssignment setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public TagAssignment setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  public TagAssignment setTagValue(String tagValue) {
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
    TagAssignment that = (TagAssignment) o;
    return Objects.equals(entityId, that.entityId)
        && Objects.equals(entityType, that.entityType)
        && Objects.equals(tagKey, that.tagKey)
        && Objects.equals(tagValue, that.tagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, tagKey, tagValue);
  }

  @Override
  public String toString() {
    return new ToStringer(TagAssignment.class)
        .add("entityId", entityId)
        .add("entityType", entityType)
        .add("tagKey", tagKey)
        .add("tagValue", tagValue)
        .toString();
  }
}
