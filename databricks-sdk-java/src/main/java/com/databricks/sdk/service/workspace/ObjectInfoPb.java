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
class ObjectInfoPb {
  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("modified_at")
  private Long modifiedAt;

  @JsonProperty("object_id")
  private Long objectId;

  @JsonProperty("object_type")
  private ObjectType objectType;

  @JsonProperty("path")
  private String path;

  @JsonProperty("resource_id")
  private String resourceId;

  @JsonProperty("size")
  private Long size;

  public ObjectInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ObjectInfoPb setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

  public ObjectInfoPb setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  public Long getModifiedAt() {
    return modifiedAt;
  }

  public ObjectInfoPb setObjectId(Long objectId) {
    this.objectId = objectId;
    return this;
  }

  public Long getObjectId() {
    return objectId;
  }

  public ObjectInfoPb setObjectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  public ObjectType getObjectType() {
    return objectType;
  }

  public ObjectInfoPb setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public ObjectInfoPb setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public ObjectInfoPb setSize(Long size) {
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
    ObjectInfoPb that = (ObjectInfoPb) o;
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
    return new ToStringer(ObjectInfoPb.class)
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
