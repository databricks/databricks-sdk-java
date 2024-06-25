// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ProviderIconFile {
  /** */
  @JsonProperty("icon_file_id")
  private String iconFileId;

  /** */
  @JsonProperty("icon_file_path")
  private String iconFilePath;

  /** */
  @JsonProperty("icon_type")
  private ProviderIconType iconType;

  public ProviderIconFile setIconFileId(String iconFileId) {
    this.iconFileId = iconFileId;
    return this;
  }

  public String getIconFileId() {
    return iconFileId;
  }

  public ProviderIconFile setIconFilePath(String iconFilePath) {
    this.iconFilePath = iconFilePath;
    return this;
  }

  public String getIconFilePath() {
    return iconFilePath;
  }

  public ProviderIconFile setIconType(ProviderIconType iconType) {
    this.iconType = iconType;
    return this;
  }

  public ProviderIconType getIconType() {
    return iconType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProviderIconFile that = (ProviderIconFile) o;
    return Objects.equals(iconFileId, that.iconFileId)
        && Objects.equals(iconFilePath, that.iconFilePath)
        && Objects.equals(iconType, that.iconType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconFileId, iconFilePath, iconType);
  }

  @Override
  public String toString() {
    return new ToStringer(ProviderIconFile.class)
        .add("iconFileId", iconFileId)
        .add("iconFilePath", iconFilePath)
        .add("iconType", iconType)
        .toString();
  }
}
