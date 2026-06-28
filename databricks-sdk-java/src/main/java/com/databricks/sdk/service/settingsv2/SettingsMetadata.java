// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SettingsMetadata {
  /** Setting description for what this setting controls */
  @JsonProperty("description")
  private String description;

  /**
   * Human-readable display name for the setting or feature preview. This field may be unset if no
   * display name is available.
   */
  @JsonProperty("display_name")
  private String displayName;

  /** Link to databricks documentation for the setting */
  @JsonProperty("docs_link")
  private String docsLink;

  /** Name of the setting. */
  @JsonProperty("name")
  private String name;

  /** Preview phase for feature preview settings. This field is not set for non-preview settings. */
  @JsonProperty("preview_phase")
  private PreviewPhase previewPhase;

  /**
   * Sample message depicting the type of the setting. To set this setting, the value sent must
   * match this type.
   */
  @JsonProperty("type")
  private String typeValue;

  public SettingsMetadata setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public SettingsMetadata setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public SettingsMetadata setDocsLink(String docsLink) {
    this.docsLink = docsLink;
    return this;
  }

  public String getDocsLink() {
    return docsLink;
  }

  public SettingsMetadata setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SettingsMetadata setPreviewPhase(PreviewPhase previewPhase) {
    this.previewPhase = previewPhase;
    return this;
  }

  public PreviewPhase getPreviewPhase() {
    return previewPhase;
  }

  public SettingsMetadata setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SettingsMetadata that = (SettingsMetadata) o;
    return Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(docsLink, that.docsLink)
        && Objects.equals(name, that.name)
        && Objects.equals(previewPhase, that.previewPhase)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, docsLink, name, previewPhase, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(SettingsMetadata.class)
        .add("description", description)
        .add("displayName", displayName)
        .add("docsLink", docsLink)
        .add("name", name)
        .add("previewPhase", previewPhase)
        .add("typeValue", typeValue)
        .toString();
  }
}
