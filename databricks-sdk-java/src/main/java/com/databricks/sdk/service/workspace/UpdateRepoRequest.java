// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = UpdateRepoRequest.UpdateRepoRequestSerializer.class)
@JsonDeserialize(using = UpdateRepoRequest.UpdateRepoRequestDeserializer.class)
public class UpdateRepoRequest {
  /** Branch that the local version of the repo is checked out to. */
  private String branch;

  /** ID of the Git folder (repo) object in the workspace. */
  private Long repoId;

  /**
   * If specified, update the sparse checkout settings. The update will fail if sparse checkout is
   * not enabled for the repo.
   */
  private SparseCheckoutUpdate sparseCheckout;

  /**
   * Tag that the local version of the repo is checked out to. Updating the repo to a tag puts the
   * repo in a detached HEAD state. Before committing new changes, you must update the repo to a
   * branch instead of the detached HEAD.
   */
  private String tag;

  public UpdateRepoRequest setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public UpdateRepoRequest setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  public Long getRepoId() {
    return repoId;
  }

  public UpdateRepoRequest setSparseCheckout(SparseCheckoutUpdate sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
  }

  public SparseCheckoutUpdate getSparseCheckout() {
    return sparseCheckout;
  }

  public UpdateRepoRequest setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public String getTag() {
    return tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRepoRequest that = (UpdateRepoRequest) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(repoId, that.repoId)
        && Objects.equals(sparseCheckout, that.sparseCheckout)
        && Objects.equals(tag, that.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, repoId, sparseCheckout, tag);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRepoRequest.class)
        .add("branch", branch)
        .add("repoId", repoId)
        .add("sparseCheckout", sparseCheckout)
        .add("tag", tag)
        .toString();
  }

  UpdateRepoRequestPb toPb() {
    UpdateRepoRequestPb pb = new UpdateRepoRequestPb();
    pb.setBranch(branch);
    pb.setRepoId(repoId);
    pb.setSparseCheckout(sparseCheckout);
    pb.setTag(tag);

    return pb;
  }

  static UpdateRepoRequest fromPb(UpdateRepoRequestPb pb) {
    UpdateRepoRequest model = new UpdateRepoRequest();
    model.setBranch(pb.getBranch());
    model.setRepoId(pb.getRepoId());
    model.setSparseCheckout(pb.getSparseCheckout());
    model.setTag(pb.getTag());

    return model;
  }

  public static class UpdateRepoRequestSerializer extends JsonSerializer<UpdateRepoRequest> {
    @Override
    public void serialize(UpdateRepoRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateRepoRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateRepoRequestDeserializer extends JsonDeserializer<UpdateRepoRequest> {
    @Override
    public UpdateRepoRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateRepoRequestPb pb = mapper.readValue(p, UpdateRepoRequestPb.class);
      return UpdateRepoRequest.fromPb(pb);
    }
  }
}
