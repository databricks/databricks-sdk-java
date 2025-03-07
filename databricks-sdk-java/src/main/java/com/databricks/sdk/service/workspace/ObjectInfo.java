// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The information of the object in workspace. It will be returned by ``list`` and ``get-status``.
 */
@Generated
public class ObjectInfo {
  /** Only applicable to files. The creation UTC timestamp. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** The language of the object. This value is set only if the object type is ``NOTEBOOK``. */
  @JsonProperty("language")
  private Language language;

  /** Only applicable to files, the last modified UTC timestamp. */
  @JsonProperty("modified_at")
  private Long modifiedAt;

  /** Unique identifier for the object. */
  @JsonProperty("object_id")
  private Long objectId;

  /**
   * The type of the object in workspace.
   *
   * <p>- `NOTEBOOK`: document that contains runnable code, visualizations, and explanatory text. -
   * `DIRECTORY`: directory - `LIBRARY`: library - `FILE`: file - `REPO`: repository - `DASHBOARD`:
   * Lakeview dashboard
   */
  @JsonProperty("object_type")
  private ObjectType objectType;

  /** The absolute path of the object. */
  @JsonProperty("path")
  private String path;

  /** A unique identifier for the object that is consistent across all Databricks APIs. */
  @JsonProperty("resource_id")
  private String resourceId;

  /** Only applicable to files. The file size in bytes can be returned. */
  @JsonProperty("size")
  private Long size;

  public ObjectInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ObjectInfo setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

  public ObjectInfo setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  public Long getModifiedAt() {
    return modifiedAt;
  }

  public ObjectInfo setObjectId(Long objectId) {
    this.objectId = objectId;
    return this;
  }

  public Long getObjectId() {
    return objectId;
  }

  public ObjectInfo setObjectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  public ObjectType getObjectType() {
    return objectType;
  }

  public ObjectInfo setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public ObjectInfo setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public ObjectInfo setSize(Long size) {
    this.size = size;
    return this;
  }

  public Long getSize() {
    return size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ObjectInfo that = (ObjectInfo) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(language, that.language)
        && Objects.equals(modifiedAt, that.modifiedAt)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(path, that.path)
        && Objects.equals(resourceId, that.resourceId)
        && Objects.equals(size, that.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, language, modifiedAt, objectId, objectType, path, resourceId, size);
  }

  @Override
  public String toString() {
    return new ToStringer(ObjectInfo.class)
        .add("createdAt", createdAt)
        .add("language", language)
        .add("modifiedAt", modifiedAt)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("path", path)
        .add("resourceId", resourceId)
        .add("size", size)
        .toString();
  }
}
