// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * we can not use just ProviderListingSummary since we already have same name on entity side of the
 * state
 */
@Generated
public class ProviderListingSummaryInfo {
  /** */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("icon_files")
  private Collection<ProviderIconFile> iconFiles;

  /** */
  @JsonProperty("name")
  private String name;

  public ProviderListingSummaryInfo setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ProviderListingSummaryInfo setIconFiles(Collection<ProviderIconFile> iconFiles) {
    this.iconFiles = iconFiles;
    return this;
  }

  public Collection<ProviderIconFile> getIconFiles() {
    return iconFiles;
  }

  public ProviderListingSummaryInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProviderListingSummaryInfo that = (ProviderListingSummaryInfo) o;
    return Objects.equals(description, that.description)
        && Objects.equals(iconFiles, that.iconFiles)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iconFiles, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ProviderListingSummaryInfo.class)
        .add("description", description)
        .add("iconFiles", iconFiles)
        .add("name", name)
        .toString();
  }
}
