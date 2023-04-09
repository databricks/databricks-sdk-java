// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ObjectInfo {
  /** <content needed> */
  @JsonProperty("created_at")
  private Long createdAt;

  /** The language of the object. This value is set only if the object type is `NOTEBOOK`. */
  @JsonProperty("language")
  private Language language;

  /** <content needed> */
  @JsonProperty("modified_at")
  private Long modifiedAt;

  /** <content needed> */
  @JsonProperty("object_id")
  private Long objectId;

  /** The type of the object in workspace. */
  @JsonProperty("object_type")
  private ObjectType objectType;

  /** The absolute path of the object. */
  @JsonProperty("path")
  private String path;

  /** <content needed> */
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
        && Objects.equals(size, that.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, language, modifiedAt, objectId, objectType, path, size);
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
        .add("size", size)
        .toString();
  }
}
