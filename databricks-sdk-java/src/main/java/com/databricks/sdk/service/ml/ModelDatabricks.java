// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ModelDatabricks.ModelDatabricksSerializer.class)
@JsonDeserialize(using = ModelDatabricks.ModelDatabricksDeserializer.class)
public class ModelDatabricks {
  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  private Long creationTimestamp;

  /** User-specified description for the object. */
  private String description;

  /** Unique identifier for the object. */
  private String id;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  private Long lastUpdatedTimestamp;

  /** Array of model versions, each the latest version for its stage. */
  private Collection<ModelVersion> latestVersions;

  /** Name of the model. */
  private String name;

  /**
   * Permission level of the requesting user on the object. For what is allowed at each level, see
   * [MLflow Model permissions](..).
   */
  private PermissionLevel permissionLevel;

  /** Array of tags associated with the model. */
  private Collection<ModelTag> tags;

  /** The username of the user that created the object. */
  private String userId;

  public ModelDatabricks setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ModelDatabricks setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ModelDatabricks setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ModelDatabricks setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ModelDatabricks setLatestVersions(Collection<ModelVersion> latestVersions) {
    this.latestVersions = latestVersions;
    return this;
  }

  public Collection<ModelVersion> getLatestVersions() {
    return latestVersions;
  }

  public ModelDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelDatabricks setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ModelDatabricks setTags(Collection<ModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelTag> getTags() {
    return tags;
  }

  public ModelDatabricks setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelDatabricks that = (ModelDatabricks) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(latestVersions, that.latestVersions)
        && Objects.equals(name, that.name)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        description,
        id,
        lastUpdatedTimestamp,
        latestVersions,
        name,
        permissionLevel,
        tags,
        userId);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelDatabricks.class)
        .add("creationTimestamp", creationTimestamp)
        .add("description", description)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("latestVersions", latestVersions)
        .add("name", name)
        .add("permissionLevel", permissionLevel)
        .add("tags", tags)
        .add("userId", userId)
        .toString();
  }

  ModelDatabricksPb toPb() {
    ModelDatabricksPb pb = new ModelDatabricksPb();
    pb.setCreationTimestamp(creationTimestamp);
    pb.setDescription(description);
    pb.setId(id);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setLatestVersions(latestVersions);
    pb.setName(name);
    pb.setPermissionLevel(permissionLevel);
    pb.setTags(tags);
    pb.setUserId(userId);

    return pb;
  }

  static ModelDatabricks fromPb(ModelDatabricksPb pb) {
    ModelDatabricks model = new ModelDatabricks();
    model.setCreationTimestamp(pb.getCreationTimestamp());
    model.setDescription(pb.getDescription());
    model.setId(pb.getId());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setLatestVersions(pb.getLatestVersions());
    model.setName(pb.getName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setTags(pb.getTags());
    model.setUserId(pb.getUserId());

    return model;
  }

  public static class ModelDatabricksSerializer extends JsonSerializer<ModelDatabricks> {
    @Override
    public void serialize(ModelDatabricks value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ModelDatabricksPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ModelDatabricksDeserializer extends JsonDeserializer<ModelDatabricks> {
    @Override
    public ModelDatabricks deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ModelDatabricksPb pb = mapper.readValue(p, ModelDatabricksPb.class);
      return ModelDatabricks.fromPb(pb);
    }
  }
}
