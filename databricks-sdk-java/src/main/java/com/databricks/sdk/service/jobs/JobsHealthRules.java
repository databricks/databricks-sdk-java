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
import java.util.Collection;
import java.util.Objects;

/** An optional set of health rules that can be defined for this job. */
@Generated
@JsonSerialize(using = JobsHealthRules.JobsHealthRulesSerializer.class)
@JsonDeserialize(using = JobsHealthRules.JobsHealthRulesDeserializer.class)
public class JobsHealthRules {
  /** */
  private Collection<JobsHealthRule> rules;

  public JobsHealthRules setRules(Collection<JobsHealthRule> rules) {
    this.rules = rules;
    return this;
  }

  public Collection<JobsHealthRule> getRules() {
    return rules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobsHealthRules that = (JobsHealthRules) o;
    return Objects.equals(rules, that.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    return new ToStringer(JobsHealthRules.class).add("rules", rules).toString();
  }

  JobsHealthRulesPb toPb() {
    JobsHealthRulesPb pb = new JobsHealthRulesPb();
    pb.setRules(rules);

    return pb;
  }

  static JobsHealthRules fromPb(JobsHealthRulesPb pb) {
    JobsHealthRules model = new JobsHealthRules();
    model.setRules(pb.getRules());

    return model;
  }

  public static class JobsHealthRulesSerializer extends JsonSerializer<JobsHealthRules> {
    @Override
    public void serialize(JobsHealthRules value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobsHealthRulesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobsHealthRulesDeserializer extends JsonDeserializer<JobsHealthRules> {
    @Override
    public JobsHealthRules deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobsHealthRulesPb pb = mapper.readValue(p, JobsHealthRulesPb.class);
      return JobsHealthRules.fromPb(pb);
    }
  }
}
