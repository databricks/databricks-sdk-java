// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(
    using = GenieGetMessageQueryResultResponse.GenieGetMessageQueryResultResponseSerializer.class)
@JsonDeserialize(
    using = GenieGetMessageQueryResultResponse.GenieGetMessageQueryResultResponseDeserializer.class)
public class GenieGetMessageQueryResultResponse {
  /**
   * SQL Statement Execution response. See [Get status, manifest, and result first
   * chunk](:method:statementexecution/getstatement) for more details.
   */
  private com.databricks.sdk.service.sql.StatementResponse statementResponse;

  public GenieGetMessageQueryResultResponse setStatementResponse(
      com.databricks.sdk.service.sql.StatementResponse statementResponse) {
    this.statementResponse = statementResponse;
    return this;
  }

  public com.databricks.sdk.service.sql.StatementResponse getStatementResponse() {
    return statementResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieGetMessageQueryResultResponse that = (GenieGetMessageQueryResultResponse) o;
    return Objects.equals(statementResponse, that.statementResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementResponse);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetMessageQueryResultResponse.class)
        .add("statementResponse", statementResponse)
        .toString();
  }

  GenieGetMessageQueryResultResponsePb toPb() {
    GenieGetMessageQueryResultResponsePb pb = new GenieGetMessageQueryResultResponsePb();
    pb.setStatementResponse(statementResponse);

    return pb;
  }

  static GenieGetMessageQueryResultResponse fromPb(GenieGetMessageQueryResultResponsePb pb) {
    GenieGetMessageQueryResultResponse model = new GenieGetMessageQueryResultResponse();
    model.setStatementResponse(pb.getStatementResponse());

    return model;
  }

  public static class GenieGetMessageQueryResultResponseSerializer
      extends JsonSerializer<GenieGetMessageQueryResultResponse> {
    @Override
    public void serialize(
        GenieGetMessageQueryResultResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieGetMessageQueryResultResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieGetMessageQueryResultResponseDeserializer
      extends JsonDeserializer<GenieGetMessageQueryResultResponse> {
    @Override
    public GenieGetMessageQueryResultResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieGetMessageQueryResultResponsePb pb =
          mapper.readValue(p, GenieGetMessageQueryResultResponsePb.class);
      return GenieGetMessageQueryResultResponse.fromPb(pb);
    }
  }
}
