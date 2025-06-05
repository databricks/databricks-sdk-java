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
@JsonSerialize(using = CreateFileRequest.CreateFileRequestSerializer.class)
@JsonDeserialize(using = CreateFileRequest.CreateFileRequestDeserializer.class)
public class CreateFileRequest {
  /** */
  private String displayName;

  /** */
  private FileParent fileParent;

  /** */
  private MarketplaceFileType marketplaceFileType;

  /** */
  private String mimeType;

  public CreateFileRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateFileRequest setFileParent(FileParent fileParent) {
    this.fileParent = fileParent;
    return this;
  }

  public FileParent getFileParent() {
    return fileParent;
  }

  public CreateFileRequest setMarketplaceFileType(MarketplaceFileType marketplaceFileType) {
    this.marketplaceFileType = marketplaceFileType;
    return this;
  }

  public MarketplaceFileType getMarketplaceFileType() {
    return marketplaceFileType;
  }

  public CreateFileRequest setMimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  public String getMimeType() {
    return mimeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFileRequest that = (CreateFileRequest) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(fileParent, that.fileParent)
        && Objects.equals(marketplaceFileType, that.marketplaceFileType)
        && Objects.equals(mimeType, that.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, fileParent, marketplaceFileType, mimeType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFileRequest.class)
        .add("displayName", displayName)
        .add("fileParent", fileParent)
        .add("marketplaceFileType", marketplaceFileType)
        .add("mimeType", mimeType)
        .toString();
  }

  CreateFileRequestPb toPb() {
    CreateFileRequestPb pb = new CreateFileRequestPb();
    pb.setDisplayName(displayName);
    pb.setFileParent(fileParent);
    pb.setMarketplaceFileType(marketplaceFileType);
    pb.setMimeType(mimeType);

    return pb;
  }

  static CreateFileRequest fromPb(CreateFileRequestPb pb) {
    CreateFileRequest model = new CreateFileRequest();
    model.setDisplayName(pb.getDisplayName());
    model.setFileParent(pb.getFileParent());
    model.setMarketplaceFileType(pb.getMarketplaceFileType());
    model.setMimeType(pb.getMimeType());

    return model;
  }

  public static class CreateFileRequestSerializer extends JsonSerializer<CreateFileRequest> {
    @Override
    public void serialize(CreateFileRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateFileRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateFileRequestDeserializer extends JsonDeserializer<CreateFileRequest> {
    @Override
    public CreateFileRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateFileRequestPb pb = mapper.readValue(p, CreateFileRequestPb.class);
      return CreateFileRequest.fromPb(pb);
    }
  }
}
