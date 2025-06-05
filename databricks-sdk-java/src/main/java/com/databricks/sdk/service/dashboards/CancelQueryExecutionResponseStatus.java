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
    using = CancelQueryExecutionResponseStatus.CancelQueryExecutionResponseStatusSerializer.class)
@JsonDeserialize(
    using = CancelQueryExecutionResponseStatus.CancelQueryExecutionResponseStatusDeserializer.class)
public class CancelQueryExecutionResponseStatus {
  /**
   * The token to poll for result asynchronously Example:
   * EC0A..ChAB7WCEn_4Qo4vkLqEbXsxxEgh3Y2pbWw45WhoQXgZSQo9aS5q2ZvFcbvbx9CgA-PAEAQ
   */
  private String dataToken;

  /**
   * Represents an empty message, similar to google.protobuf.Empty, which is not available in the
   * firm right now.
   */
  private Empty pending;

  /**
   * Represents an empty message, similar to google.protobuf.Empty, which is not available in the
   * firm right now.
   */
  private Empty success;

  public CancelQueryExecutionResponseStatus setDataToken(String dataToken) {
    this.dataToken = dataToken;
    return this;
  }

  public String getDataToken() {
    return dataToken;
  }

  public CancelQueryExecutionResponseStatus setPending(Empty pending) {
    this.pending = pending;
    return this;
  }

  public Empty getPending() {
    return pending;
  }

  public CancelQueryExecutionResponseStatus setSuccess(Empty success) {
    this.success = success;
    return this;
  }

  public Empty getSuccess() {
    return success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelQueryExecutionResponseStatus that = (CancelQueryExecutionResponseStatus) o;
    return Objects.equals(dataToken, that.dataToken)
        && Objects.equals(pending, that.pending)
        && Objects.equals(success, that.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataToken, pending, success);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelQueryExecutionResponseStatus.class)
        .add("dataToken", dataToken)
        .add("pending", pending)
        .add("success", success)
        .toString();
  }

  CancelQueryExecutionResponseStatusPb toPb() {
    CancelQueryExecutionResponseStatusPb pb = new CancelQueryExecutionResponseStatusPb();
    pb.setDataToken(dataToken);
    pb.setPending(pending);
    pb.setSuccess(success);

    return pb;
  }

  static CancelQueryExecutionResponseStatus fromPb(CancelQueryExecutionResponseStatusPb pb) {
    CancelQueryExecutionResponseStatus model = new CancelQueryExecutionResponseStatus();
    model.setDataToken(pb.getDataToken());
    model.setPending(pb.getPending());
    model.setSuccess(pb.getSuccess());

    return model;
  }

  public static class CancelQueryExecutionResponseStatusSerializer
      extends JsonSerializer<CancelQueryExecutionResponseStatus> {
    @Override
    public void serialize(
        CancelQueryExecutionResponseStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelQueryExecutionResponseStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelQueryExecutionResponseStatusDeserializer
      extends JsonDeserializer<CancelQueryExecutionResponseStatus> {
    @Override
    public CancelQueryExecutionResponseStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelQueryExecutionResponseStatusPb pb =
          mapper.readValue(p, CancelQueryExecutionResponseStatusPb.class);
      return CancelQueryExecutionResponseStatus.fromPb(pb);
    }
  }
}
