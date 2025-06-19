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
    using =
        GenieGetDownloadFullQueryResultResponse.GenieGetDownloadFullQueryResultResponseSerializer
            .class)
@JsonDeserialize(
    using =
        GenieGetDownloadFullQueryResultResponse.GenieGetDownloadFullQueryResultResponseDeserializer
            .class)
public class GenieGetDownloadFullQueryResultResponse {
  /**
   * SQL Statement Execution response. See [Get status, manifest, and result first
   * chunk](:method:statementexecution/getstatement) for more details.
   */
  private com.databricks.sdk.service.sql.StatementResponse statementResponse;

  public GenieGetDownloadFullQueryResultResponse setStatementResponse(
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
    GenieGetDownloadFullQueryResultResponse that = (GenieGetDownloadFullQueryResultResponse) o;
    return Objects.equals(statementResponse, that.statementResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementResponse);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetDownloadFullQueryResultResponse.class)
        .add("statementResponse", statementResponse)
        .toString();
  }

  GenieGetDownloadFullQueryResultResponsePb toPb() {
    GenieGetDownloadFullQueryResultResponsePb pb = new GenieGetDownloadFullQueryResultResponsePb();
    pb.setStatementResponse(statementResponse);

    return pb;
  }

  static GenieGetDownloadFullQueryResultResponse fromPb(
      GenieGetDownloadFullQueryResultResponsePb pb) {
    GenieGetDownloadFullQueryResultResponse model = new GenieGetDownloadFullQueryResultResponse();
    model.setStatementResponse(pb.getStatementResponse());

    return model;
  }

  public static class GenieGetDownloadFullQueryResultResponseSerializer
      extends JsonSerializer<GenieGetDownloadFullQueryResultResponse> {
    @Override
    public void serialize(
        GenieGetDownloadFullQueryResultResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenieGetDownloadFullQueryResultResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieGetDownloadFullQueryResultResponseDeserializer
      extends JsonDeserializer<GenieGetDownloadFullQueryResultResponse> {
    @Override
    public GenieGetDownloadFullQueryResultResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieGetDownloadFullQueryResultResponsePb pb =
          mapper.readValue(p, GenieGetDownloadFullQueryResultResponsePb.class);
      return GenieGetDownloadFullQueryResultResponse.fromPb(pb);
    }
  }
}
