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
@JsonSerialize(using = QueryResponseStatus.QueryResponseStatusSerializer.class)
@JsonDeserialize(using = QueryResponseStatus.QueryResponseStatusDeserializer.class)
public class QueryResponseStatus {
  /**
   * Represents an empty message, similar to google.protobuf.Empty, which is not available in the
   * firm right now.
   */
  private Empty canceled;

  /**
   * Represents an empty message, similar to google.protobuf.Empty, which is not available in the
   * firm right now.
   */
  private Empty closed;

  /** */
  private PendingStatus pending;

  /**
   * The statement id in format(01eef5da-c56e-1f36-bafa-21906587d6ba) The statement_id should be
   * identical to data_token in SuccessStatus and PendingStatus. This field is created for audit
   * logging purpose to record the statement_id of all QueryResponseStatus.
   */
  private String statementId;

  /** */
  private SuccessStatus success;

  public QueryResponseStatus setCanceled(Empty canceled) {
    this.canceled = canceled;
    return this;
  }

  public Empty getCanceled() {
    return canceled;
  }

  public QueryResponseStatus setClosed(Empty closed) {
    this.closed = closed;
    return this;
  }

  public Empty getClosed() {
    return closed;
  }

  public QueryResponseStatus setPending(PendingStatus pending) {
    this.pending = pending;
    return this;
  }

  public PendingStatus getPending() {
    return pending;
  }

  public QueryResponseStatus setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public QueryResponseStatus setSuccess(SuccessStatus success) {
    this.success = success;
    return this;
  }

  public SuccessStatus getSuccess() {
    return success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryResponseStatus that = (QueryResponseStatus) o;
    return Objects.equals(canceled, that.canceled)
        && Objects.equals(closed, that.closed)
        && Objects.equals(pending, that.pending)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(success, that.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceled, closed, pending, statementId, success);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryResponseStatus.class)
        .add("canceled", canceled)
        .add("closed", closed)
        .add("pending", pending)
        .add("statementId", statementId)
        .add("success", success)
        .toString();
  }

  QueryResponseStatusPb toPb() {
    QueryResponseStatusPb pb = new QueryResponseStatusPb();
    pb.setCanceled(canceled);
    pb.setClosed(closed);
    pb.setPending(pending);
    pb.setStatementId(statementId);
    pb.setSuccess(success);

    return pb;
  }

  static QueryResponseStatus fromPb(QueryResponseStatusPb pb) {
    QueryResponseStatus model = new QueryResponseStatus();
    model.setCanceled(pb.getCanceled());
    model.setClosed(pb.getClosed());
    model.setPending(pb.getPending());
    model.setStatementId(pb.getStatementId());
    model.setSuccess(pb.getSuccess());

    return model;
  }

  public static class QueryResponseStatusSerializer extends JsonSerializer<QueryResponseStatus> {
    @Override
    public void serialize(QueryResponseStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryResponseStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryResponseStatusDeserializer
      extends JsonDeserializer<QueryResponseStatus> {
    @Override
    public QueryResponseStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryResponseStatusPb pb = mapper.readValue(p, QueryResponseStatusPb.class);
      return QueryResponseStatus.fromPb(pb);
    }
  }
}
