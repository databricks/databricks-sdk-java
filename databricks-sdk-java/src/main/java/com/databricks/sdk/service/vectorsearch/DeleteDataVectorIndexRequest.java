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

/** Delete data from index */
@Generated
@JsonSerialize(using = DeleteDataVectorIndexRequest.DeleteDataVectorIndexRequestSerializer.class)
@JsonDeserialize(
    using = DeleteDataVectorIndexRequest.DeleteDataVectorIndexRequestDeserializer.class)
public class DeleteDataVectorIndexRequest {
  /** Name of the vector index where data is to be deleted. Must be a Direct Vector Access Index. */
  private String indexName;

  /** List of primary keys for the data to be deleted. */
  private Collection<String> primaryKeys;

  public DeleteDataVectorIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public DeleteDataVectorIndexRequest setPrimaryKeys(Collection<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public Collection<String> getPrimaryKeys() {
    return primaryKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDataVectorIndexRequest that = (DeleteDataVectorIndexRequest) o;
    return Objects.equals(indexName, that.indexName)
        && Objects.equals(primaryKeys, that.primaryKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, primaryKeys);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataVectorIndexRequest.class)
        .add("indexName", indexName)
        .add("primaryKeys", primaryKeys)
        .toString();
  }

  DeleteDataVectorIndexRequestPb toPb() {
    DeleteDataVectorIndexRequestPb pb = new DeleteDataVectorIndexRequestPb();
    pb.setIndexName(indexName);
    pb.setPrimaryKeys(primaryKeys);

    return pb;
  }

  static DeleteDataVectorIndexRequest fromPb(DeleteDataVectorIndexRequestPb pb) {
    DeleteDataVectorIndexRequest model = new DeleteDataVectorIndexRequest();
    model.setIndexName(pb.getIndexName());
    model.setPrimaryKeys(pb.getPrimaryKeys());

    return model;
  }

  public static class DeleteDataVectorIndexRequestSerializer
      extends JsonSerializer<DeleteDataVectorIndexRequest> {
    @Override
    public void serialize(
        DeleteDataVectorIndexRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDataVectorIndexRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDataVectorIndexRequestDeserializer
      extends JsonDeserializer<DeleteDataVectorIndexRequest> {
    @Override
    public DeleteDataVectorIndexRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDataVectorIndexRequestPb pb = mapper.readValue(p, DeleteDataVectorIndexRequestPb.class);
      return DeleteDataVectorIndexRequest.fromPb(pb);
    }
  }
}
