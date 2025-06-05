// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
@JsonSerialize(using = Close.CloseSerializer.class)
@JsonDeserialize(using = Close.CloseDeserializer.class)
public class Close {
  /** The handle on an open stream. */
  private Long handle;

  public Close setHandle(Long handle) {
    this.handle = handle;
    return this;
  }

  public Long getHandle() {
    return handle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Close that = (Close) o;
    return Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle);
  }

  @Override
  public String toString() {
    return new ToStringer(Close.class).add("handle", handle).toString();
  }

  ClosePb toPb() {
    ClosePb pb = new ClosePb();
    pb.setHandle(handle);

    return pb;
  }

  static Close fromPb(ClosePb pb) {
    Close model = new Close();
    model.setHandle(pb.getHandle());

    return model;
  }

  public static class CloseSerializer extends JsonSerializer<Close> {
    @Override
    public void serialize(Close value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClosePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CloseDeserializer extends JsonDeserializer<Close> {
    @Override
    public Close deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClosePb pb = mapper.readValue(p, ClosePb.class);
      return Close.fromPb(pb);
    }
  }
}
