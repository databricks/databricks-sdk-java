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

/** Restore a query */
@Generated
@JsonSerialize(using = RestoreQueriesLegacyRequest.RestoreQueriesLegacyRequestSerializer.class)
@JsonDeserialize(using = RestoreQueriesLegacyRequest.RestoreQueriesLegacyRequestDeserializer.class)
public class RestoreQueriesLegacyRequest {
  /** */
  private String queryId;

  public RestoreQueriesLegacyRequest setQueryId(String queryId) {
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
    RestoreQueriesLegacyRequest that = (RestoreQueriesLegacyRequest) o;
    return Objects.equals(queryId, that.queryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  @Override
  public String toString() {
    return new ToStringer(RestoreQueriesLegacyRequest.class).add("queryId", queryId).toString();
  }

  RestoreQueriesLegacyRequestPb toPb() {
    RestoreQueriesLegacyRequestPb pb = new RestoreQueriesLegacyRequestPb();
    pb.setQueryId(queryId);

    return pb;
  }

  static RestoreQueriesLegacyRequest fromPb(RestoreQueriesLegacyRequestPb pb) {
    RestoreQueriesLegacyRequest model = new RestoreQueriesLegacyRequest();
    model.setQueryId(pb.getQueryId());

    return model;
  }

  public static class RestoreQueriesLegacyRequestSerializer
      extends JsonSerializer<RestoreQueriesLegacyRequest> {
    @Override
    public void serialize(
        RestoreQueriesLegacyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestoreQueriesLegacyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestoreQueriesLegacyRequestDeserializer
      extends JsonDeserializer<RestoreQueriesLegacyRequest> {
    @Override
    public RestoreQueriesLegacyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestoreQueriesLegacyRequestPb pb = mapper.readValue(p, RestoreQueriesLegacyRequestPb.class);
      return RestoreQueriesLegacyRequest.fromPb(pb);
    }
  }
}
