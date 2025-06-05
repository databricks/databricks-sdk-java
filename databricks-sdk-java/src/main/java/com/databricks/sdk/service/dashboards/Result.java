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
@JsonSerialize(using = Result.ResultSerializer.class)
@JsonDeserialize(using = Result.ResultDeserializer.class)
public class Result {
  /** If result is truncated */
  private Boolean isTruncated;

  /** Row count of the result */
  private Long rowCount;

  /**
   * Statement Execution API statement id. Use [Get status, manifest, and result first
   * chunk](:method:statementexecution/getstatement) to get the full result data.
   */
  private String statementId;

  public Result setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public Result setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public Result setStatementId(String statementId) {
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
    Result that = (Result) o;
    return Objects.equals(isTruncated, that.isTruncated)
        && Objects.equals(rowCount, that.rowCount)
        && Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTruncated, rowCount, statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(Result.class)
        .add("isTruncated", isTruncated)
        .add("rowCount", rowCount)
        .add("statementId", statementId)
        .toString();
  }

  ResultPb toPb() {
    ResultPb pb = new ResultPb();
    pb.setIsTruncated(isTruncated);
    pb.setRowCount(rowCount);
    pb.setStatementId(statementId);

    return pb;
  }

  static Result fromPb(ResultPb pb) {
    Result model = new Result();
    model.setIsTruncated(pb.getIsTruncated());
    model.setRowCount(pb.getRowCount());
    model.setStatementId(pb.getStatementId());

    return model;
  }

  public static class ResultSerializer extends JsonSerializer<Result> {
    @Override
    public void serialize(Result value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResultPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResultDeserializer extends JsonDeserializer<Result> {
    @Override
    public Result deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResultPb pb = mapper.readValue(p, ResultPb.class);
      return Result.fromPb(pb);
    }
  }
}
