// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** Delete a share */
@Generated
@JsonSerialize(using = DeleteShareRequest.DeleteShareRequestSerializer.class)
@JsonDeserialize(using = DeleteShareRequest.DeleteShareRequestDeserializer.class)
public class DeleteShareRequest {
  /** The name of the share. */
  private String name;

  public DeleteShareRequest setName(String name) {
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
    DeleteShareRequest that = (DeleteShareRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteShareRequest.class).add("name", name).toString();
  }

  DeleteShareRequestPb toPb() {
    DeleteShareRequestPb pb = new DeleteShareRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteShareRequest fromPb(DeleteShareRequestPb pb) {
    DeleteShareRequest model = new DeleteShareRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteShareRequestSerializer extends JsonSerializer<DeleteShareRequest> {
    @Override
    public void serialize(DeleteShareRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteShareRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteShareRequestDeserializer extends JsonDeserializer<DeleteShareRequest> {
    @Override
    public DeleteShareRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteShareRequestPb pb = mapper.readValue(p, DeleteShareRequestPb.class);
      return DeleteShareRequest.fromPb(pb);
    }
  }
}
