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
@JsonSerialize(using = GetModelResponse.GetModelResponseSerializer.class)
@JsonDeserialize(using = GetModelResponse.GetModelResponseDeserializer.class)
public class GetModelResponse {
  /** */
  private ModelDatabricks registeredModelDatabricks;

  public GetModelResponse setRegisteredModelDatabricks(ModelDatabricks registeredModelDatabricks) {
    this.registeredModelDatabricks = registeredModelDatabricks;
    return this;
  }

  public ModelDatabricks getRegisteredModelDatabricks() {
    return registeredModelDatabricks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelResponse that = (GetModelResponse) o;
    return Objects.equals(registeredModelDatabricks, that.registeredModelDatabricks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModelDatabricks);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelResponse.class)
        .add("registeredModelDatabricks", registeredModelDatabricks)
        .toString();
  }

  GetModelResponsePb toPb() {
    GetModelResponsePb pb = new GetModelResponsePb();
    pb.setRegisteredModelDatabricks(registeredModelDatabricks);

    return pb;
  }

  static GetModelResponse fromPb(GetModelResponsePb pb) {
    GetModelResponse model = new GetModelResponse();
    model.setRegisteredModelDatabricks(pb.getRegisteredModelDatabricks());

    return model;
  }

  public static class GetModelResponseSerializer extends JsonSerializer<GetModelResponse> {
    @Override
    public void serialize(GetModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetModelResponseDeserializer extends JsonDeserializer<GetModelResponse> {
    @Override
    public GetModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetModelResponsePb pb = mapper.readValue(p, GetModelResponsePb.class);
      return GetModelResponse.fromPb(pb);
    }
  }
}
