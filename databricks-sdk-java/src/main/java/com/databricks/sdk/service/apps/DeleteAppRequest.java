// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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

/** Delete an app */
@Generated
@JsonSerialize(using = DeleteAppRequest.DeleteAppRequestSerializer.class)
@JsonDeserialize(using = DeleteAppRequest.DeleteAppRequestDeserializer.class)
public class DeleteAppRequest {
  /** The name of the app. */
  private String name;

  public DeleteAppRequest setName(String name) {
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
    DeleteAppRequest that = (DeleteAppRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAppRequest.class).add("name", name).toString();
  }

  DeleteAppRequestPb toPb() {
    DeleteAppRequestPb pb = new DeleteAppRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteAppRequest fromPb(DeleteAppRequestPb pb) {
    DeleteAppRequest model = new DeleteAppRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteAppRequestSerializer extends JsonSerializer<DeleteAppRequest> {
    @Override
    public void serialize(DeleteAppRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAppRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAppRequestDeserializer extends JsonDeserializer<DeleteAppRequest> {
    @Override
    public DeleteAppRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAppRequestPb pb = mapper.readValue(p, DeleteAppRequestPb.class);
      return DeleteAppRequest.fromPb(pb);
    }
  }
}
