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

/**
 * The source of the job specification in the remote repository when the job is source controlled.
 */
@Generated
@JsonSerialize(using = JobSource.JobSourceSerializer.class)
@JsonDeserialize(using = JobSource.JobSourceDeserializer.class)
public class JobSource {
  /**
   * Dirty state indicates the job is not fully synced with the job specification in the remote
   * repository.
   *
   * <p>Possible values are: * `NOT_SYNCED`: The job is not yet synced with the remote job
   * specification. Import the remote job specification from UI to make the job fully synced. *
   * `DISCONNECTED`: The job is temporary disconnected from the remote job specification and is
   * allowed for live edit. Import the remote job specification again from UI to make the job fully
   * synced.
   */
  private JobSourceDirtyState dirtyState;

  /** Name of the branch which the job is imported from. */
  private String importFromGitBranch;

  /** Path of the job YAML file that contains the job specification. */
  private String jobConfigPath;

  public JobSource setDirtyState(JobSourceDirtyState dirtyState) {
    this.dirtyState = dirtyState;
    return this;
  }

  public JobSourceDirtyState getDirtyState() {
    return dirtyState;
  }

  public JobSource setImportFromGitBranch(String importFromGitBranch) {
    this.importFromGitBranch = importFromGitBranch;
    return this;
  }

  public String getImportFromGitBranch() {
    return importFromGitBranch;
  }

  public JobSource setJobConfigPath(String jobConfigPath) {
    this.jobConfigPath = jobConfigPath;
    return this;
  }

  public String getJobConfigPath() {
    return jobConfigPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobSource that = (JobSource) o;
    return Objects.equals(dirtyState, that.dirtyState)
        && Objects.equals(importFromGitBranch, that.importFromGitBranch)
        && Objects.equals(jobConfigPath, that.jobConfigPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirtyState, importFromGitBranch, jobConfigPath);
  }

  @Override
  public String toString() {
    return new ToStringer(JobSource.class)
        .add("dirtyState", dirtyState)
        .add("importFromGitBranch", importFromGitBranch)
        .add("jobConfigPath", jobConfigPath)
        .toString();
  }

  JobSourcePb toPb() {
    JobSourcePb pb = new JobSourcePb();
    pb.setDirtyState(dirtyState);
    pb.setImportFromGitBranch(importFromGitBranch);
    pb.setJobConfigPath(jobConfigPath);

    return pb;
  }

  static JobSource fromPb(JobSourcePb pb) {
    JobSource model = new JobSource();
    model.setDirtyState(pb.getDirtyState());
    model.setImportFromGitBranch(pb.getImportFromGitBranch());
    model.setJobConfigPath(pb.getJobConfigPath());

    return model;
  }

  public static class JobSourceSerializer extends JsonSerializer<JobSource> {
    @Override
    public void serialize(JobSource value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobSourcePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobSourceDeserializer extends JsonDeserializer<JobSource> {
    @Override
    public JobSource deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobSourcePb pb = mapper.readValue(p, JobSourcePb.class);
      return JobSource.fromPb(pb);
    }
  }
}
