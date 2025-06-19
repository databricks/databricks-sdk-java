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
@JsonSerialize(using = UpsertDataVectorIndexRequest.UpsertDataVectorIndexRequestSerializer.class)
@JsonDeserialize(
    using = UpsertDataVectorIndexRequest.UpsertDataVectorIndexRequestDeserializer.class)
public class UpsertDataVectorIndexRequest {
  /**
   * Name of the vector index where data is to be upserted. Must be a Direct Vector Access Index.
   */
  private String indexName;

  /** JSON string representing the data to be upserted. */
  private String inputsJson;

  public UpsertDataVectorIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public UpsertDataVectorIndexRequest setInputsJson(String inputsJson) {
    this.inputsJson = inputsJson;
    return this;
  }

  public String getInputsJson() {
    return inputsJson;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpsertDataVectorIndexRequest that = (UpsertDataVectorIndexRequest) o;
    return Objects.equals(indexName, that.indexName) && Objects.equals(inputsJson, that.inputsJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, inputsJson);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataVectorIndexRequest.class)
        .add("indexName", indexName)
        .add("inputsJson", inputsJson)
        .toString();
  }

  UpsertDataVectorIndexRequestPb toPb() {
    UpsertDataVectorIndexRequestPb pb = new UpsertDataVectorIndexRequestPb();
    pb.setIndexName(indexName);
    pb.setInputsJson(inputsJson);

    return pb;
  }

  static UpsertDataVectorIndexRequest fromPb(UpsertDataVectorIndexRequestPb pb) {
    UpsertDataVectorIndexRequest model = new UpsertDataVectorIndexRequest();
    model.setIndexName(pb.getIndexName());
    model.setInputsJson(pb.getInputsJson());

    return model;
  }

  public static class UpsertDataVectorIndexRequestSerializer
      extends JsonSerializer<UpsertDataVectorIndexRequest> {
    @Override
    public void serialize(
        UpsertDataVectorIndexRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpsertDataVectorIndexRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpsertDataVectorIndexRequestDeserializer
      extends JsonDeserializer<UpsertDataVectorIndexRequest> {
    @Override
    public UpsertDataVectorIndexRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpsertDataVectorIndexRequestPb pb = mapper.readValue(p, UpsertDataVectorIndexRequestPb.class);
      return UpsertDataVectorIndexRequest.fromPb(pb);
    }
  }
}
