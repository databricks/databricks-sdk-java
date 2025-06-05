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
@JsonSerialize(using = CancelQueryExecutionResponse.CancelQueryExecutionResponseSerializer.class)
@JsonDeserialize(
    using = CancelQueryExecutionResponse.CancelQueryExecutionResponseDeserializer.class)
public class CancelQueryExecutionResponse {
  /** */
  private Collection<CancelQueryExecutionResponseStatus> status;

  public CancelQueryExecutionResponse setStatus(
      Collection<CancelQueryExecutionResponseStatus> status) {
    this.status = status;
    return this;
  }

  public Collection<CancelQueryExecutionResponseStatus> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelQueryExecutionResponse that = (CancelQueryExecutionResponse) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelQueryExecutionResponse.class).add("status", status).toString();
  }

  CancelQueryExecutionResponsePb toPb() {
    CancelQueryExecutionResponsePb pb = new CancelQueryExecutionResponsePb();
    pb.setStatus(status);

    return pb;
  }

  static CancelQueryExecutionResponse fromPb(CancelQueryExecutionResponsePb pb) {
    CancelQueryExecutionResponse model = new CancelQueryExecutionResponse();
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class CancelQueryExecutionResponseSerializer
      extends JsonSerializer<CancelQueryExecutionResponse> {
    @Override
    public void serialize(
        CancelQueryExecutionResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelQueryExecutionResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelQueryExecutionResponseDeserializer
      extends JsonDeserializer<CancelQueryExecutionResponse> {
    @Override
    public CancelQueryExecutionResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelQueryExecutionResponsePb pb = mapper.readValue(p, CancelQueryExecutionResponsePb.class);
      return CancelQueryExecutionResponse.fromPb(pb);
    }
  }
}
