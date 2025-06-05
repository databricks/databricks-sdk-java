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
@JsonSerialize(using = CreateVisualizationRequest.CreateVisualizationRequestSerializer.class)
@JsonDeserialize(using = CreateVisualizationRequest.CreateVisualizationRequestDeserializer.class)
public class CreateVisualizationRequest {
  /** */
  private CreateVisualizationRequestVisualization visualization;

  public CreateVisualizationRequest setVisualization(
      CreateVisualizationRequestVisualization visualization) {
    this.visualization = visualization;
    return this;
  }

  public CreateVisualizationRequestVisualization getVisualization() {
    return visualization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVisualizationRequest that = (CreateVisualizationRequest) o;
    return Objects.equals(visualization, that.visualization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visualization);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVisualizationRequest.class)
        .add("visualization", visualization)
        .toString();
  }

  CreateVisualizationRequestPb toPb() {
    CreateVisualizationRequestPb pb = new CreateVisualizationRequestPb();
    pb.setVisualization(visualization);

    return pb;
  }

  static CreateVisualizationRequest fromPb(CreateVisualizationRequestPb pb) {
    CreateVisualizationRequest model = new CreateVisualizationRequest();
    model.setVisualization(pb.getVisualization());

    return model;
  }

  public static class CreateVisualizationRequestSerializer
      extends JsonSerializer<CreateVisualizationRequest> {
    @Override
    public void serialize(
        CreateVisualizationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateVisualizationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateVisualizationRequestDeserializer
      extends JsonDeserializer<CreateVisualizationRequest> {
    @Override
    public CreateVisualizationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateVisualizationRequestPb pb = mapper.readValue(p, CreateVisualizationRequestPb.class);
      return CreateVisualizationRequest.fromPb(pb);
    }
  }
}
