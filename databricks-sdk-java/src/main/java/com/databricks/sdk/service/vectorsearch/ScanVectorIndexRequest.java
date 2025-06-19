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
@JsonSerialize(using = ScanVectorIndexRequest.ScanVectorIndexRequestSerializer.class)
@JsonDeserialize(using = ScanVectorIndexRequest.ScanVectorIndexRequestDeserializer.class)
public class ScanVectorIndexRequest {
  /** Name of the vector index to scan. */
  private String indexName;

  /** Primary key of the last entry returned in the previous scan. */
  private String lastPrimaryKey;

  /** Number of results to return. Defaults to 10. */
  private Long numResults;

  public ScanVectorIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public ScanVectorIndexRequest setLastPrimaryKey(String lastPrimaryKey) {
    this.lastPrimaryKey = lastPrimaryKey;
    return this;
  }

  public String getLastPrimaryKey() {
    return lastPrimaryKey;
  }

  public ScanVectorIndexRequest setNumResults(Long numResults) {
    this.numResults = numResults;
    return this;
  }

  public Long getNumResults() {
    return numResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScanVectorIndexRequest that = (ScanVectorIndexRequest) o;
    return Objects.equals(indexName, that.indexName)
        && Objects.equals(lastPrimaryKey, that.lastPrimaryKey)
        && Objects.equals(numResults, that.numResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, lastPrimaryKey, numResults);
  }

  @Override
  public String toString() {
    return new ToStringer(ScanVectorIndexRequest.class)
        .add("indexName", indexName)
        .add("lastPrimaryKey", lastPrimaryKey)
        .add("numResults", numResults)
        .toString();
  }

  ScanVectorIndexRequestPb toPb() {
    ScanVectorIndexRequestPb pb = new ScanVectorIndexRequestPb();
    pb.setIndexName(indexName);
    pb.setLastPrimaryKey(lastPrimaryKey);
    pb.setNumResults(numResults);

    return pb;
  }

  static ScanVectorIndexRequest fromPb(ScanVectorIndexRequestPb pb) {
    ScanVectorIndexRequest model = new ScanVectorIndexRequest();
    model.setIndexName(pb.getIndexName());
    model.setLastPrimaryKey(pb.getLastPrimaryKey());
    model.setNumResults(pb.getNumResults());

    return model;
  }

  public static class ScanVectorIndexRequestSerializer
      extends JsonSerializer<ScanVectorIndexRequest> {
    @Override
    public void serialize(
        ScanVectorIndexRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ScanVectorIndexRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ScanVectorIndexRequestDeserializer
      extends JsonDeserializer<ScanVectorIndexRequest> {
    @Override
    public ScanVectorIndexRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ScanVectorIndexRequestPb pb = mapper.readValue(p, ScanVectorIndexRequestPb.class);
      return ScanVectorIndexRequest.fromPb(pb);
    }
  }
}
