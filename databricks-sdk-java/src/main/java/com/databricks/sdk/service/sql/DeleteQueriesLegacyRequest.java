// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Delete a query */
@Generated
@JsonSerialize(using = DeleteQueriesLegacyRequest.DeleteQueriesLegacyRequestSerializer.class)
@JsonDeserialize(using = DeleteQueriesLegacyRequest.DeleteQueriesLegacyRequestDeserializer.class)
public class DeleteQueriesLegacyRequest {
  /** */
  private String queryId;

  public DeleteQueriesLegacyRequest setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteQueriesLegacyRequest that = (DeleteQueriesLegacyRequest) o;
    return Objects.equals(queryId, that.queryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQueriesLegacyRequest.class).add("queryId", queryId).toString();
  }

  DeleteQueriesLegacyRequestPb toPb() {
    DeleteQueriesLegacyRequestPb pb = new DeleteQueriesLegacyRequestPb();
    pb.setQueryId(queryId);

    return pb;
  }

  static DeleteQueriesLegacyRequest fromPb(DeleteQueriesLegacyRequestPb pb) {
    DeleteQueriesLegacyRequest model = new DeleteQueriesLegacyRequest();
    model.setQueryId(pb.getQueryId());

    return model;
  }

  public static class DeleteQueriesLegacyRequestSerializer
      extends JsonSerializer<DeleteQueriesLegacyRequest> {
    @Override
    public void serialize(
        DeleteQueriesLegacyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteQueriesLegacyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteQueriesLegacyRequestDeserializer
      extends JsonDeserializer<DeleteQueriesLegacyRequest> {
    @Override
    public DeleteQueriesLegacyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteQueriesLegacyRequestPb pb = mapper.readValue(p, DeleteQueriesLegacyRequestPb.class);
      return DeleteQueriesLegacyRequest.fromPb(pb);
    }
  }
}
