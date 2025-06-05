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

/** Cancel statement execution */
@Generated
@JsonSerialize(using = CancelExecutionRequest.CancelExecutionRequestSerializer.class)
@JsonDeserialize(using = CancelExecutionRequest.CancelExecutionRequestDeserializer.class)
public class CancelExecutionRequest {
  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  private String statementId;

  public CancelExecutionRequest setStatementId(String statementId) {
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
    CancelExecutionRequest that = (CancelExecutionRequest) o;
    return Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelExecutionRequest.class).add("statementId", statementId).toString();
  }

  CancelExecutionRequestPb toPb() {
    CancelExecutionRequestPb pb = new CancelExecutionRequestPb();
    pb.setStatementId(statementId);

    return pb;
  }

  static CancelExecutionRequest fromPb(CancelExecutionRequestPb pb) {
    CancelExecutionRequest model = new CancelExecutionRequest();
    model.setStatementId(pb.getStatementId());

    return model;
  }

  public static class CancelExecutionRequestSerializer
      extends JsonSerializer<CancelExecutionRequest> {
    @Override
    public void serialize(
        CancelExecutionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelExecutionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelExecutionRequestDeserializer
      extends JsonDeserializer<CancelExecutionRequest> {
    @Override
    public CancelExecutionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelExecutionRequestPb pb = mapper.readValue(p, CancelExecutionRequestPb.class);
      return CancelExecutionRequest.fromPb(pb);
    }
  }
}
