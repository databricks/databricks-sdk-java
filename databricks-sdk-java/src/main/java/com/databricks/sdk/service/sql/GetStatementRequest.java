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

/** Get status, manifest, and result first chunk */
@Generated
@JsonSerialize(using = GetStatementRequest.GetStatementRequestSerializer.class)
@JsonDeserialize(using = GetStatementRequest.GetStatementRequestDeserializer.class)
public class GetStatementRequest {
  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  private String statementId;

  public GetStatementRequest setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStatementRequest that = (GetStatementRequest) o;
    return Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatementRequest.class).add("statementId", statementId).toString();
  }

  GetStatementRequestPb toPb() {
    GetStatementRequestPb pb = new GetStatementRequestPb();
    pb.setStatementId(statementId);

    return pb;
  }

  static GetStatementRequest fromPb(GetStatementRequestPb pb) {
    GetStatementRequest model = new GetStatementRequest();
    model.setStatementId(pb.getStatementId());

    return model;
  }

  public static class GetStatementRequestSerializer extends JsonSerializer<GetStatementRequest> {
    @Override
    public void serialize(GetStatementRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetStatementRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetStatementRequestDeserializer
      extends JsonDeserializer<GetStatementRequest> {
    @Override
    public GetStatementRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetStatementRequestPb pb = mapper.readValue(p, GetStatementRequestPb.class);
      return GetStatementRequest.fromPb(pb);
    }
  }
}
