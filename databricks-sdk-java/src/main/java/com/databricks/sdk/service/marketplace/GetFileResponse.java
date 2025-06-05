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

@Generated
@JsonSerialize(using = GetFileResponse.GetFileResponseSerializer.class)
@JsonDeserialize(using = GetFileResponse.GetFileResponseDeserializer.class)
public class GetFileResponse {
  /** */
  private FileInfo fileInfo;

  public GetFileResponse setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

  public FileInfo getFileInfo() {
    return fileInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetFileResponse that = (GetFileResponse) o;
    return Objects.equals(fileInfo, that.fileInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(GetFileResponse.class).add("fileInfo", fileInfo).toString();
  }

  GetFileResponsePb toPb() {
    GetFileResponsePb pb = new GetFileResponsePb();
    pb.setFileInfo(fileInfo);

    return pb;
  }

  static GetFileResponse fromPb(GetFileResponsePb pb) {
    GetFileResponse model = new GetFileResponse();
    model.setFileInfo(pb.getFileInfo());

    return model;
  }

  public static class GetFileResponseSerializer extends JsonSerializer<GetFileResponse> {
    @Override
    public void serialize(GetFileResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetFileResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetFileResponseDeserializer extends JsonDeserializer<GetFileResponse> {
    @Override
    public GetFileResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetFileResponsePb pb = mapper.readValue(p, GetFileResponsePb.class);
      return GetFileResponse.fromPb(pb);
    }
  }
}
