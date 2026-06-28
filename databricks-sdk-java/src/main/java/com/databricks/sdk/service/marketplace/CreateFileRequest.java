// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFileRequest {
  /** */
  @JsonProperty("display_name")
  private String displayName;

  /** */
  @JsonProperty("file_parent")
  private FileParent fileParent;

  /** */
  @JsonProperty("marketplace_file_type")
  private MarketplaceFileType marketplaceFileType;

  /** */
  @JsonProperty("mime_type")
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
}
