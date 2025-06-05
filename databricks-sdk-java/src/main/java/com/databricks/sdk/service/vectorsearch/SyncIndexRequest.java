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

/** Synchronize an index */
@Generated
@JsonSerialize(using = SyncIndexRequest.SyncIndexRequestSerializer.class)
@JsonDeserialize(using = SyncIndexRequest.SyncIndexRequestDeserializer.class)
public class SyncIndexRequest {
  /** Name of the vector index to synchronize. Must be a Delta Sync Index. */
  private String indexName;

  public SyncIndexRequest setIndexName(String indexName) {
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
    SyncIndexRequest that = (SyncIndexRequest) o;
    return Objects.equals(indexName, that.indexName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncIndexRequest.class).add("indexName", indexName).toString();
  }

  SyncIndexRequestPb toPb() {
    SyncIndexRequestPb pb = new SyncIndexRequestPb();
    pb.setIndexName(indexName);

    return pb;
  }

  static SyncIndexRequest fromPb(SyncIndexRequestPb pb) {
    SyncIndexRequest model = new SyncIndexRequest();
    model.setIndexName(pb.getIndexName());

    return model;
  }

  public static class SyncIndexRequestSerializer extends JsonSerializer<SyncIndexRequest> {
    @Override
    public void serialize(SyncIndexRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SyncIndexRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SyncIndexRequestDeserializer extends JsonDeserializer<SyncIndexRequest> {
    @Override
    public SyncIndexRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SyncIndexRequestPb pb = mapper.readValue(p, SyncIndexRequestPb.class);
      return SyncIndexRequest.fromPb(pb);
    }
  }
}
