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
@JsonSerialize(using = RunConditionTask.RunConditionTaskSerializer.class)
@JsonDeserialize(using = RunConditionTask.RunConditionTaskDeserializer.class)
public class RunConditionTask {
  /**
   * The left operand of the condition task. Can be either a string value or a job state or
   * parameter reference.
   */
  private String left;

  /**
   * * `EQUAL_TO`, `NOT_EQUAL` operators perform string comparison of their operands. This means
   * that `“12.0” == “12”` will evaluate to `false`. * `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`,
   * `LESS_THAN`, `LESS_THAN_OR_EQUAL` operators perform numeric comparison of their operands.
   * `“12.0” >= “12”` will evaluate to `true`, `“10.0” >= “12”` will evaluate to `false`.
   *
   * <p>The boolean comparison to task values can be implemented with operators `EQUAL_TO`,
   * `NOT_EQUAL`. If a task value was set to a boolean value, it will be serialized to `“true”` or
   * `“false”` for the comparison.
   */
  private ConditionTaskOp op;

  /**
   * The condition expression evaluation result. Filled in if the task was successfully completed.
   * Can be `"true"` or `"false"`
   */
  private String outcome;

  /**
   * The right operand of the condition task. Can be either a string value or a job state or
   * parameter reference.
   */
  private String right;

  public RunConditionTask setLeft(String left) {
    this.left = left;
    return this;
  }

  public String getLeft() {
    return left;
  }

  public RunConditionTask setOp(ConditionTaskOp op) {
    this.op = op;
    return this;
  }

  public ConditionTaskOp getOp() {
    return op;
  }

  public RunConditionTask setOutcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  public String getOutcome() {
    return outcome;
  }

  public RunConditionTask setRight(String right) {
    this.right = right;
    return this;
  }

  public String getRight() {
    return right;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunConditionTask that = (RunConditionTask) o;
    return Objects.equals(left, that.left)
        && Objects.equals(op, that.op)
        && Objects.equals(outcome, that.outcome)
        && Objects.equals(right, that.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, op, outcome, right);
  }

  @Override
  public String toString() {
    return new ToStringer(RunConditionTask.class)
        .add("left", left)
        .add("op", op)
        .add("outcome", outcome)
        .add("right", right)
        .toString();
  }

  RunConditionTaskPb toPb() {
    RunConditionTaskPb pb = new RunConditionTaskPb();
    pb.setLeft(left);
    pb.setOp(op);
    pb.setOutcome(outcome);
    pb.setRight(right);

    return pb;
  }

  static RunConditionTask fromPb(RunConditionTaskPb pb) {
    RunConditionTask model = new RunConditionTask();
    model.setLeft(pb.getLeft());
    model.setOp(pb.getOp());
    model.setOutcome(pb.getOutcome());
    model.setRight(pb.getRight());

    return model;
  }

  public static class RunConditionTaskSerializer extends JsonSerializer<RunConditionTask> {
    @Override
    public void serialize(RunConditionTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunConditionTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunConditionTaskDeserializer extends JsonDeserializer<RunConditionTask> {
    @Override
    public RunConditionTask deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunConditionTaskPb pb = mapper.readValue(p, RunConditionTaskPb.class);
      return RunConditionTask.fromPb(pb);
    }
  }
}
