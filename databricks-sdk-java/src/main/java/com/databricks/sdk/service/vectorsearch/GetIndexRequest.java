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

/** Get an index */
@Generated
@JsonSerialize(using = GetIndexRequest.GetIndexRequestSerializer.class)
@JsonDeserialize(using = GetIndexRequest.GetIndexRequestDeserializer.class)
public class GetIndexRequest {
  /** Name of the index */
  private String indexName;

  public GetIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetIndexRequest that = (GetIndexRequest) o;
    return Objects.equals(indexName, that.indexName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIndexRequest.class).add("indexName", indexName).toString();
  }

  GetIndexRequestPb toPb() {
    GetIndexRequestPb pb = new GetIndexRequestPb();
    pb.setIndexName(indexName);

    return pb;
  }

  static GetIndexRequest fromPb(GetIndexRequestPb pb) {
    GetIndexRequest model = new GetIndexRequest();
    model.setIndexName(pb.getIndexName());

    return model;
  }

  public static class GetIndexRequestSerializer extends JsonSerializer<GetIndexRequest> {
    @Override
    public void serialize(GetIndexRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetIndexRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetIndexRequestDeserializer extends JsonDeserializer<GetIndexRequest> {
    @Override
    public GetIndexRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetIndexRequestPb pb = mapper.readValue(p, GetIndexRequestPb.class);
      return GetIndexRequest.fromPb(pb);
    }
  }
}
