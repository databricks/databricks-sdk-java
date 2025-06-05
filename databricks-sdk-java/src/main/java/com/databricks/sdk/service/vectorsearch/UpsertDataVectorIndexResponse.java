// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = UpsertDataVectorIndexResponse.UpsertDataVectorIndexResponseSerializer.class)
@JsonDeserialize(
    using = UpsertDataVectorIndexResponse.UpsertDataVectorIndexResponseDeserializer.class)
public class UpsertDataVectorIndexResponse {
  /** Result of the upsert or delete operation. */
  private UpsertDataResult result;

  /** Status of the upsert operation. */
  private UpsertDataStatus status;

  public UpsertDataVectorIndexResponse setResult(UpsertDataResult result) {
    this.result = result;
    return this;
  }

  public UpsertDataResult getResult() {
    return result;
  }

  public UpsertDataVectorIndexResponse setStatus(UpsertDataStatus status) {
    this.status = status;
    return this;
  }

  public UpsertDataStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpsertDataVectorIndexResponse that = (UpsertDataVectorIndexResponse) o;
    return Objects.equals(result, that.result) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataVectorIndexResponse.class)
        .add("result", result)
        .add("status", status)
        .toString();
  }

  UpsertDataVectorIndexResponsePb toPb() {
    UpsertDataVectorIndexResponsePb pb = new UpsertDataVectorIndexResponsePb();
    pb.setResult(result);
    pb.setStatus(status);

    return pb;
  }

  static UpsertDataVectorIndexResponse fromPb(UpsertDataVectorIndexResponsePb pb) {
    UpsertDataVectorIndexResponse model = new UpsertDataVectorIndexResponse();
    model.setResult(pb.getResult());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class UpsertDataVectorIndexResponseSerializer
      extends JsonSerializer<UpsertDataVectorIndexResponse> {
    @Override
    public void serialize(
        UpsertDataVectorIndexResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpsertDataVectorIndexResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpsertDataVectorIndexResponseDeserializer
      extends JsonDeserializer<UpsertDataVectorIndexResponse> {
    @Override
    public UpsertDataVectorIndexResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpsertDataVectorIndexResponsePb pb =
          mapper.readValue(p, UpsertDataVectorIndexResponsePb.class);
      return UpsertDataVectorIndexResponse.fromPb(pb);
    }
  }
}
