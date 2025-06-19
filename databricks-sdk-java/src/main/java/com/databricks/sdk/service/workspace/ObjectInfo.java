// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/**
 * The information of the object in workspace. It will be returned by ``list`` and ``get-status``.
 */
@Generated
@JsonSerialize(using = ObjectInfo.ObjectInfoSerializer.class)
@JsonDeserialize(using = ObjectInfo.ObjectInfoDeserializer.class)
public class ObjectInfo {
  /** Only applicable to files. The creation UTC timestamp. */
  private Long createdAt;

  /** The language of the object. This value is set only if the object type is ``NOTEBOOK``. */
  private Language language;

  /** Only applicable to files, the last modified UTC timestamp. */
  private Long modifiedAt;

  /** Unique identifier for the object. */
  private Long objectId;

  /**
   * The type of the object in workspace.
   *
   * <p>- `NOTEBOOK`: document that contains runnable code, visualizations, and explanatory text. -
   * `DIRECTORY`: directory - `LIBRARY`: library - `FILE`: file - `REPO`: repository - `DASHBOARD`:
   * Lakeview dashboard
   */
  private ObjectType objectType;

  /** The absolute path of the object. */
  private String path;

  /** A unique identifier for the object that is consistent across all Databricks APIs. */
  private String resourceId;

  /** Only applicable to files. The file size in bytes can be returned. */
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

  ObjectInfoPb toPb() {
    ObjectInfoPb pb = new ObjectInfoPb();
    pb.setCreatedAt(createdAt);
    pb.setLanguage(language);
    pb.setModifiedAt(modifiedAt);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);
    pb.setPath(path);
    pb.setResourceId(resourceId);
    pb.setSize(size);

    return pb;
  }

  static ObjectInfo fromPb(ObjectInfoPb pb) {
    ObjectInfo model = new ObjectInfo();
    model.setCreatedAt(pb.getCreatedAt());
    model.setLanguage(pb.getLanguage());
    model.setModifiedAt(pb.getModifiedAt());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());
    model.setPath(pb.getPath());
    model.setResourceId(pb.getResourceId());
    model.setSize(pb.getSize());

    return model;
  }

  public static class ObjectInfoSerializer extends JsonSerializer<ObjectInfo> {
    @Override
    public void serialize(ObjectInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ObjectInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ObjectInfoDeserializer extends JsonDeserializer<ObjectInfo> {
    @Override
    public ObjectInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ObjectInfoPb pb = mapper.readValue(p, ObjectInfoPb.class);
      return ObjectInfo.fromPb(pb);
    }
  }
}
