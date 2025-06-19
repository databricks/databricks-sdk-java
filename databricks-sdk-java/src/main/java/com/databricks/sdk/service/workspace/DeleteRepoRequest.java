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

/** Delete a repo */
@Generated
@JsonSerialize(using = DeleteRepoRequest.DeleteRepoRequestSerializer.class)
@JsonDeserialize(using = DeleteRepoRequest.DeleteRepoRequestDeserializer.class)
public class DeleteRepoRequest {
  /** The ID for the corresponding repo to delete. */
  private Long repoId;

  public DeleteRepoRequest setRepoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  public Long getRepoId() {
    return repoId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRepoRequest that = (DeleteRepoRequest) o;
    return Objects.equals(repoId, that.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRepoRequest.class).add("repoId", repoId).toString();
  }

  DeleteRepoRequestPb toPb() {
    DeleteRepoRequestPb pb = new DeleteRepoRequestPb();
    pb.setRepoId(repoId);

    return pb;
  }

  static DeleteRepoRequest fromPb(DeleteRepoRequestPb pb) {
    DeleteRepoRequest model = new DeleteRepoRequest();
    model.setRepoId(pb.getRepoId());

    return model;
  }

  public static class DeleteRepoRequestSerializer extends JsonSerializer<DeleteRepoRequest> {
    @Override
    public void serialize(DeleteRepoRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteRepoRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteRepoRequestDeserializer extends JsonDeserializer<DeleteRepoRequest> {
    @Override
    public DeleteRepoRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteRepoRequestPb pb = mapper.readValue(p, DeleteRepoRequestPb.class);
      return DeleteRepoRequest.fromPb(pb);
    }
  }
}
