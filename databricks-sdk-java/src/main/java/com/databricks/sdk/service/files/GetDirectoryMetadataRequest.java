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

/** Get directory metadata */
@Generated
@JsonSerialize(using = GetDirectoryMetadataRequest.GetDirectoryMetadataRequestSerializer.class)
@JsonDeserialize(using = GetDirectoryMetadataRequest.GetDirectoryMetadataRequestDeserializer.class)
public class GetDirectoryMetadataRequest {
  /** The absolute path of a directory. */
  private String directoryPath;

  public GetDirectoryMetadataRequest setDirectoryPath(String directoryPath) {
    this.directoryPath = directoryPath;
    return this;
  }

  public String getDirectoryPath() {
    return directoryPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDirectoryMetadataRequest that = (GetDirectoryMetadataRequest) o;
    return Objects.equals(directoryPath, that.directoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryPath);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDirectoryMetadataRequest.class)
        .add("directoryPath", directoryPath)
        .toString();
  }

  GetDirectoryMetadataRequestPb toPb() {
    GetDirectoryMetadataRequestPb pb = new GetDirectoryMetadataRequestPb();
    pb.setDirectoryPath(directoryPath);

    return pb;
  }

  static GetDirectoryMetadataRequest fromPb(GetDirectoryMetadataRequestPb pb) {
    GetDirectoryMetadataRequest model = new GetDirectoryMetadataRequest();
    model.setDirectoryPath(pb.getDirectoryPath());

    return model;
  }

  public static class GetDirectoryMetadataRequestSerializer
      extends JsonSerializer<GetDirectoryMetadataRequest> {
    @Override
    public void serialize(
        GetDirectoryMetadataRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetDirectoryMetadataRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetDirectoryMetadataRequestDeserializer
      extends JsonDeserializer<GetDirectoryMetadataRequest> {
    @Override
    public GetDirectoryMetadataRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetDirectoryMetadataRequestPb pb = mapper.readValue(p, GetDirectoryMetadataRequestPb.class);
      return GetDirectoryMetadataRequest.fromPb(pb);
    }
  }
}
