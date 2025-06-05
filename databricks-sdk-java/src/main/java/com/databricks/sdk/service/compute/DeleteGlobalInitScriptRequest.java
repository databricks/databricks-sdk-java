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

/** Delete init script */
@Generated
@JsonSerialize(using = DeleteGlobalInitScriptRequest.DeleteGlobalInitScriptRequestSerializer.class)
@JsonDeserialize(
    using = DeleteGlobalInitScriptRequest.DeleteGlobalInitScriptRequestDeserializer.class)
public class DeleteGlobalInitScriptRequest {
  /** The ID of the global init script. */
  private String scriptId;

  public DeleteGlobalInitScriptRequest setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  public String getScriptId() {
    return scriptId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteGlobalInitScriptRequest that = (DeleteGlobalInitScriptRequest) o;
    return Objects.equals(scriptId, that.scriptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteGlobalInitScriptRequest.class).add("scriptId", scriptId).toString();
  }

  DeleteGlobalInitScriptRequestPb toPb() {
    DeleteGlobalInitScriptRequestPb pb = new DeleteGlobalInitScriptRequestPb();
    pb.setScriptId(scriptId);

    return pb;
  }

  static DeleteGlobalInitScriptRequest fromPb(DeleteGlobalInitScriptRequestPb pb) {
    DeleteGlobalInitScriptRequest model = new DeleteGlobalInitScriptRequest();
    model.setScriptId(pb.getScriptId());

    return model;
  }

  public static class DeleteGlobalInitScriptRequestSerializer
      extends JsonSerializer<DeleteGlobalInitScriptRequest> {
    @Override
    public void serialize(
        DeleteGlobalInitScriptRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteGlobalInitScriptRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteGlobalInitScriptRequestDeserializer
      extends JsonDeserializer<DeleteGlobalInitScriptRequest> {
    @Override
    public DeleteGlobalInitScriptRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteGlobalInitScriptRequestPb pb =
          mapper.readValue(p, DeleteGlobalInitScriptRequestPb.class);
      return DeleteGlobalInitScriptRequest.fromPb(pb);
    }
  }
}
