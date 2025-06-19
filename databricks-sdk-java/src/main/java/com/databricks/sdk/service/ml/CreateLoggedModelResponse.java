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
@JsonSerialize(using = CreateLoggedModelResponse.CreateLoggedModelResponseSerializer.class)
@JsonDeserialize(using = CreateLoggedModelResponse.CreateLoggedModelResponseDeserializer.class)
public class CreateLoggedModelResponse {
  /** The newly created logged model. */
  private LoggedModel model;

  public CreateLoggedModelResponse setModel(LoggedModel model) {
    this.model = model;
    return this;
  }

  public LoggedModel getModel() {
    return model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateLoggedModelResponse that = (CreateLoggedModelResponse) o;
    return Objects.equals(model, that.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateLoggedModelResponse.class).add("model", model).toString();
  }

  CreateLoggedModelResponsePb toPb() {
    CreateLoggedModelResponsePb pb = new CreateLoggedModelResponsePb();
    pb.setModel(model);

    return pb;
  }

  static CreateLoggedModelResponse fromPb(CreateLoggedModelResponsePb pb) {
    CreateLoggedModelResponse model = new CreateLoggedModelResponse();
    model.setModel(pb.getModel());

    return model;
  }

  public static class CreateLoggedModelResponseSerializer
      extends JsonSerializer<CreateLoggedModelResponse> {
    @Override
    public void serialize(
        CreateLoggedModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateLoggedModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateLoggedModelResponseDeserializer
      extends JsonDeserializer<CreateLoggedModelResponse> {
    @Override
    public CreateLoggedModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateLoggedModelResponsePb pb = mapper.readValue(p, CreateLoggedModelResponsePb.class);
      return CreateLoggedModelResponse.fromPb(pb);
    }
  }
}
