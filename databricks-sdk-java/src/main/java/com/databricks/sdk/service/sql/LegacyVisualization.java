// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
 * The visualization description API changes frequently and is unsupported. You can duplicate a
 * visualization by copying description objects received _from the API_ and then using them to
 * create a new one with a POST request to the same endpoint. Databricks does not recommend
 * constructing ad-hoc visualizations entirely in JSON.
 */
@Generated
@JsonSerialize(using = LegacyVisualization.LegacyVisualizationSerializer.class)
@JsonDeserialize(using = LegacyVisualization.LegacyVisualizationDeserializer.class)
public class LegacyVisualization {
  /** */
  private String createdAt;

  /** A short description of this visualization. This is not displayed in the UI. */
  private String description;

  /** The UUID for this visualization. */
  private String id;

  /** The name of the visualization that appears on dashboards and the query screen. */
  private String name;

  /**
   * The options object varies widely from one visualization type to the next and is unsupported.
   * Databricks does not recommend modifying visualization settings in JSON.
   */
  private Object options;

  /** */
  private LegacyQuery query;

  /** The type of visualization: chart, table, pivot table, and so on. */
  private String typeValue;

  /** */
  private String updatedAt;

  public LegacyVisualization setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public LegacyVisualization setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public LegacyVisualization setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public LegacyVisualization setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LegacyVisualization setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public LegacyVisualization setQuery(LegacyQuery query) {
    this.query = query;
    return this;
  }

  public LegacyQuery getQuery() {
    return query;
  }

  public LegacyVisualization setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public LegacyVisualization setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LegacyVisualization that = (LegacyVisualization) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(query, that.query)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, id, name, options, query, typeValue, updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(LegacyVisualization.class)
        .add("createdAt", createdAt)
        .add("description", description)
        .add("id", id)
        .add("name", name)
        .add("options", options)
        .add("query", query)
        .add("typeValue", typeValue)
        .add("updatedAt", updatedAt)
        .toString();
  }

  LegacyVisualizationPb toPb() {
    LegacyVisualizationPb pb = new LegacyVisualizationPb();
    pb.setCreatedAt(createdAt);
    pb.setDescription(description);
    pb.setId(id);
    pb.setName(name);
    pb.setOptions(options);
    pb.setQuery(query);
    pb.setType(typeValue);
    pb.setUpdatedAt(updatedAt);

    return pb;
  }

  static LegacyVisualization fromPb(LegacyVisualizationPb pb) {
    LegacyVisualization model = new LegacyVisualization();
    model.setCreatedAt(pb.getCreatedAt());
    model.setDescription(pb.getDescription());
    model.setId(pb.getId());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setQuery(pb.getQuery());
    model.setType(pb.getType());
    model.setUpdatedAt(pb.getUpdatedAt());

    return model;
  }

  public static class LegacyVisualizationSerializer extends JsonSerializer<LegacyVisualization> {
    @Override
    public void serialize(LegacyVisualization value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LegacyVisualizationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LegacyVisualizationDeserializer
      extends JsonDeserializer<LegacyVisualization> {
    @Override
    public LegacyVisualization deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LegacyVisualizationPb pb = mapper.readValue(p, LegacyVisualizationPb.class);
      return LegacyVisualization.fromPb(pb);
    }
  }
}
