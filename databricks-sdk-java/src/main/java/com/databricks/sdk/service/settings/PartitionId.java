// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Partition by workspace or account */
@Generated
@JsonSerialize(using = PartitionId.PartitionIdSerializer.class)
@JsonDeserialize(using = PartitionId.PartitionIdDeserializer.class)
public class PartitionId {
  /** The ID of the workspace. */
  private Long workspaceId;

  public PartitionId setWorkspaceId(Long workspaceId) {
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
    PartitionId that = (PartitionId) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(PartitionId.class).add("workspaceId", workspaceId).toString();
  }

  PartitionIdPb toPb() {
    PartitionIdPb pb = new PartitionIdPb();
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static PartitionId fromPb(PartitionIdPb pb) {
    PartitionId model = new PartitionId();
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class PartitionIdSerializer extends JsonSerializer<PartitionId> {
    @Override
    public void serialize(PartitionId value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PartitionIdPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PartitionIdDeserializer extends JsonDeserializer<PartitionId> {
    @Override
    public PartitionId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PartitionIdPb pb = mapper.readValue(p, PartitionIdPb.class);
      return PartitionId.fromPb(pb);
    }
  }
}
