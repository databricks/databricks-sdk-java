// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = PollQueryStatusResponseData.PollQueryStatusResponseDataSerializer.class)
@JsonDeserialize(using = PollQueryStatusResponseData.PollQueryStatusResponseDataDeserializer.class)
public class PollQueryStatusResponseData {
  /** */
  private QueryResponseStatus status;

  public PollQueryStatusResponseData setStatus(QueryResponseStatus status) {
    this.status = status;
    return this;
  }

  public QueryResponseStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PollQueryStatusResponseData that = (PollQueryStatusResponseData) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(PollQueryStatusResponseData.class).add("status", status).toString();
  }

  PollQueryStatusResponseDataPb toPb() {
    PollQueryStatusResponseDataPb pb = new PollQueryStatusResponseDataPb();
    pb.setStatus(status);

    return pb;
  }

  static PollQueryStatusResponseData fromPb(PollQueryStatusResponseDataPb pb) {
    PollQueryStatusResponseData model = new PollQueryStatusResponseData();
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class PollQueryStatusResponseDataSerializer
      extends JsonSerializer<PollQueryStatusResponseData> {
    @Override
    public void serialize(
        PollQueryStatusResponseData value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PollQueryStatusResponseDataPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PollQueryStatusResponseDataDeserializer
      extends JsonDeserializer<PollQueryStatusResponseData> {
    @Override
    public PollQueryStatusResponseData deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PollQueryStatusResponseDataPb pb = mapper.readValue(p, PollQueryStatusResponseDataPb.class);
      return PollQueryStatusResponseData.fromPb(pb);
    }
  }
}
