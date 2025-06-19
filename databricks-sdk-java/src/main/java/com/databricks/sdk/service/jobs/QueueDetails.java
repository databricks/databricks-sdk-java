// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = QueueDetails.QueueDetailsSerializer.class)
@JsonDeserialize(using = QueueDetails.QueueDetailsDeserializer.class)
public class QueueDetails {
  /**
   * The reason for queuing the run. * `ACTIVE_RUNS_LIMIT_REACHED`: The run was queued due to
   * reaching the workspace limit of active task runs. * `MAX_CONCURRENT_RUNS_REACHED`: The run was
   * queued due to reaching the per-job limit of concurrent job runs. *
   * `ACTIVE_RUN_JOB_TASKS_LIMIT_REACHED`: The run was queued due to reaching the workspace limit of
   * active run job tasks.
   */
  private QueueDetailsCodeCode code;

  /**
   * A descriptive message with the queuing details. This field is unstructured, and its exact
   * format is subject to change.
   */
  private String message;

  public QueueDetails setCode(QueueDetailsCodeCode code) {
    this.code = code;
    return this;
  }

  public QueueDetailsCodeCode getCode() {
    return code;
  }

  public QueueDetails setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueueDetails that = (QueueDetails) o;
    return Objects.equals(code, that.code) && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    return new ToStringer(QueueDetails.class).add("code", code).add("message", message).toString();
  }

  QueueDetailsPb toPb() {
    QueueDetailsPb pb = new QueueDetailsPb();
    pb.setCode(code);
    pb.setMessage(message);

    return pb;
  }

  static QueueDetails fromPb(QueueDetailsPb pb) {
    QueueDetails model = new QueueDetails();
    model.setCode(pb.getCode());
    model.setMessage(pb.getMessage());

    return model;
  }

  public static class QueueDetailsSerializer extends JsonSerializer<QueueDetails> {
    @Override
    public void serialize(QueueDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueueDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueueDetailsDeserializer extends JsonDeserializer<QueueDetails> {
    @Override
    public QueueDetails deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueueDetailsPb pb = mapper.readValue(p, QueueDetailsPb.class);
      return QueueDetails.fromPb(pb);
    }
  }
}
