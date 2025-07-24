// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteEntityTagAssignmentRequest {
  /**
   * Required. The fully qualified structured name of the entity to which the tag is assigned. The
   * entity name should follow the format of: entity_type/fully_qualified_entity_name. eg.
   * catalogs/my_catalog, schemas/my_catalog.my_schema,
   * columns/my_catalog.my_schema.my_table.my_column. When containing segments with special
   * characters (e.g. '/'), the whole segment must be wrapped with backticks. For example,
   * columns/catalog.schema.table.\`column/a\`
   */
  @JsonIgnore private String entityName;

  /** Required. The key of the tag to delete */
  @JsonIgnore private String tagKey;

  public DeleteEntityTagAssignmentRequest setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public DeleteEntityTagAssignmentRequest setTagKey(String tagKey) {
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
    DeleteEntityTagAssignmentRequest that = (DeleteEntityTagAssignmentRequest) o;
    return Objects.equals(entityName, that.entityName) && Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteEntityTagAssignmentRequest.class)
        .add("entityName", entityName)
        .add("tagKey", tagKey)
        .toString();
  }
}
