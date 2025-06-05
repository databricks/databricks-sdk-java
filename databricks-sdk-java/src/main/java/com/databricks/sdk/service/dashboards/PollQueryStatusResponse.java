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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PollQueryStatusResponse.PollQueryStatusResponseSerializer.class)
@JsonDeserialize(using = PollQueryStatusResponse.PollQueryStatusResponseDeserializer.class)
public class PollQueryStatusResponse {
  /** */
  private Collection<PollQueryStatusResponseData> data;

  public PollQueryStatusResponse setData(Collection<PollQueryStatusResponseData> data) {
    this.data = data;
    return this;
  }

  public Collection<PollQueryStatusResponseData> getData() {
    return data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PollQueryStatusResponse that = (PollQueryStatusResponse) o;
    return Objects.equals(data, that.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    return new ToStringer(PollQueryStatusResponse.class).add("data", data).toString();
  }

  PollQueryStatusResponsePb toPb() {
    PollQueryStatusResponsePb pb = new PollQueryStatusResponsePb();
    pb.setData(data);

    return pb;
  }

  static PollQueryStatusResponse fromPb(PollQueryStatusResponsePb pb) {
    PollQueryStatusResponse model = new PollQueryStatusResponse();
    model.setData(pb.getData());

    return model;
  }

  public static class PollQueryStatusResponseSerializer
      extends JsonSerializer<PollQueryStatusResponse> {
    @Override
    public void serialize(
        PollQueryStatusResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PollQueryStatusResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PollQueryStatusResponseDeserializer
      extends JsonDeserializer<PollQueryStatusResponse> {
    @Override
    public PollQueryStatusResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PollQueryStatusResponsePb pb = mapper.readValue(p, PollQueryStatusResponsePb.class);
      return PollQueryStatusResponse.fromPb(pb);
    }
  }
}
