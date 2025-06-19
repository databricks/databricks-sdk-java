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
@JsonSerialize(using = TransitionStageResponse.TransitionStageResponseSerializer.class)
@JsonDeserialize(using = TransitionStageResponse.TransitionStageResponseDeserializer.class)
public class TransitionStageResponse {
  /** */
  private ModelVersionDatabricks modelVersion;

  public TransitionStageResponse setModelVersion(ModelVersionDatabricks modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public ModelVersionDatabricks getModelVersion() {
    return modelVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransitionStageResponse that = (TransitionStageResponse) o;
    return Objects.equals(modelVersion, that.modelVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(TransitionStageResponse.class)
        .add("modelVersion", modelVersion)
        .toString();
  }

  TransitionStageResponsePb toPb() {
    TransitionStageResponsePb pb = new TransitionStageResponsePb();
    pb.setModelVersion(modelVersion);

    return pb;
  }

  static TransitionStageResponse fromPb(TransitionStageResponsePb pb) {
    TransitionStageResponse model = new TransitionStageResponse();
    model.setModelVersion(pb.getModelVersion());

    return model;
  }

  public static class TransitionStageResponseSerializer
      extends JsonSerializer<TransitionStageResponse> {
    @Override
    public void serialize(
        TransitionStageResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TransitionStageResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TransitionStageResponseDeserializer
      extends JsonDeserializer<TransitionStageResponse> {
    @Override
    public TransitionStageResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TransitionStageResponsePb pb = mapper.readValue(p, TransitionStageResponsePb.class);
      return TransitionStageResponse.fromPb(pb);
    }
  }
}
