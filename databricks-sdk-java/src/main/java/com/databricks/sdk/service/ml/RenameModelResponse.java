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
@JsonSerialize(using = RenameModelResponse.RenameModelResponseSerializer.class)
@JsonDeserialize(using = RenameModelResponse.RenameModelResponseDeserializer.class)
public class RenameModelResponse {
  /** */
  private Model registeredModel;

  public RenameModelResponse setRegisteredModel(Model registeredModel) {
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
    RenameModelResponse that = (RenameModelResponse) o;
    return Objects.equals(registeredModel, that.registeredModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModel);
  }

  @Override
  public String toString() {
    return new ToStringer(RenameModelResponse.class)
        .add("registeredModel", registeredModel)
        .toString();
  }

  RenameModelResponsePb toPb() {
    RenameModelResponsePb pb = new RenameModelResponsePb();
    pb.setRegisteredModel(registeredModel);

    return pb;
  }

  static RenameModelResponse fromPb(RenameModelResponsePb pb) {
    RenameModelResponse model = new RenameModelResponse();
    model.setRegisteredModel(pb.getRegisteredModel());

    return model;
  }

  public static class RenameModelResponseSerializer extends JsonSerializer<RenameModelResponse> {
    @Override
    public void serialize(RenameModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RenameModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RenameModelResponseDeserializer
      extends JsonDeserializer<RenameModelResponse> {
    @Override
    public RenameModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RenameModelResponsePb pb = mapper.readValue(p, RenameModelResponsePb.class);
      return RenameModelResponse.fromPb(pb);
    }
  }
}
