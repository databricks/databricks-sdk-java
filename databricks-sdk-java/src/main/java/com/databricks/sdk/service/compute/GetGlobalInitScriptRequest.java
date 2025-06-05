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

/** Get an init script */
@Generated
@JsonSerialize(using = GetGlobalInitScriptRequest.GetGlobalInitScriptRequestSerializer.class)
@JsonDeserialize(using = GetGlobalInitScriptRequest.GetGlobalInitScriptRequestDeserializer.class)
public class GetGlobalInitScriptRequest {
  /** The ID of the global init script. */
  private String scriptId;

  public GetGlobalInitScriptRequest setScriptId(String scriptId) {
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
    GetGlobalInitScriptRequest that = (GetGlobalInitScriptRequest) o;
    return Objects.equals(scriptId, that.scriptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetGlobalInitScriptRequest.class).add("scriptId", scriptId).toString();
  }

  GetGlobalInitScriptRequestPb toPb() {
    GetGlobalInitScriptRequestPb pb = new GetGlobalInitScriptRequestPb();
    pb.setScriptId(scriptId);

    return pb;
  }

  static GetGlobalInitScriptRequest fromPb(GetGlobalInitScriptRequestPb pb) {
    GetGlobalInitScriptRequest model = new GetGlobalInitScriptRequest();
    model.setScriptId(pb.getScriptId());

    return model;
  }

  public static class GetGlobalInitScriptRequestSerializer
      extends JsonSerializer<GetGlobalInitScriptRequest> {
    @Override
    public void serialize(
        GetGlobalInitScriptRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetGlobalInitScriptRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetGlobalInitScriptRequestDeserializer
      extends JsonDeserializer<GetGlobalInitScriptRequest> {
    @Override
    public GetGlobalInitScriptRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetGlobalInitScriptRequestPb pb = mapper.readValue(p, GetGlobalInitScriptRequestPb.class);
      return GetGlobalInitScriptRequest.fromPb(pb);
    }
  }
}
