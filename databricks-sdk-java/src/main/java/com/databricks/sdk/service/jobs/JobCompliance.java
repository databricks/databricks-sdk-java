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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = JobCompliance.JobComplianceSerializer.class)
@JsonDeserialize(using = JobCompliance.JobComplianceDeserializer.class)
public class JobCompliance {
  /** Whether this job is in compliance with the latest version of its policy. */
  private Boolean isCompliant;

  /** Canonical unique identifier for a job. */
  private Long jobId;

  /**
   * An object containing key-value mappings representing the first 200 policy validation errors.
   * The keys indicate the path where the policy validation error is occurring. An identifier for
   * the job cluster is prepended to the path. The values indicate an error message describing the
   * policy validation error.
   */
  private Map<String, String> violations;

  public JobCompliance setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public JobCompliance setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public JobCompliance setViolations(Map<String, String> violations) {
    this.violations = violations;
    return this;
  }

  public Map<String, String> getViolations() {
    return violations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCompliance that = (JobCompliance) o;
    return Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompliant, jobId, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCompliance.class)
        .add("isCompliant", isCompliant)
        .add("jobId", jobId)
        .add("violations", violations)
        .toString();
  }

  JobCompliancePb toPb() {
    JobCompliancePb pb = new JobCompliancePb();
    pb.setIsCompliant(isCompliant);
    pb.setJobId(jobId);
    pb.setViolations(violations);

    return pb;
  }

  static JobCompliance fromPb(JobCompliancePb pb) {
    JobCompliance model = new JobCompliance();
    model.setIsCompliant(pb.getIsCompliant());
    model.setJobId(pb.getJobId());
    model.setViolations(pb.getViolations());

    return model;
  }

  public static class JobComplianceSerializer extends JsonSerializer<JobCompliance> {
    @Override
    public void serialize(JobCompliance value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobCompliancePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobComplianceDeserializer extends JsonDeserializer<JobCompliance> {
    @Override
    public JobCompliance deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobCompliancePb pb = mapper.readValue(p, JobCompliancePb.class);
      return JobCompliance.fromPb(pb);
    }
  }
}
