// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Delete an assignment */
@Generated
@JsonSerialize(using = UnassignRequest.UnassignRequestSerializer.class)
@JsonDeserialize(using = UnassignRequest.UnassignRequestDeserializer.class)
public class UnassignRequest {
  /** Query for the ID of the metastore to delete. */
  private String metastoreId;

  /** A workspace ID. */
  private Long workspaceId;

  public UnassignRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public UnassignRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnassignRequest that = (UnassignRequest) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UnassignRequest.class)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }

  UnassignRequestPb toPb() {
    UnassignRequestPb pb = new UnassignRequestPb();
    pb.setMetastoreId(metastoreId);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static UnassignRequest fromPb(UnassignRequestPb pb) {
    UnassignRequest model = new UnassignRequest();
    model.setMetastoreId(pb.getMetastoreId());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class UnassignRequestSerializer extends JsonSerializer<UnassignRequest> {
    @Override
    public void serialize(UnassignRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UnassignRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UnassignRequestDeserializer extends JsonDeserializer<UnassignRequest> {
    @Override
    public UnassignRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UnassignRequestPb pb = mapper.readValue(p, UnassignRequestPb.class);
      return UnassignRequest.fromPb(pb);
    }
  }
}
