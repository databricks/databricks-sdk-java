// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** ai_parse_document */
@Generated
public class AiParseDocumentOptions {
  /**
   * Element types for which an AI-generated description is produced. Use "*" (default) to generate
   * descriptions for all supported element types, "figure" to generate them for figures only, or ""
   * (empty string) to generate none. Only figure descriptions are supported for version "2.0", so
   * "*" and "figure" produce the same behavior.
   */
  @JsonProperty("description_element_types")
  private String descriptionElementTypes;

  /** Unity Catalog volume path where rendered page and element images are written. */
  @JsonProperty("image_output_path")
  private String imageOutputPath;

  /**
   * Pages to parse (1-indexed), as a comma-separated list of page numbers or ranges (e.g.
   * "1,3,5-10").
   */
  @JsonProperty("page_range")
  private String pageRange;

  /** The ai_parse_document output schema version. Supported value: "2.0". */
  @JsonProperty("version")
  private String version;

  public AiParseDocumentOptions setDescriptionElementTypes(String descriptionElementTypes) {
    this.descriptionElementTypes = descriptionElementTypes;
    return this;
  }

  public String getDescriptionElementTypes() {
    return descriptionElementTypes;
  }

  public AiParseDocumentOptions setImageOutputPath(String imageOutputPath) {
    this.imageOutputPath = imageOutputPath;
    return this;
  }

  public String getImageOutputPath() {
    return imageOutputPath;
  }

  public AiParseDocumentOptions setPageRange(String pageRange) {
    this.pageRange = pageRange;
    return this;
  }

  public String getPageRange() {
    return pageRange;
  }

  public AiParseDocumentOptions setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiParseDocumentOptions that = (AiParseDocumentOptions) o;
    return Objects.equals(descriptionElementTypes, that.descriptionElementTypes)
        && Objects.equals(imageOutputPath, that.imageOutputPath)
        && Objects.equals(pageRange, that.pageRange)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionElementTypes, imageOutputPath, pageRange, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AiParseDocumentOptions.class)
        .add("descriptionElementTypes", descriptionElementTypes)
        .add("imageOutputPath", imageOutputPath)
        .add("pageRange", pageRange)
        .add("version", version)
        .toString();
  }
}
