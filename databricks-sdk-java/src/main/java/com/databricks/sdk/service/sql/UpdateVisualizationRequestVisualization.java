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
        UpdateVisualizationRequestVisualization.UpdateVisualizationRequestVisualizationSerializer
            .class)
@JsonDeserialize(
    using =
        UpdateVisualizationRequestVisualization.UpdateVisualizationRequestVisualizationDeserializer
            .class)
public class UpdateVisualizationRequestVisualization {
  /** The display name of the visualization. */
  private String displayName;

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

  public UpdateVisualizationRequestVisualization setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateVisualizationRequestVisualization setSerializedOptions(String serializedOptions) {
    this.serializedOptions = serializedOptions;
    return this;
  }

  public String getSerializedOptions() {
    return serializedOptions;
  }

  public UpdateVisualizationRequestVisualization setSerializedQueryPlan(
      String serializedQueryPlan) {
    this.serializedQueryPlan = serializedQueryPlan;
    return this;
  }

  public String getSerializedQueryPlan() {
    return serializedQueryPlan;
  }

  public UpdateVisualizationRequestVisualization setType(String typeValue) {
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
    UpdateVisualizationRequestVisualization that = (UpdateVisualizationRequestVisualization) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(serializedOptions, that.serializedOptions)
        && Objects.equals(serializedQueryPlan, that.serializedQueryPlan)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, serializedOptions, serializedQueryPlan, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateVisualizationRequestVisualization.class)
        .add("displayName", displayName)
        .add("serializedOptions", serializedOptions)
        .add("serializedQueryPlan", serializedQueryPlan)
        .add("typeValue", typeValue)
        .toString();
  }

  UpdateVisualizationRequestVisualizationPb toPb() {
    UpdateVisualizationRequestVisualizationPb pb = new UpdateVisualizationRequestVisualizationPb();
    pb.setDisplayName(displayName);
    pb.setSerializedOptions(serializedOptions);
    pb.setSerializedQueryPlan(serializedQueryPlan);
    pb.setType(typeValue);

    return pb;
  }

  static UpdateVisualizationRequestVisualization fromPb(
      UpdateVisualizationRequestVisualizationPb pb) {
    UpdateVisualizationRequestVisualization model = new UpdateVisualizationRequestVisualization();
    model.setDisplayName(pb.getDisplayName());
    model.setSerializedOptions(pb.getSerializedOptions());
    model.setSerializedQueryPlan(pb.getSerializedQueryPlan());
    model.setType(pb.getType());

    return model;
  }

  public static class UpdateVisualizationRequestVisualizationSerializer
      extends JsonSerializer<UpdateVisualizationRequestVisualization> {
    @Override
    public void serialize(
        UpdateVisualizationRequestVisualization value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      UpdateVisualizationRequestVisualizationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateVisualizationRequestVisualizationDeserializer
      extends JsonDeserializer<UpdateVisualizationRequestVisualization> {
    @Override
    public UpdateVisualizationRequestVisualization deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateVisualizationRequestVisualizationPb pb =
          mapper.readValue(p, UpdateVisualizationRequestVisualizationPb.class);
      return UpdateVisualizationRequestVisualization.fromPb(pb);
    }
  }
}
