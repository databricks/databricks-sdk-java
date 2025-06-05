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

/** Get a logged model */
@Generated
@JsonSerialize(using = GetLoggedModelRequest.GetLoggedModelRequestSerializer.class)
@JsonDeserialize(using = GetLoggedModelRequest.GetLoggedModelRequestDeserializer.class)
public class GetLoggedModelRequest {
  /** The ID of the logged model to retrieve. */
  private String modelId;

  public GetLoggedModelRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLoggedModelRequest that = (GetLoggedModelRequest) o;
    return Objects.equals(modelId, that.modelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLoggedModelRequest.class).add("modelId", modelId).toString();
  }

  GetLoggedModelRequestPb toPb() {
    GetLoggedModelRequestPb pb = new GetLoggedModelRequestPb();
    pb.setModelId(modelId);

    return pb;
  }

  static GetLoggedModelRequest fromPb(GetLoggedModelRequestPb pb) {
    GetLoggedModelRequest model = new GetLoggedModelRequest();
    model.setModelId(pb.getModelId());

    return model;
  }

  public static class GetLoggedModelRequestSerializer
      extends JsonSerializer<GetLoggedModelRequest> {
    @Override
    public void serialize(
        GetLoggedModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetLoggedModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetLoggedModelRequestDeserializer
      extends JsonDeserializer<GetLoggedModelRequest> {
    @Override
    public GetLoggedModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetLoggedModelRequestPb pb = mapper.readValue(p, GetLoggedModelRequestPb.class);
      return GetLoggedModelRequest.fromPb(pb);
    }
  }
}
