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
@JsonSerialize(using = FinalizeLoggedModelResponse.FinalizeLoggedModelResponseSerializer.class)
@JsonDeserialize(using = FinalizeLoggedModelResponse.FinalizeLoggedModelResponseDeserializer.class)
public class FinalizeLoggedModelResponse {
  /** The updated logged model. */
  private LoggedModel model;

  public FinalizeLoggedModelResponse setModel(LoggedModel model) {
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
    FinalizeLoggedModelResponse that = (FinalizeLoggedModelResponse) o;
    return Objects.equals(model, that.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    return new ToStringer(FinalizeLoggedModelResponse.class).add("model", model).toString();
  }

  FinalizeLoggedModelResponsePb toPb() {
    FinalizeLoggedModelResponsePb pb = new FinalizeLoggedModelResponsePb();
    pb.setModel(model);

    return pb;
  }

  static FinalizeLoggedModelResponse fromPb(FinalizeLoggedModelResponsePb pb) {
    FinalizeLoggedModelResponse model = new FinalizeLoggedModelResponse();
    model.setModel(pb.getModel());

    return model;
  }

  public static class FinalizeLoggedModelResponseSerializer
      extends JsonSerializer<FinalizeLoggedModelResponse> {
    @Override
    public void serialize(
        FinalizeLoggedModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FinalizeLoggedModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FinalizeLoggedModelResponseDeserializer
      extends JsonDeserializer<FinalizeLoggedModelResponse> {
    @Override
    public FinalizeLoggedModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FinalizeLoggedModelResponsePb pb = mapper.readValue(p, FinalizeLoggedModelResponsePb.class);
      return FinalizeLoggedModelResponse.fromPb(pb);
    }
  }
}
