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

@Generated
@JsonSerialize(
    using =
        CreateVisualizationRequestVisualization.CreateVisualizationRequestVisualizationSerializer
            .class)
@JsonDeserialize(
    using =
        CreateVisualizationRequestVisualization.CreateVisualizationRequestVisualizationDeserializer
            .class)
public class CreateVisualizationRequestVisualization {
  /** The display name of the visualization. */
  private String displayName;

  /** UUID of the query that the visualization is attached to. */
  private String queryId;

  /**
   * The visualization options varies widely from one visualization type to the next and is
   * unsupported. Databricks does not recommend modifying visualization options directly.
   */
  private String serializedOptions;

  /**
   * The visualization query plan varies widely from one visualization type to the next and is
   * unsupported. Databricks does not recommend modifying the visualization query plan directly.
   */
  private String serializedQueryPlan;

  /** The type of visualization: counter, table, funnel, and so on. */
  private String typeValue;

  public CreateVisualizationRequestVisualization setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateVisualizationRequestVisualization setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateVisualizationRequestVisualization setSerializedOptions(String serializedOptions) {
    this.serializedOptions = serializedOptions;
    return this;
  }

  public String getSerializedOptions() {
    return serializedOptions;
  }

  public CreateVisualizationRequestVisualization setSerializedQueryPlan(
      String serializedQueryPlan) {
    this.serializedQueryPlan = serializedQueryPlan;
    return this;
  }

  public String getSerializedQueryPlan() {
    return serializedQueryPlan;
  }

  public CreateVisualizationRequestVisualization setType(String typeValue) {
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
    CreateVisualizationRequestVisualization that = (CreateVisualizationRequestVisualization) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(serializedOptions, that.serializedOptions)
        && Objects.equals(serializedQueryPlan, that.serializedQueryPlan)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, queryId, serializedOptions, serializedQueryPlan, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVisualizationRequestVisualization.class)
        .add("displayName", displayName)
        .add("queryId", queryId)
        .add("serializedOptions", serializedOptions)
        .add("serializedQueryPlan", serializedQueryPlan)
        .add("typeValue", typeValue)
        .toString();
  }

  CreateVisualizationRequestVisualizationPb toPb() {
    CreateVisualizationRequestVisualizationPb pb = new CreateVisualizationRequestVisualizationPb();
    pb.setDisplayName(displayName);
    pb.setQueryId(queryId);
    pb.setSerializedOptions(serializedOptions);
    pb.setSerializedQueryPlan(serializedQueryPlan);
    pb.setType(typeValue);

    return pb;
  }

  static CreateVisualizationRequestVisualization fromPb(
      CreateVisualizationRequestVisualizationPb pb) {
    CreateVisualizationRequestVisualization model = new CreateVisualizationRequestVisualization();
    model.setDisplayName(pb.getDisplayName());
    model.setQueryId(pb.getQueryId());
    model.setSerializedOptions(pb.getSerializedOptions());
    model.setSerializedQueryPlan(pb.getSerializedQueryPlan());
    model.setType(pb.getType());

    return model;
  }

  public static class CreateVisualizationRequestVisualizationSerializer
      extends JsonSerializer<CreateVisualizationRequestVisualization> {
    @Override
    public void serialize(
        CreateVisualizationRequestVisualization value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CreateVisualizationRequestVisualizationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateVisualizationRequestVisualizationDeserializer
      extends JsonDeserializer<CreateVisualizationRequestVisualization> {
    @Override
    public CreateVisualizationRequestVisualization deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateVisualizationRequestVisualizationPb pb =
          mapper.readValue(p, CreateVisualizationRequestVisualizationPb.class);
      return CreateVisualizationRequestVisualization.fromPb(pb);
    }
  }
}
