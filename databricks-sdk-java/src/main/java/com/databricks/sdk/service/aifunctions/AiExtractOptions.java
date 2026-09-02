// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** ai_extract */
@Generated
public class AiExtractOptions {
  /**
   * When true, includes citation metadata locating each extracted value in the source. Depending on
   * the type of input, citations can be one of two types:
   *
   * <p>For raw text (STRING) inputs, a citation is a span of text in the original input. Each
   * object in `metadata.citations` has an `id` (integer matching a `citation_ids` entry on a
   * field), a `start` (inclusive 0-based character offset into the input string), and a `stop`
   * (exclusive 0-based character offset into the input string).
   *
   * <p>For PDF documents and images (when using ai_extract downstream of ai_parse_document), a
   * citation is a bounding box in the original input. Each object in `metadata.citations` has an
   * `id` (integer matching a `citation_ids` entry on a field) and a `bbox` (array of {coord,
   * page_id} objects, identical in shape to element.bbox in ai_parse_document output; coord is
   * pixel coordinates on the page image as [x0, y0, x1, y1], and page_id is a 0-based page index).
   */
  @JsonProperty("enable_citations")
  private Boolean enableCitations;

  /** When true, includes a per-field confidence score in the response. */
  @JsonProperty("enable_confidence_scores")
  private Boolean enableConfidenceScores;

  /** Natural-language guidance that steers how data is extracted (up to 20,000 characters). */
  @JsonProperty("instructions")
  private String instructions;

  /**
   * Extraction mode. Supported modes: "precision" — more powerful extraction for complex schemas,
   * long documents, and reasoning-heavy extractions. Defaults to none (standard extraction).
   */
  @JsonProperty("mode")
  private String mode;

  /**
   * The function version to invoke. Defaults to the latest version. Supported versions: ["2.1"].
   */
  @JsonProperty("version")
  private String version;

  public AiExtractOptions setEnableCitations(Boolean enableCitations) {
    this.enableCitations = enableCitations;
    return this;
  }

  public Boolean getEnableCitations() {
    return enableCitations;
  }

  public AiExtractOptions setEnableConfidenceScores(Boolean enableConfidenceScores) {
    this.enableConfidenceScores = enableConfidenceScores;
    return this;
  }

  public Boolean getEnableConfidenceScores() {
    return enableConfidenceScores;
  }

  public AiExtractOptions setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public AiExtractOptions setMode(String mode) {
    this.mode = mode;
    return this;
  }

  public String getMode() {
    return mode;
  }

  public AiExtractOptions setVersion(String version) {
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
    AiExtractOptions that = (AiExtractOptions) o;
    return Objects.equals(enableCitations, that.enableCitations)
        && Objects.equals(enableConfidenceScores, that.enableConfidenceScores)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(mode, that.mode)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableCitations, enableConfidenceScores, instructions, mode, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AiExtractOptions.class)
        .add("enableCitations", enableCitations)
        .add("enableConfidenceScores", enableConfidenceScores)
        .add("instructions", instructions)
        .add("mode", mode)
        .add("version", version)
        .toString();
  }
}
