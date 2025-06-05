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

/** Get a query definition. */
@Generated
@JsonSerialize(using = GetQueriesLegacyRequest.GetQueriesLegacyRequestSerializer.class)
@JsonDeserialize(using = GetQueriesLegacyRequest.GetQueriesLegacyRequestDeserializer.class)
public class GetQueriesLegacyRequest {
  /** */
  private String queryId;

  public GetQueriesLegacyRequest setQueryId(String queryId) {
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
    GetQueriesLegacyRequest that = (GetQueriesLegacyRequest) o;
    return Objects.equals(queryId, that.queryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQueriesLegacyRequest.class).add("queryId", queryId).toString();
  }

  GetQueriesLegacyRequestPb toPb() {
    GetQueriesLegacyRequestPb pb = new GetQueriesLegacyRequestPb();
    pb.setQueryId(queryId);

    return pb;
  }

  static GetQueriesLegacyRequest fromPb(GetQueriesLegacyRequestPb pb) {
    GetQueriesLegacyRequest model = new GetQueriesLegacyRequest();
    model.setQueryId(pb.getQueryId());

    return model;
  }

  public static class GetQueriesLegacyRequestSerializer
      extends JsonSerializer<GetQueriesLegacyRequest> {
    @Override
    public void serialize(
        GetQueriesLegacyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetQueriesLegacyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetQueriesLegacyRequestDeserializer
      extends JsonDeserializer<GetQueriesLegacyRequest> {
    @Override
    public GetQueriesLegacyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetQueriesLegacyRequestPb pb = mapper.readValue(p, GetQueriesLegacyRequestPb.class);
      return GetQueriesLegacyRequest.fromPb(pb);
    }
  }
}
