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
@JsonSerialize(using = CreateModelResponse.CreateModelResponseSerializer.class)
@JsonDeserialize(using = CreateModelResponse.CreateModelResponseDeserializer.class)
public class CreateModelResponse {
  /** */
  private Model registeredModel;

  public CreateModelResponse setRegisteredModel(Model registeredModel) {
    this.registeredModel = registeredModel;
    return this;
  }

  public Model getRegisteredModel() {
    return registeredModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelResponse that = (CreateModelResponse) o;
    return Objects.equals(registeredModel, that.registeredModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModel);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateModelResponse.class)
        .add("registeredModel", registeredModel)
        .toString();
  }

  CreateModelResponsePb toPb() {
    CreateModelResponsePb pb = new CreateModelResponsePb();
    pb.setRegisteredModel(registeredModel);

    return pb;
  }

  static CreateModelResponse fromPb(CreateModelResponsePb pb) {
    CreateModelResponse model = new CreateModelResponse();
    model.setRegisteredModel(pb.getRegisteredModel());

    return model;
  }

  public static class CreateModelResponseSerializer extends JsonSerializer<CreateModelResponse> {
    @Override
    public void serialize(CreateModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateModelResponseDeserializer
      extends JsonDeserializer<CreateModelResponse> {
    @Override
    public CreateModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateModelResponsePb pb = mapper.readValue(p, CreateModelResponsePb.class);
      return CreateModelResponse.fromPb(pb);
    }
  }
}
