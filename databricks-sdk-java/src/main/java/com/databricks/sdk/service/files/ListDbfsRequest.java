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

/** List directory contents or file details */
@Generated
@JsonSerialize(using = ListDbfsRequest.ListDbfsRequestSerializer.class)
@JsonDeserialize(using = ListDbfsRequest.ListDbfsRequestDeserializer.class)
public class ListDbfsRequest {
  /** The path of the file or directory. The path should be the absolute DBFS path. */
  private String path;

  public ListDbfsRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDbfsRequest that = (ListDbfsRequest) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDbfsRequest.class).add("path", path).toString();
  }

  ListDbfsRequestPb toPb() {
    ListDbfsRequestPb pb = new ListDbfsRequestPb();
    pb.setPath(path);

    return pb;
  }

  static ListDbfsRequest fromPb(ListDbfsRequestPb pb) {
    ListDbfsRequest model = new ListDbfsRequest();
    model.setPath(pb.getPath());

    return model;
  }

  public static class ListDbfsRequestSerializer extends JsonSerializer<ListDbfsRequest> {
    @Override
    public void serialize(ListDbfsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListDbfsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListDbfsRequestDeserializer extends JsonDeserializer<ListDbfsRequest> {
    @Override
    public ListDbfsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDbfsRequestPb pb = mapper.readValue(p, ListDbfsRequestPb.class);
      return ListDbfsRequest.fromPb(pb);
    }
  }
}
