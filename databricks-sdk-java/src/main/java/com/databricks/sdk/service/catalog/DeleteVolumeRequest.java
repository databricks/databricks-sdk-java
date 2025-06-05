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

/** Delete a Volume */
@Generated
@JsonSerialize(using = DeleteVolumeRequest.DeleteVolumeRequestSerializer.class)
@JsonDeserialize(using = DeleteVolumeRequest.DeleteVolumeRequestDeserializer.class)
public class DeleteVolumeRequest {
  /** The three-level (fully qualified) name of the volume */
  private String name;

  public DeleteVolumeRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteVolumeRequest that = (DeleteVolumeRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteVolumeRequest.class).add("name", name).toString();
  }

  DeleteVolumeRequestPb toPb() {
    DeleteVolumeRequestPb pb = new DeleteVolumeRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteVolumeRequest fromPb(DeleteVolumeRequestPb pb) {
    DeleteVolumeRequest model = new DeleteVolumeRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteVolumeRequestSerializer extends JsonSerializer<DeleteVolumeRequest> {
    @Override
    public void serialize(DeleteVolumeRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteVolumeRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteVolumeRequestDeserializer
      extends JsonDeserializer<DeleteVolumeRequest> {
    @Override
    public DeleteVolumeRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteVolumeRequestPb pb = mapper.readValue(p, DeleteVolumeRequestPb.class);
      return DeleteVolumeRequest.fromPb(pb);
    }
  }
}
