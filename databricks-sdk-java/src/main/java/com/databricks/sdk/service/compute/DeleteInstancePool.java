// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = DeleteInstancePool.DeleteInstancePoolSerializer.class)
@JsonDeserialize(using = DeleteInstancePool.DeleteInstancePoolDeserializer.class)
public class DeleteInstancePool {
  /** The instance pool to be terminated. */
  private String instancePoolId;

  public DeleteInstancePool setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteInstancePool that = (DeleteInstancePool) o;
    return Objects.equals(instancePoolId, that.instancePoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePoolId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteInstancePool.class)
        .add("instancePoolId", instancePoolId)
        .toString();
  }

  DeleteInstancePoolPb toPb() {
    DeleteInstancePoolPb pb = new DeleteInstancePoolPb();
    pb.setInstancePoolId(instancePoolId);

    return pb;
  }

  static DeleteInstancePool fromPb(DeleteInstancePoolPb pb) {
    DeleteInstancePool model = new DeleteInstancePool();
    model.setInstancePoolId(pb.getInstancePoolId());

    return model;
  }

  public static class DeleteInstancePoolSerializer extends JsonSerializer<DeleteInstancePool> {
    @Override
    public void serialize(DeleteInstancePool value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteInstancePoolPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteInstancePoolDeserializer extends JsonDeserializer<DeleteInstancePool> {
    @Override
    public DeleteInstancePool deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteInstancePoolPb pb = mapper.readValue(p, DeleteInstancePoolPb.class);
      return DeleteInstancePool.fromPb(pb);
    }
  }
}
