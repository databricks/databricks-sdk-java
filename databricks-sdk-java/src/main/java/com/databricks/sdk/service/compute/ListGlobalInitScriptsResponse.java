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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListGlobalInitScriptsResponse.ListGlobalInitScriptsResponseSerializer.class)
@JsonDeserialize(
    using = ListGlobalInitScriptsResponse.ListGlobalInitScriptsResponseDeserializer.class)
public class ListGlobalInitScriptsResponse {
  /** */
  private Collection<GlobalInitScriptDetails> scripts;

  public ListGlobalInitScriptsResponse setScripts(Collection<GlobalInitScriptDetails> scripts) {
    this.scripts = scripts;
    return this;
  }

  public Collection<GlobalInitScriptDetails> getScripts() {
    return scripts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListGlobalInitScriptsResponse that = (ListGlobalInitScriptsResponse) o;
    return Objects.equals(scripts, that.scripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scripts);
  }

  @Override
  public String toString() {
    return new ToStringer(ListGlobalInitScriptsResponse.class).add("scripts", scripts).toString();
  }

  ListGlobalInitScriptsResponsePb toPb() {
    ListGlobalInitScriptsResponsePb pb = new ListGlobalInitScriptsResponsePb();
    pb.setScripts(scripts);

    return pb;
  }

  static ListGlobalInitScriptsResponse fromPb(ListGlobalInitScriptsResponsePb pb) {
    ListGlobalInitScriptsResponse model = new ListGlobalInitScriptsResponse();
    model.setScripts(pb.getScripts());

    return model;
  }

  public static class ListGlobalInitScriptsResponseSerializer
      extends JsonSerializer<ListGlobalInitScriptsResponse> {
    @Override
    public void serialize(
        ListGlobalInitScriptsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListGlobalInitScriptsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListGlobalInitScriptsResponseDeserializer
      extends JsonDeserializer<ListGlobalInitScriptsResponse> {
    @Override
    public ListGlobalInitScriptsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListGlobalInitScriptsResponsePb pb =
          mapper.readValue(p, ListGlobalInitScriptsResponsePb.class);
      return ListGlobalInitScriptsResponse.fromPb(pb);
    }
  }
}
