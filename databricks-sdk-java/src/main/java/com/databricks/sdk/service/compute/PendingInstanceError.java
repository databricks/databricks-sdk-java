// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** Error message of a failed pending instances */
@Generated
@JsonSerialize(using = PendingInstanceError.PendingInstanceErrorSerializer.class)
@JsonDeserialize(using = PendingInstanceError.PendingInstanceErrorDeserializer.class)
public class PendingInstanceError {
  /** */
  private String instanceId;

  /** */
  private String message;

  public PendingInstanceError setInstanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public PendingInstanceError setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PendingInstanceError that = (PendingInstanceError) o;
    return Objects.equals(instanceId, that.instanceId) && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, message);
  }

  @Override
  public String toString() {
    return new ToStringer(PendingInstanceError.class)
        .add("instanceId", instanceId)
        .add("message", message)
        .toString();
  }

  PendingInstanceErrorPb toPb() {
    PendingInstanceErrorPb pb = new PendingInstanceErrorPb();
    pb.setInstanceId(instanceId);
    pb.setMessage(message);

    return pb;
  }

  static PendingInstanceError fromPb(PendingInstanceErrorPb pb) {
    PendingInstanceError model = new PendingInstanceError();
    model.setInstanceId(pb.getInstanceId());
    model.setMessage(pb.getMessage());

    return model;
  }

  public static class PendingInstanceErrorSerializer extends JsonSerializer<PendingInstanceError> {
    @Override
    public void serialize(
        PendingInstanceError value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PendingInstanceErrorPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PendingInstanceErrorDeserializer
      extends JsonDeserializer<PendingInstanceError> {
    @Override
    public PendingInstanceError deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PendingInstanceErrorPb pb = mapper.readValue(p, PendingInstanceErrorPb.class);
      return PendingInstanceError.fromPb(pb);
    }
  }
}
