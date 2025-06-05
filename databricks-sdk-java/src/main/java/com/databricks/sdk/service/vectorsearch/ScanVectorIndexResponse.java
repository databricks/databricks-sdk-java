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
import java.util.Collection;
import java.util.Objects;

/** Response to a scan vector index request. */
@Generated
@JsonSerialize(using = ScanVectorIndexResponse.ScanVectorIndexResponseSerializer.class)
@JsonDeserialize(using = ScanVectorIndexResponse.ScanVectorIndexResponseDeserializer.class)
public class ScanVectorIndexResponse {
  /** List of data entries */
  private Collection<Struct> data;

  /** Primary key of the last entry. */
  private String lastPrimaryKey;

  public ScanVectorIndexResponse setData(Collection<Struct> data) {
    this.data = data;
    return this;
  }

  public Collection<Struct> getData() {
    return data;
  }

  public ScanVectorIndexResponse setLastPrimaryKey(String lastPrimaryKey) {
    this.lastPrimaryKey = lastPrimaryKey;
    return this;
  }

  public String getLastPrimaryKey() {
    return lastPrimaryKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScanVectorIndexResponse that = (ScanVectorIndexResponse) o;
    return Objects.equals(data, that.data) && Objects.equals(lastPrimaryKey, that.lastPrimaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastPrimaryKey);
  }

  @Override
  public String toString() {
    return new ToStringer(ScanVectorIndexResponse.class)
        .add("data", data)
        .add("lastPrimaryKey", lastPrimaryKey)
        .toString();
  }

  ScanVectorIndexResponsePb toPb() {
    ScanVectorIndexResponsePb pb = new ScanVectorIndexResponsePb();
    pb.setData(data);
    pb.setLastPrimaryKey(lastPrimaryKey);

    return pb;
  }

  static ScanVectorIndexResponse fromPb(ScanVectorIndexResponsePb pb) {
    ScanVectorIndexResponse model = new ScanVectorIndexResponse();
    model.setData(pb.getData());
    model.setLastPrimaryKey(pb.getLastPrimaryKey());

    return model;
  }

  public static class ScanVectorIndexResponseSerializer
      extends JsonSerializer<ScanVectorIndexResponse> {
    @Override
    public void serialize(
        ScanVectorIndexResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ScanVectorIndexResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ScanVectorIndexResponseDeserializer
      extends JsonDeserializer<ScanVectorIndexResponse> {
    @Override
    public ScanVectorIndexResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ScanVectorIndexResponsePb pb = mapper.readValue(p, ScanVectorIndexResponsePb.class);
      return ScanVectorIndexResponse.fromPb(pb);
    }
  }
}
