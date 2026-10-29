// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Configuration for a task that runs the `ai_parse_document` function. */
@Generated
public class AiParseDocumentFunction {
  /**
   * Element types to generate AI descriptions for. Leave empty to generate no descriptions; use ALL
   * for every supported type, or list specific types to restrict generation to only those.
   */
  @JsonProperty("description_element_types")
  private Collection<AiParseDocumentFunctionDescriptionElementType> descriptionElementTypes;

  /** Unity Catalog volume path where rendered page and element images are written. */
  @JsonProperty("image_output_path")
  private String imageOutputPath;

  /**
   * Pages to parse (1-indexed), as a comma-separated list of page numbers or ranges (e.g.
   * "1,3,5-10").
   */
  @JsonProperty("page_range")
  private String pageRange;

  /** The ai_parse_document output schema version to invoke (for example, `2.0`). */
  @JsonProperty("version")
  private String version;

  public AiParseDocumentFunction setDescriptionElementTypes(
      Collection<AiParseDocumentFunctionDescriptionElementType> descriptionElementTypes) {
    this.descriptionElementTypes = descriptionElementTypes;
    return this;
  }

  public Collection<AiParseDocumentFunctionDescriptionElementType> getDescriptionElementTypes() {
    return descriptionElementTypes;
  }

  public AiParseDocumentFunction setImageOutputPath(String imageOutputPath) {
    this.imageOutputPath = imageOutputPath;
    return this;
  }

  public String getImageOutputPath() {
    return imageOutputPath;
  }

  public AiParseDocumentFunction setPageRange(String pageRange) {
    this.pageRange = pageRange;
    return this;
  }

  public String getPageRange() {
    return pageRange;
  }

  public AiParseDocumentFunction setVersion(String version) {
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
    AiParseDocumentFunction that = (AiParseDocumentFunction) o;
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
    return new ToStringer(AiParseDocumentFunction.class)
        .add("descriptionElementTypes", descriptionElementTypes)
        .add("imageOutputPath", imageOutputPath)
        .add("pageRange", pageRange)
        .add("version", version)
        .toString();
  }
}
