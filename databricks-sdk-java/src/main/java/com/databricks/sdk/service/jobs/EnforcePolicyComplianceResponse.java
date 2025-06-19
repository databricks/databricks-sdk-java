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

@Generated
@JsonSerialize(
    using = EnforcePolicyComplianceResponse.EnforcePolicyComplianceResponseSerializer.class)
@JsonDeserialize(
    using = EnforcePolicyComplianceResponse.EnforcePolicyComplianceResponseDeserializer.class)
public class EnforcePolicyComplianceResponse {
  /**
   * Whether any changes have been made to the job cluster settings for the job to become compliant
   * with its policies.
   */
  private Boolean hasChanges;

  /**
   * A list of job cluster changes that have been made to the job’s cluster settings in order for
   * all job clusters to become compliant with their policies.
   */
  private Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange>
      jobClusterChanges;

  /**
   * Updated job settings after policy enforcement. Policy enforcement only applies to job clusters
   * that are created when running the job (which are specified in new_cluster) and does not apply
   * to existing all-purpose clusters. Updated job settings are derived by applying policy default
   * values to the existing job clusters in order to satisfy policy requirements.
   */
  private JobSettings settings;

  public EnforcePolicyComplianceResponse setHasChanges(Boolean hasChanges) {
    this.hasChanges = hasChanges;
    return this;
  }

  public Boolean getHasChanges() {
    return hasChanges;
  }

  public EnforcePolicyComplianceResponse setJobClusterChanges(
      Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange> jobClusterChanges) {
    this.jobClusterChanges = jobClusterChanges;
    return this;
  }

  public Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange>
      getJobClusterChanges() {
    return jobClusterChanges;
  }

  public EnforcePolicyComplianceResponse setSettings(JobSettings settings) {
    this.settings = settings;
    return this;
  }

  public JobSettings getSettings() {
    return settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforcePolicyComplianceResponse that = (EnforcePolicyComplianceResponse) o;
    return Objects.equals(hasChanges, that.hasChanges)
        && Objects.equals(jobClusterChanges, that.jobClusterChanges)
        && Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasChanges, jobClusterChanges, settings);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforcePolicyComplianceResponse.class)
        .add("hasChanges", hasChanges)
        .add("jobClusterChanges", jobClusterChanges)
        .add("settings", settings)
        .toString();
  }

  EnforcePolicyComplianceResponsePb toPb() {
    EnforcePolicyComplianceResponsePb pb = new EnforcePolicyComplianceResponsePb();
    pb.setHasChanges(hasChanges);
    pb.setJobClusterChanges(jobClusterChanges);
    pb.setSettings(settings);

    return pb;
  }

  static EnforcePolicyComplianceResponse fromPb(EnforcePolicyComplianceResponsePb pb) {
    EnforcePolicyComplianceResponse model = new EnforcePolicyComplianceResponse();
    model.setHasChanges(pb.getHasChanges());
    model.setJobClusterChanges(pb.getJobClusterChanges());
    model.setSettings(pb.getSettings());

    return model;
  }

  public static class EnforcePolicyComplianceResponseSerializer
      extends JsonSerializer<EnforcePolicyComplianceResponse> {
    @Override
    public void serialize(
        EnforcePolicyComplianceResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnforcePolicyComplianceResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnforcePolicyComplianceResponseDeserializer
      extends JsonDeserializer<EnforcePolicyComplianceResponse> {
    @Override
    public EnforcePolicyComplianceResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnforcePolicyComplianceResponsePb pb =
          mapper.readValue(p, EnforcePolicyComplianceResponsePb.class);
      return EnforcePolicyComplianceResponse.fromPb(pb);
    }
  }
}
