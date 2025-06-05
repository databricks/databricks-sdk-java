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
@JsonSerialize(using = Model.ModelSerializer.class)
@JsonDeserialize(using = Model.ModelDeserializer.class)
public class Model {
  /** Timestamp recorded when this `registered_model` was created. */
  private Long creationTimestamp;

  /** Description of this `registered_model`. */
  private String description;

  /** Timestamp recorded when metadata for this `registered_model` was last updated. */
  private Long lastUpdatedTimestamp;

  /**
   * Collection of latest model versions for each stage. Only contains models with current `READY`
   * status.
   */
  private Collection<ModelVersion> latestVersions;

  /** Unique name for the model. */
  private String name;

  /** Tags: Additional metadata key-value pairs for this `registered_model`. */
  private Collection<ModelTag> tags;

  /** User that created this `registered_model` */
  private String userId;

  public Model setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public Model setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Model setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public Model setLatestVersions(Collection<ModelVersion> latestVersions) {
    this.latestVersions = latestVersions;
    return this;
  }

  public Collection<ModelVersion> getLatestVersions() {
    return latestVersions;
  }

  public Model setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Model setTags(Collection<ModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelTag> getTags() {
    return tags;
  }

  public Model setUserId(String userId) {
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
    Model that = (Model) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(description, that.description)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(latestVersions, that.latestVersions)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp, description, lastUpdatedTimestamp, latestVersions, name, tags, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(Model.class)
        .add("creationTimestamp", creationTimestamp)
        .add("description", description)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("latestVersions", latestVersions)
        .add("name", name)
        .add("tags", tags)
        .add("userId", userId)
        .toString();
  }

  ModelPb toPb() {
    ModelPb pb = new ModelPb();
    pb.setCreationTimestamp(creationTimestamp);
    pb.setDescription(description);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setLatestVersions(latestVersions);
    pb.setName(name);
    pb.setTags(tags);
    pb.setUserId(userId);

    return pb;
  }

  static Model fromPb(ModelPb pb) {
    Model model = new Model();
    model.setCreationTimestamp(pb.getCreationTimestamp());
    model.setDescription(pb.getDescription());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setLatestVersions(pb.getLatestVersions());
    model.setName(pb.getName());
    model.setTags(pb.getTags());
    model.setUserId(pb.getUserId());

    return model;
  }

  public static class ModelSerializer extends JsonSerializer<Model> {
    @Override
    public void serialize(Model value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ModelPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ModelDeserializer extends JsonDeserializer<Model> {
    @Override
    public Model deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ModelPb pb = mapper.readValue(p, ModelPb.class);
      return Model.fromPb(pb);
    }
  }
}
