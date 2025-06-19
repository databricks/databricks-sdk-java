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
@JsonSerialize(using = UpdateCatalog.UpdateCatalogSerializer.class)
@JsonDeserialize(using = UpdateCatalog.UpdateCatalogDeserializer.class)
public class UpdateCatalog {
  /** User-provided free-form text description. */
  private String comment;

  /** Whether predictive optimization should be enabled for this object and objects under it. */
  private EnablePredictiveOptimization enablePredictiveOptimization;

  /**
   * Whether the current securable is accessible from all workspaces or a specific set of
   * workspaces.
   */
  private CatalogIsolationMode isolationMode;

  /** The name of the catalog. */
  private String name;

  /** New name for the catalog. */
  private String newName;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> options;

  /** Username of current owner of catalog. */
  private String owner;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  public UpdateCatalog setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateCatalog setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public UpdateCatalog setIsolationMode(CatalogIsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public CatalogIsolationMode getIsolationMode() {
    return isolationMode;
  }

  public UpdateCatalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateCatalog setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateCatalog setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public UpdateCatalog setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateCatalog setProperties(Map<String, String> properties) {
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
    UpdateCatalog that = (UpdateCatalog) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        enablePredictiveOptimization,
        isolationMode,
        name,
        newName,
        options,
        owner,
        properties);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCatalog.class)
        .add("comment", comment)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("isolationMode", isolationMode)
        .add("name", name)
        .add("newName", newName)
        .add("options", options)
        .add("owner", owner)
        .add("properties", properties)
        .toString();
  }

  UpdateCatalogPb toPb() {
    UpdateCatalogPb pb = new UpdateCatalogPb();
    pb.setComment(comment);
    pb.setEnablePredictiveOptimization(enablePredictiveOptimization);
    pb.setIsolationMode(isolationMode);
    pb.setName(name);
    pb.setNewName(newName);
    pb.setOptions(options);
    pb.setOwner(owner);
    pb.setProperties(properties);

    return pb;
  }

  static UpdateCatalog fromPb(UpdateCatalogPb pb) {
    UpdateCatalog model = new UpdateCatalog();
    model.setComment(pb.getComment());
    model.setEnablePredictiveOptimization(pb.getEnablePredictiveOptimization());
    model.setIsolationMode(pb.getIsolationMode());
    model.setName(pb.getName());
    model.setNewName(pb.getNewName());
    model.setOptions(pb.getOptions());
    model.setOwner(pb.getOwner());
    model.setProperties(pb.getProperties());

    return model;
  }

  public static class UpdateCatalogSerializer extends JsonSerializer<UpdateCatalog> {
    @Override
    public void serialize(UpdateCatalog value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCatalogPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCatalogDeserializer extends JsonDeserializer<UpdateCatalog> {
    @Override
    public UpdateCatalog deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCatalogPb pb = mapper.readValue(p, UpdateCatalogPb.class);
      return UpdateCatalog.fromPb(pb);
    }
  }
}
