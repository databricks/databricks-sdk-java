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
@JsonSerialize(using = GetLoggedModelResponse.GetLoggedModelResponseSerializer.class)
@JsonDeserialize(using = GetLoggedModelResponse.GetLoggedModelResponseDeserializer.class)
public class GetLoggedModelResponse {
  /** The retrieved logged model. */
  private LoggedModel model;

  public GetLoggedModelResponse setModel(LoggedModel model) {
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
    GetLoggedModelResponse that = (GetLoggedModelResponse) o;
    return Objects.equals(model, that.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLoggedModelResponse.class).add("model", model).toString();
  }

  GetLoggedModelResponsePb toPb() {
    GetLoggedModelResponsePb pb = new GetLoggedModelResponsePb();
    pb.setModel(model);

    return pb;
  }

  static GetLoggedModelResponse fromPb(GetLoggedModelResponsePb pb) {
    GetLoggedModelResponse model = new GetLoggedModelResponse();
    model.setModel(pb.getModel());

    return model;
  }

  public static class GetLoggedModelResponseSerializer
      extends JsonSerializer<GetLoggedModelResponse> {
    @Override
    public void serialize(
        GetLoggedModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetLoggedModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetLoggedModelResponseDeserializer
      extends JsonDeserializer<GetLoggedModelResponse> {
    @Override
    public GetLoggedModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetLoggedModelResponsePb pb = mapper.readValue(p, GetLoggedModelResponsePb.class);
      return GetLoggedModelResponse.fromPb(pb);
    }
  }
}
