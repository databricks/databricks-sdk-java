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

@Generated
@JsonSerialize(using = StatementResponse.StatementResponseSerializer.class)
@JsonDeserialize(using = StatementResponse.StatementResponseDeserializer.class)
public class StatementResponse {
  /** The result manifest provides schema and metadata for the result set. */
  private ResultManifest manifest;

  /** */
  private ResultData result;

  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  private String statementId;

  /** The status response includes execution state and if relevant, error information. */
  private StatementStatus status;

  public StatementResponse setManifest(ResultManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  public ResultManifest getManifest() {
    return manifest;
  }

  public StatementResponse setResult(ResultData result) {
    this.result = result;
    return this;
  }

  public ResultData getResult() {
    return result;
  }

  public StatementResponse setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public StatementResponse setStatus(StatementStatus status) {
    this.status = status;
    return this;
  }

  public StatementStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StatementResponse that = (StatementResponse) o;
    return Objects.equals(manifest, that.manifest)
        && Objects.equals(result, that.result)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest, result, statementId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(StatementResponse.class)
        .add("manifest", manifest)
        .add("result", result)
        .add("statementId", statementId)
        .add("status", status)
        .toString();
  }

  StatementResponsePb toPb() {
    StatementResponsePb pb = new StatementResponsePb();
    pb.setManifest(manifest);
    pb.setResult(result);
    pb.setStatementId(statementId);
    pb.setStatus(status);

    return pb;
  }

  static StatementResponse fromPb(StatementResponsePb pb) {
    StatementResponse model = new StatementResponse();
    model.setManifest(pb.getManifest());
    model.setResult(pb.getResult());
    model.setStatementId(pb.getStatementId());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class StatementResponseSerializer extends JsonSerializer<StatementResponse> {
    @Override
    public void serialize(StatementResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StatementResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StatementResponseDeserializer extends JsonDeserializer<StatementResponse> {
    @Override
    public StatementResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StatementResponsePb pb = mapper.readValue(p, StatementResponsePb.class);
      return StatementResponse.fromPb(pb);
    }
  }
}
