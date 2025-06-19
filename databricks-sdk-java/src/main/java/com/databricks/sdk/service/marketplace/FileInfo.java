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
@JsonSerialize(using = FileInfo.FileInfoSerializer.class)
@JsonDeserialize(using = FileInfo.FileInfoDeserializer.class)
public class FileInfo {
  /** */
  private Long createdAt;

  /** Name displayed to users for applicable files, e.g. embedded notebooks */
  private String displayName;

  /** */
  private String downloadLink;

  /** */
  private FileParent fileParent;

  /** */
  private String id;

  /** */
  private MarketplaceFileType marketplaceFileType;

  /** */
  private String mimeType;

  /** */
  private FileStatus status;

  /** Populated if status is in a failed state with more information on reason for the failure. */
  private String statusMessage;

  /** */
  private Long updatedAt;

  public FileInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public FileInfo setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public FileInfo setDownloadLink(String downloadLink) {
    this.downloadLink = downloadLink;
    return this;
  }

  public String getDownloadLink() {
    return downloadLink;
  }

  public FileInfo setFileParent(FileParent fileParent) {
    this.fileParent = fileParent;
    return this;
  }

  public FileParent getFileParent() {
    return fileParent;
  }

  public FileInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public FileInfo setMarketplaceFileType(MarketplaceFileType marketplaceFileType) {
    this.marketplaceFileType = marketplaceFileType;
    return this;
  }

  public MarketplaceFileType getMarketplaceFileType() {
    return marketplaceFileType;
  }

  public FileInfo setMimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  public String getMimeType() {
    return mimeType;
  }

  public FileInfo setStatus(FileStatus status) {
    this.status = status;
    return this;
  }

  public FileStatus getStatus() {
    return status;
  }

  public FileInfo setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public FileInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileInfo that = (FileInfo) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(downloadLink, that.downloadLink)
        && Objects.equals(fileParent, that.fileParent)
        && Objects.equals(id, that.id)
        && Objects.equals(marketplaceFileType, that.marketplaceFileType)
        && Objects.equals(mimeType, that.mimeType)
        && Objects.equals(status, that.status)
        && Objects.equals(statusMessage, that.statusMessage)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        displayName,
        downloadLink,
        fileParent,
        id,
        marketplaceFileType,
        mimeType,
        status,
        statusMessage,
        updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(FileInfo.class)
        .add("createdAt", createdAt)
        .add("displayName", displayName)
        .add("downloadLink", downloadLink)
        .add("fileParent", fileParent)
        .add("id", id)
        .add("marketplaceFileType", marketplaceFileType)
        .add("mimeType", mimeType)
        .add("status", status)
        .add("statusMessage", statusMessage)
        .add("updatedAt", updatedAt)
        .toString();
  }

  FileInfoPb toPb() {
    FileInfoPb pb = new FileInfoPb();
    pb.setCreatedAt(createdAt);
    pb.setDisplayName(displayName);
    pb.setDownloadLink(downloadLink);
    pb.setFileParent(fileParent);
    pb.setId(id);
    pb.setMarketplaceFileType(marketplaceFileType);
    pb.setMimeType(mimeType);
    pb.setStatus(status);
    pb.setStatusMessage(statusMessage);
    pb.setUpdatedAt(updatedAt);

    return pb;
  }

  static FileInfo fromPb(FileInfoPb pb) {
    FileInfo model = new FileInfo();
    model.setCreatedAt(pb.getCreatedAt());
    model.setDisplayName(pb.getDisplayName());
    model.setDownloadLink(pb.getDownloadLink());
    model.setFileParent(pb.getFileParent());
    model.setId(pb.getId());
    model.setMarketplaceFileType(pb.getMarketplaceFileType());
    model.setMimeType(pb.getMimeType());
    model.setStatus(pb.getStatus());
    model.setStatusMessage(pb.getStatusMessage());
    model.setUpdatedAt(pb.getUpdatedAt());

    return model;
  }

  public static class FileInfoSerializer extends JsonSerializer<FileInfo> {
    @Override
    public void serialize(FileInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FileInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FileInfoDeserializer extends JsonDeserializer<FileInfo> {
    @Override
    public FileInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FileInfoPb pb = mapper.readValue(p, FileInfoPb.class);
      return FileInfo.fromPb(pb);
    }
  }
}
