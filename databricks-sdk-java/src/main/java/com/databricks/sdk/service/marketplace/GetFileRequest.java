// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** Get a file */
@Generated
@JsonSerialize(using = GetFileRequest.GetFileRequestSerializer.class)
@JsonDeserialize(using = GetFileRequest.GetFileRequestDeserializer.class)
public class GetFileRequest {
  /** */
  private String fileId;

  public GetFileRequest setFileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  public String getFileId() {
    return fileId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetFileRequest that = (GetFileRequest) o;
    return Objects.equals(fileId, that.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetFileRequest.class).add("fileId", fileId).toString();
  }

  GetFileRequestPb toPb() {
    GetFileRequestPb pb = new GetFileRequestPb();
    pb.setFileId(fileId);

    return pb;
  }

  static GetFileRequest fromPb(GetFileRequestPb pb) {
    GetFileRequest model = new GetFileRequest();
    model.setFileId(pb.getFileId());

    return model;
  }

  public static class GetFileRequestSerializer extends JsonSerializer<GetFileRequest> {
    @Override
    public void serialize(GetFileRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetFileRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetFileRequestDeserializer extends JsonDeserializer<GetFileRequest> {
    @Override
    public GetFileRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetFileRequestPb pb = mapper.readValue(p, GetFileRequestPb.class);
      return GetFileRequest.fromPb(pb);
    }
  }
}
