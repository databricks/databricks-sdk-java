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
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateModelVersionResponse.CreateModelVersionResponseSerializer.class)
@JsonDeserialize(using = CreateModelVersionResponse.CreateModelVersionResponseDeserializer.class)
public class CreateModelVersionResponse {
  /** Return new version number generated for this model in registry. */
  private ModelVersion modelVersion;

  public CreateModelVersionResponse setModelVersion(ModelVersion modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public ModelVersion getModelVersion() {
    return modelVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelVersionResponse that = (CreateModelVersionResponse) o;
    return Objects.equals(modelVersion, that.modelVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateModelVersionResponse.class)
        .add("modelVersion", modelVersion)
        .toString();
  }

  CreateModelVersionResponsePb toPb() {
    CreateModelVersionResponsePb pb = new CreateModelVersionResponsePb();
    pb.setModelVersion(modelVersion);

    return pb;
  }

  static CreateModelVersionResponse fromPb(CreateModelVersionResponsePb pb) {
    CreateModelVersionResponse model = new CreateModelVersionResponse();
    model.setModelVersion(pb.getModelVersion());

    return model;
  }

  public static class CreateModelVersionResponseSerializer
      extends JsonSerializer<CreateModelVersionResponse> {
    @Override
    public void serialize(
        CreateModelVersionResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateModelVersionResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateModelVersionResponseDeserializer
      extends JsonDeserializer<CreateModelVersionResponse> {
    @Override
    public CreateModelVersionResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateModelVersionResponsePb pb = mapper.readValue(p, CreateModelVersionResponsePb.class);
      return CreateModelVersionResponse.fromPb(pb);
    }
  }
}
