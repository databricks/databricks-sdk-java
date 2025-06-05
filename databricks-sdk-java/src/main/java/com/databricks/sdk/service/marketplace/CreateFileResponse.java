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
@JsonSerialize(using = CreateFileResponse.CreateFileResponseSerializer.class)
@JsonDeserialize(using = CreateFileResponse.CreateFileResponseDeserializer.class)
public class CreateFileResponse {
  /** */
  private FileInfo fileInfo;

  /** Pre-signed POST URL to blob storage */
  private String uploadUrl;

  public CreateFileResponse setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public CreateFileResponse setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  public String getUploadUrl() {
    return uploadUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFileResponse that = (CreateFileResponse) o;
    return Objects.equals(fileInfo, that.fileInfo) && Objects.equals(uploadUrl, that.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, uploadUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFileResponse.class)
        .add("fileInfo", fileInfo)
        .add("uploadUrl", uploadUrl)
        .toString();
  }

  CreateFileResponsePb toPb() {
    CreateFileResponsePb pb = new CreateFileResponsePb();
    pb.setFileInfo(fileInfo);
    pb.setUploadUrl(uploadUrl);

    return pb;
  }

  static CreateFileResponse fromPb(CreateFileResponsePb pb) {
    CreateFileResponse model = new CreateFileResponse();
    model.setFileInfo(pb.getFileInfo());
    model.setUploadUrl(pb.getUploadUrl());

    return model;
  }

  public static class CreateFileResponseSerializer extends JsonSerializer<CreateFileResponse> {
    @Override
    public void serialize(CreateFileResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateFileResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateFileResponseDeserializer extends JsonDeserializer<CreateFileResponse> {
    @Override
    public CreateFileResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateFileResponsePb pb = mapper.readValue(p, CreateFileResponsePb.class);
      return CreateFileResponse.fromPb(pb);
    }
  }
}
