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
 * Read-only state of the remote repository at the time the job was run. This field is only included
 * on job runs.
 */
@Generated
@JsonSerialize(using = GitSnapshot.GitSnapshotSerializer.class)
@JsonDeserialize(using = GitSnapshot.GitSnapshotDeserializer.class)
public class GitSnapshot {
  /**
   * Commit that was used to execute the run. If git_branch was specified, this points to the HEAD
   * of the branch at the time of the run; if git_tag was specified, this points to the commit the
   * tag points to.
   */
  private String usedCommit;

  public GitSnapshot setUsedCommit(String usedCommit) {
    this.usedCommit = usedCommit;
    return this;
  }

  public String getUsedCommit() {
    return usedCommit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GitSnapshot that = (GitSnapshot) o;
    return Objects.equals(usedCommit, that.usedCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usedCommit);
  }

  @Override
  public String toString() {
    return new ToStringer(GitSnapshot.class).add("usedCommit", usedCommit).toString();
  }

  GitSnapshotPb toPb() {
    GitSnapshotPb pb = new GitSnapshotPb();
    pb.setUsedCommit(usedCommit);

    return pb;
  }

  static GitSnapshot fromPb(GitSnapshotPb pb) {
    GitSnapshot model = new GitSnapshot();
    model.setUsedCommit(pb.getUsedCommit());

    return model;
  }

  public static class GitSnapshotSerializer extends JsonSerializer<GitSnapshot> {
    @Override
    public void serialize(GitSnapshot value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GitSnapshotPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GitSnapshotDeserializer extends JsonDeserializer<GitSnapshot> {
    @Override
    public GitSnapshot deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GitSnapshotPb pb = mapper.readValue(p, GitSnapshotPb.class);
      return GitSnapshot.fromPb(pb);
    }
  }
}
