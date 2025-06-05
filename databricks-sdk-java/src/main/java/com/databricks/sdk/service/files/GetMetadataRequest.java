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

/** Get file metadata */
@Generated
@JsonSerialize(using = GetMetadataRequest.GetMetadataRequestSerializer.class)
@JsonDeserialize(using = GetMetadataRequest.GetMetadataRequestDeserializer.class)
public class GetMetadataRequest {
  /** The absolute path of the file. */
  private String filePath;

  public GetMetadataRequest setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMetadataRequest that = (GetMetadataRequest) o;
    return Objects.equals(filePath, that.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetadataRequest.class).add("filePath", filePath).toString();
  }

  GetMetadataRequestPb toPb() {
    GetMetadataRequestPb pb = new GetMetadataRequestPb();
    pb.setFilePath(filePath);

    return pb;
  }

  static GetMetadataRequest fromPb(GetMetadataRequestPb pb) {
    GetMetadataRequest model = new GetMetadataRequest();
    model.setFilePath(pb.getFilePath());

    return model;
  }

  public static class GetMetadataRequestSerializer extends JsonSerializer<GetMetadataRequest> {
    @Override
    public void serialize(GetMetadataRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetMetadataRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetMetadataRequestDeserializer extends JsonDeserializer<GetMetadataRequest> {
    @Override
    public GetMetadataRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetMetadataRequestPb pb = mapper.readValue(p, GetMetadataRequestPb.class);
      return GetMetadataRequest.fromPb(pb);
    }
  }
}
