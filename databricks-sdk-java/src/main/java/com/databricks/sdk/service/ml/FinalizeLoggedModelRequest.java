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
@JsonSerialize(using = FinalizeLoggedModelRequest.FinalizeLoggedModelRequestSerializer.class)
@JsonDeserialize(using = FinalizeLoggedModelRequest.FinalizeLoggedModelRequestDeserializer.class)
public class FinalizeLoggedModelRequest {
  /** The ID of the logged model to finalize. */
  private String modelId;

  /**
   * Whether or not the model is ready for use. ``"LOGGED_MODEL_UPLOAD_FAILED"`` indicates that
   * something went wrong when logging the model weights / agent code.
   */
  private LoggedModelStatus status;

  public FinalizeLoggedModelRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public FinalizeLoggedModelRequest setStatus(LoggedModelStatus status) {
    this.status = status;
    return this;
  }

  public LoggedModelStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FinalizeLoggedModelRequest that = (FinalizeLoggedModelRequest) o;
    return Objects.equals(modelId, that.modelId) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(FinalizeLoggedModelRequest.class)
        .add("modelId", modelId)
        .add("status", status)
        .toString();
  }

  FinalizeLoggedModelRequestPb toPb() {
    FinalizeLoggedModelRequestPb pb = new FinalizeLoggedModelRequestPb();
    pb.setModelId(modelId);
    pb.setStatus(status);

    return pb;
  }

  static FinalizeLoggedModelRequest fromPb(FinalizeLoggedModelRequestPb pb) {
    FinalizeLoggedModelRequest model = new FinalizeLoggedModelRequest();
    model.setModelId(pb.getModelId());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class FinalizeLoggedModelRequestSerializer
      extends JsonSerializer<FinalizeLoggedModelRequest> {
    @Override
    public void serialize(
        FinalizeLoggedModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FinalizeLoggedModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FinalizeLoggedModelRequestDeserializer
      extends JsonDeserializer<FinalizeLoggedModelRequest> {
    @Override
    public FinalizeLoggedModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FinalizeLoggedModelRequestPb pb = mapper.readValue(p, FinalizeLoggedModelRequestPb.class);
      return FinalizeLoggedModelRequest.fromPb(pb);
    }
  }
}
