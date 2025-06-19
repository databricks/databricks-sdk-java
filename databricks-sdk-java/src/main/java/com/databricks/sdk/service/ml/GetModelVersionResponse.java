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
@JsonSerialize(using = GetModelVersionResponse.GetModelVersionResponseSerializer.class)
@JsonDeserialize(using = GetModelVersionResponse.GetModelVersionResponseDeserializer.class)
public class GetModelVersionResponse {
  /** */
  private ModelVersion modelVersion;

  public GetModelVersionResponse setModelVersion(ModelVersion modelVersion) {
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
    GetModelVersionResponse that = (GetModelVersionResponse) o;
    return Objects.equals(modelVersion, that.modelVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionResponse.class)
        .add("modelVersion", modelVersion)
        .toString();
  }

  GetModelVersionResponsePb toPb() {
    GetModelVersionResponsePb pb = new GetModelVersionResponsePb();
    pb.setModelVersion(modelVersion);

    return pb;
  }

  static GetModelVersionResponse fromPb(GetModelVersionResponsePb pb) {
    GetModelVersionResponse model = new GetModelVersionResponse();
    model.setModelVersion(pb.getModelVersion());

    return model;
  }

  public static class GetModelVersionResponseSerializer
      extends JsonSerializer<GetModelVersionResponse> {
    @Override
    public void serialize(
        GetModelVersionResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetModelVersionResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetModelVersionResponseDeserializer
      extends JsonDeserializer<GetModelVersionResponse> {
    @Override
    public GetModelVersionResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetModelVersionResponsePb pb = mapper.readValue(p, GetModelVersionResponsePb.class);
      return GetModelVersionResponse.fromPb(pb);
    }
  }
}
