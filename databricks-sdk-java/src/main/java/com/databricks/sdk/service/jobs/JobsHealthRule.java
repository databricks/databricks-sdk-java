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
@JsonSerialize(using = JobsHealthRule.JobsHealthRuleSerializer.class)
@JsonDeserialize(using = JobsHealthRule.JobsHealthRuleDeserializer.class)
public class JobsHealthRule {
  /**
   * Specifies the health metric that is being evaluated for a particular health rule.
   *
   * <p>* `RUN_DURATION_SECONDS`: Expected total time for a run in seconds. *
   * `STREAMING_BACKLOG_BYTES`: An estimate of the maximum bytes of data waiting to be consumed
   * across all streams. This metric is in Public Preview. * `STREAMING_BACKLOG_RECORDS`: An
   * estimate of the maximum offset lag across all streams. This metric is in Public Preview. *
   * `STREAMING_BACKLOG_SECONDS`: An estimate of the maximum consumer delay across all streams. This
   * metric is in Public Preview. * `STREAMING_BACKLOG_FILES`: An estimate of the maximum number of
   * outstanding files across all streams. This metric is in Public Preview.
   */
  private JobsHealthMetric metric;

  /**
   * Specifies the operator used to compare the health metric value with the specified threshold.
   */
  private JobsHealthOperator op;

  /**
   * Specifies the threshold value that the health metric should obey to satisfy the health rule.
   */
  private Long value;

  public JobsHealthRule setMetric(JobsHealthMetric metric) {
    this.metric = metric;
    return this;
  }

  public JobsHealthMetric getMetric() {
    return metric;
  }

  public JobsHealthRule setOp(JobsHealthOperator op) {
    this.op = op;
    return this;
  }

  public JobsHealthOperator getOp() {
    return op;
  }

  public JobsHealthRule setValue(Long value) {
    this.value = value;
    return this;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobsHealthRule that = (JobsHealthRule) o;
    return Objects.equals(metric, that.metric)
        && Objects.equals(op, that.op)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, op, value);
  }

  @Override
  public String toString() {
    return new ToStringer(JobsHealthRule.class)
        .add("metric", metric)
        .add("op", op)
        .add("value", value)
        .toString();
  }

  JobsHealthRulePb toPb() {
    JobsHealthRulePb pb = new JobsHealthRulePb();
    pb.setMetric(metric);
    pb.setOp(op);
    pb.setValue(value);

    return pb;
  }

  static JobsHealthRule fromPb(JobsHealthRulePb pb) {
    JobsHealthRule model = new JobsHealthRule();
    model.setMetric(pb.getMetric());
    model.setOp(pb.getOp());
    model.setValue(pb.getValue());

    return model;
  }

  public static class JobsHealthRuleSerializer extends JsonSerializer<JobsHealthRule> {
    @Override
    public void serialize(JobsHealthRule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobsHealthRulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobsHealthRuleDeserializer extends JsonDeserializer<JobsHealthRule> {
    @Override
    public JobsHealthRule deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobsHealthRulePb pb = mapper.readValue(p, JobsHealthRulePb.class);
      return JobsHealthRule.fromPb(pb);
    }
  }
}
