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

/** The status response includes execution state and if relevant, error information. */
@Generated
@JsonSerialize(using = StatementStatus.StatementStatusSerializer.class)
@JsonDeserialize(using = StatementStatus.StatementStatusDeserializer.class)
public class StatementStatus {
  /** */
  private ServiceError error;

  /**
   * Statement execution state: - `PENDING`: waiting for warehouse - `RUNNING`: running -
   * `SUCCEEDED`: execution was successful, result data available for fetch - `FAILED`: execution
   * failed; reason for failure described in accomanying error message - `CANCELED`: user canceled;
   * can come from explicit cancel call, or timeout with `on_wait_timeout=CANCEL` - `CLOSED`:
   * execution successful, and statement closed; result no longer available for fetch
   */
  private StatementState state;

  public StatementStatus setError(ServiceError error) {
    this.error = error;
    return this;
  }

  public ServiceError getError() {
    return error;
  }

  public StatementStatus setState(StatementState state) {
    this.state = state;
    return this;
  }

  public StatementState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StatementStatus that = (StatementStatus) o;
    return Objects.equals(error, that.error) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, state);
  }

  @Override
  public String toString() {
    return new ToStringer(StatementStatus.class).add("error", error).add("state", state).toString();
  }

  StatementStatusPb toPb() {
    StatementStatusPb pb = new StatementStatusPb();
    pb.setError(error);
    pb.setState(state);

    return pb;
  }

  static StatementStatus fromPb(StatementStatusPb pb) {
    StatementStatus model = new StatementStatus();
    model.setError(pb.getError());
    model.setState(pb.getState());

    return model;
  }

  public static class StatementStatusSerializer extends JsonSerializer<StatementStatus> {
    @Override
    public void serialize(StatementStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StatementStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StatementStatusDeserializer extends JsonDeserializer<StatementStatus> {
    @Override
    public StatementStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StatementStatusPb pb = mapper.readValue(p, StatementStatusPb.class);
      return StatementStatus.fromPb(pb);
    }
  }
}
