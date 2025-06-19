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

/** Delete an index */
@Generated
@JsonSerialize(using = DeleteIndexRequest.DeleteIndexRequestSerializer.class)
@JsonDeserialize(using = DeleteIndexRequest.DeleteIndexRequestDeserializer.class)
public class DeleteIndexRequest {
  /** Name of the index */
  private String indexName;

  public DeleteIndexRequest setIndexName(String indexName) {
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
    DeleteIndexRequest that = (DeleteIndexRequest) o;
    return Objects.equals(indexName, that.indexName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteIndexRequest.class).add("indexName", indexName).toString();
  }

  DeleteIndexRequestPb toPb() {
    DeleteIndexRequestPb pb = new DeleteIndexRequestPb();
    pb.setIndexName(indexName);

    return pb;
  }

  static DeleteIndexRequest fromPb(DeleteIndexRequestPb pb) {
    DeleteIndexRequest model = new DeleteIndexRequest();
    model.setIndexName(pb.getIndexName());

    return model;
  }

  public static class DeleteIndexRequestSerializer extends JsonSerializer<DeleteIndexRequest> {
    @Override
    public void serialize(DeleteIndexRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteIndexRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteIndexRequestDeserializer extends JsonDeserializer<DeleteIndexRequest> {
    @Override
    public DeleteIndexRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteIndexRequestPb pb = mapper.readValue(p, DeleteIndexRequestPb.class);
      return DeleteIndexRequest.fromPb(pb);
    }
  }
}
