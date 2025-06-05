// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = UpdateSchema.UpdateSchemaSerializer.class)
@JsonDeserialize(using = UpdateSchema.UpdateSchemaDeserializer.class)
public class UpdateSchema {
  /** User-provided free-form text description. */
  private String comment;

  /** Whether predictive optimization should be enabled for this object and objects under it. */
  private EnablePredictiveOptimization enablePredictiveOptimization;

  /** Full name of the schema. */
  private String fullName;

  /** New name for the schema. */
  private String newName;

  /** Username of current owner of schema. */
  private String owner;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  public UpdateSchema setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateSchema setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public UpdateSchema setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateSchema setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateSchema setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateSchema setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSchema that = (UpdateSchema) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment, enablePredictiveOptimization, fullName, newName, owner, properties);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSchema.class)
        .add("comment", comment)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("fullName", fullName)
        .add("newName", newName)
        .add("owner", owner)
        .add("properties", properties)
        .toString();
  }

  UpdateSchemaPb toPb() {
    UpdateSchemaPb pb = new UpdateSchemaPb();
    pb.setComment(comment);
    pb.setEnablePredictiveOptimization(enablePredictiveOptimization);
    pb.setFullName(fullName);
    pb.setNewName(newName);
    pb.setOwner(owner);
    pb.setProperties(properties);

    return pb;
  }

  static UpdateSchema fromPb(UpdateSchemaPb pb) {
    UpdateSchema model = new UpdateSchema();
    model.setComment(pb.getComment());
    model.setEnablePredictiveOptimization(pb.getEnablePredictiveOptimization());
    model.setFullName(pb.getFullName());
    model.setNewName(pb.getNewName());
    model.setOwner(pb.getOwner());
    model.setProperties(pb.getProperties());

    return model;
  }

  public static class UpdateSchemaSerializer extends JsonSerializer<UpdateSchema> {
    @Override
    public void serialize(UpdateSchema value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateSchemaPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateSchemaDeserializer extends JsonDeserializer<UpdateSchema> {
    @Override
    public UpdateSchema deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateSchemaPb pb = mapper.readValue(p, UpdateSchemaPb.class);
      return UpdateSchema.fromPb(pb);
    }
  }
}
