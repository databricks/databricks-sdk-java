// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = StartUpdateResponse.StartUpdateResponseSerializer.class)
@JsonDeserialize(using = StartUpdateResponse.StartUpdateResponseDeserializer.class)
public class StartUpdateResponse {
  /** */
  private String updateId;

  public StartUpdateResponse setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StartUpdateResponse that = (StartUpdateResponse) o;
    return Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(StartUpdateResponse.class).add("updateId", updateId).toString();
  }

  StartUpdateResponsePb toPb() {
    StartUpdateResponsePb pb = new StartUpdateResponsePb();
    pb.setUpdateId(updateId);

    return pb;
  }

  static StartUpdateResponse fromPb(StartUpdateResponsePb pb) {
    StartUpdateResponse model = new StartUpdateResponse();
    model.setUpdateId(pb.getUpdateId());

    return model;
  }

  public static class StartUpdateResponseSerializer extends JsonSerializer<StartUpdateResponse> {
    @Override
    public void serialize(StartUpdateResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StartUpdateResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StartUpdateResponseDeserializer
      extends JsonDeserializer<StartUpdateResponse> {
    @Override
    public StartUpdateResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StartUpdateResponsePb pb = mapper.readValue(p, StartUpdateResponsePb.class);
      return StartUpdateResponse.fromPb(pb);
    }
  }
}
