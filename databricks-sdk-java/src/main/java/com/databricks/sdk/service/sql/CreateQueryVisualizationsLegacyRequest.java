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

/** Add visualization to a query */
@Generated
@JsonSerialize(
    using =
        CreateQueryVisualizationsLegacyRequest.CreateQueryVisualizationsLegacyRequestSerializer
            .class)
@JsonDeserialize(
    using =
        CreateQueryVisualizationsLegacyRequest.CreateQueryVisualizationsLegacyRequestDeserializer
            .class)
public class CreateQueryVisualizationsLegacyRequest {
  /** A short description of this visualization. This is not displayed in the UI. */
  private String description;

  /** The name of the visualization that appears on dashboards and the query screen. */
  private String name;

  /**
   * The options object varies widely from one visualization type to the next and is unsupported.
   * Databricks does not recommend modifying visualization settings in JSON.
   */
  private Object options;

  /** The identifier returned by :method:queries/create */
  private String queryId;

  /** The type of visualization: chart, table, pivot table, and so on. */
  private String typeValue;

  public CreateQueryVisualizationsLegacyRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateQueryVisualizationsLegacyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateQueryVisualizationsLegacyRequest setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public CreateQueryVisualizationsLegacyRequest setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateQueryVisualizationsLegacyRequest setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateQueryVisualizationsLegacyRequest that = (CreateQueryVisualizationsLegacyRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, options, queryId, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateQueryVisualizationsLegacyRequest.class)
        .add("description", description)
        .add("name", name)
        .add("options", options)
        .add("queryId", queryId)
        .add("typeValue", typeValue)
        .toString();
  }

  CreateQueryVisualizationsLegacyRequestPb toPb() {
    CreateQueryVisualizationsLegacyRequestPb pb = new CreateQueryVisualizationsLegacyRequestPb();
    pb.setDescription(description);
    pb.setName(name);
    pb.setOptions(options);
    pb.setQueryId(queryId);
    pb.setType(typeValue);

    return pb;
  }

  static CreateQueryVisualizationsLegacyRequest fromPb(
      CreateQueryVisualizationsLegacyRequestPb pb) {
    CreateQueryVisualizationsLegacyRequest model = new CreateQueryVisualizationsLegacyRequest();
    model.setDescription(pb.getDescription());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setQueryId(pb.getQueryId());
    model.setType(pb.getType());

    return model;
  }

  public static class CreateQueryVisualizationsLegacyRequestSerializer
      extends JsonSerializer<CreateQueryVisualizationsLegacyRequest> {
    @Override
    public void serialize(
        CreateQueryVisualizationsLegacyRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CreateQueryVisualizationsLegacyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateQueryVisualizationsLegacyRequestDeserializer
      extends JsonDeserializer<CreateQueryVisualizationsLegacyRequest> {
    @Override
    public CreateQueryVisualizationsLegacyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateQueryVisualizationsLegacyRequestPb pb =
          mapper.readValue(p, CreateQueryVisualizationsLegacyRequestPb.class);
      return CreateQueryVisualizationsLegacyRequest.fromPb(pb);
    }
  }
}
