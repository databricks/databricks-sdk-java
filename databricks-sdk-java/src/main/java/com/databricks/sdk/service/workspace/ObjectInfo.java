// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ObjectInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>language</code>.</p>
   *
   * @param language a {@link com.databricks.sdk.service.workspace.Language} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo setLanguage(Language language) {
    this.language = language;
    return this;
  }

  /**
   * <p>Getter for the field <code>language</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.Language} object
   */
  public Language getLanguage() {
    return language;
  }

  /**
   * <p>Setter for the field <code>modifiedAt</code>.</p>
   *
   * @param modifiedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>modifiedAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getModifiedAt() {
    return modifiedAt;
  }

  /**
   * <p>Setter for the field <code>objectId</code>.</p>
   *
   * @param objectId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo setObjectId(Long objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * <p>Getter for the field <code>objectId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getObjectId() {
    return objectId;
  }

  /**
   * <p>Setter for the field <code>objectType</code>.</p>
   *
   * @param objectType a {@link com.databricks.sdk.service.workspace.ObjectType} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo setObjectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * <p>Getter for the field <code>objectType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.ObjectType} object
   */
  public ObjectType getObjectType() {
    return objectType;
  }

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo setPath(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>Getter for the field <code>path</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /**
   * <p>Setter for the field <code>size</code>.</p>
   *
   * @param size a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo setSize(Long size) {
    this.size = size;
    return this;
  }

  /**
   * <p>Getter for the field <code>size</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getSize() {
    return size;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(createdAt, language, modifiedAt, objectId, objectType, path, size);
  }

  /** {@inheritDoc} */
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
