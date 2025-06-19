// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/** Get status */
@Generated
@JsonSerialize(using = GetStatusRequest.GetStatusRequestSerializer.class)
@JsonDeserialize(using = GetStatusRequest.GetStatusRequestDeserializer.class)
public class GetStatusRequest {
  /** The absolute path of the notebook or directory. */
  private String path;

  public GetStatusRequest setPath(String path) {
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
    GetStatusRequest that = (GetStatusRequest) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStatusRequest.class).add("path", path).toString();
  }

  GetStatusRequestPb toPb() {
    GetStatusRequestPb pb = new GetStatusRequestPb();
    pb.setPath(path);

    return pb;
  }

  static GetStatusRequest fromPb(GetStatusRequestPb pb) {
    GetStatusRequest model = new GetStatusRequest();
    model.setPath(pb.getPath());

    return model;
  }

  public static class GetStatusRequestSerializer extends JsonSerializer<GetStatusRequest> {
    @Override
    public void serialize(GetStatusRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetStatusRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetStatusRequestDeserializer extends JsonDeserializer<GetStatusRequest> {
    @Override
    public GetStatusRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetStatusRequestPb pb = mapper.readValue(p, GetStatusRequestPb.class);
      return GetStatusRequest.fromPb(pb);
    }
  }
}
