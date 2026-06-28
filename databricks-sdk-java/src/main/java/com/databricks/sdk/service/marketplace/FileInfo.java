// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FileInfo {
  /** */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Name displayed to users for applicable files, e.g. embedded notebooks */
  @JsonProperty("display_name")
  private String displayName;

  /** */
  @JsonProperty("download_link")
  private String downloadLink;

  /** */
  @JsonProperty("file_parent")
  private FileParent fileParent;

  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("marketplace_file_type")
  private MarketplaceFileType marketplaceFileType;

  /** */
  @JsonProperty("mime_type")
  private String mimeType;

  /** */
  @JsonProperty("status")
  private FileStatus status;

  /** Populated if status is in a failed state with more information on reason for the failure. */
  @JsonProperty("status_message")
  private String statusMessage;

  /** */
  @JsonProperty("updated_at")
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
}
