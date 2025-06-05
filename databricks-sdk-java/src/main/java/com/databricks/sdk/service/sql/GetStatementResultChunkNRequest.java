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

/** Get result chunk by index */
@Generated
@JsonSerialize(
    using = GetStatementResultChunkNRequest.GetStatementResultChunkNRequestSerializer.class)
@JsonDeserialize(
    using = GetStatementResultChunkNRequest.GetStatementResultChunkNRequestDeserializer.class)
public class GetStatementResultChunkNRequest {
  /** */
  private Long chunkIndex;

  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  private String statementId;

  public GetStatementResultChunkNRequest setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public GetStatementResultChunkNRequest setStatementId(String statementId) {
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
    GetStatementResultChunkNRequest that = (GetStatementResultChunkNRequest) o;
    return Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkIndex, statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatementResultChunkNRequest.class)
        .add("chunkIndex", chunkIndex)
        .add("statementId", statementId)
        .toString();
  }

  GetStatementResultChunkNRequestPb toPb() {
    GetStatementResultChunkNRequestPb pb = new GetStatementResultChunkNRequestPb();
    pb.setChunkIndex(chunkIndex);
    pb.setStatementId(statementId);

    return pb;
  }

  static GetStatementResultChunkNRequest fromPb(GetStatementResultChunkNRequestPb pb) {
    GetStatementResultChunkNRequest model = new GetStatementResultChunkNRequest();
    model.setChunkIndex(pb.getChunkIndex());
    model.setStatementId(pb.getStatementId());

    return model;
  }

  public static class GetStatementResultChunkNRequestSerializer
      extends JsonSerializer<GetStatementResultChunkNRequest> {
    @Override
    public void serialize(
        GetStatementResultChunkNRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetStatementResultChunkNRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetStatementResultChunkNRequestDeserializer
      extends JsonDeserializer<GetStatementResultChunkNRequest> {
    @Override
    public GetStatementResultChunkNRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetStatementResultChunkNRequestPb pb =
          mapper.readValue(p, GetStatementResultChunkNRequestPb.class);
      return GetStatementResultChunkNRequest.fromPb(pb);
    }
  }
}
