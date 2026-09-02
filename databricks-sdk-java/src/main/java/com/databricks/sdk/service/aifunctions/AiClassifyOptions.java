// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** ai_classify */
@Generated
public class AiClassifyOptions {
  /** When true, includes a per-label confidence score in the response. */
  @JsonProperty("enable_confidence_scores")
  private Boolean enableConfidenceScores;

  /** When true, includes a rationale explaining each classification in the response. */
  @JsonProperty("enable_rationales")
  private Boolean enableRationales;

  /** Natural-language guidance that steers how the text is classified (up to 20,000 characters). */
  @JsonProperty("instructions")
  private String instructions;

  /** When true, allows more than one label to be returned per input. */
  @JsonProperty("multilabel")
  private Boolean multilabel;

  /**
   * The function version to invoke. Defaults to the latest version. Supported versions: ["2.1"].
   */
  @JsonProperty("version")
  private String version;

  public AiClassifyOptions setEnableConfidenceScores(Boolean enableConfidenceScores) {
    this.enableConfidenceScores = enableConfidenceScores;
    return this;
  }

  public Boolean getEnableConfidenceScores() {
    return enableConfidenceScores;
  }

  public AiClassifyOptions setEnableRationales(Boolean enableRationales) {
    this.enableRationales = enableRationales;
    return this;
  }

  public Boolean getEnableRationales() {
    return enableRationales;
  }

  public AiClassifyOptions setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public AiClassifyOptions setMultilabel(Boolean multilabel) {
    this.multilabel = multilabel;
    return this;
  }

  public Boolean getMultilabel() {
    return multilabel;
  }

  public AiClassifyOptions setVersion(String version) {
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
    AiClassifyOptions that = (AiClassifyOptions) o;
    return Objects.equals(enableConfidenceScores, that.enableConfidenceScores)
        && Objects.equals(enableRationales, that.enableRationales)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(multilabel, that.multilabel)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        enableConfidenceScores, enableRationales, instructions, multilabel, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AiClassifyOptions.class)
        .add("enableConfidenceScores", enableConfidenceScores)
        .add("enableRationales", enableRationales)
        .add("instructions", instructions)
        .add("multilabel", multilabel)
        .add("version", version)
        .toString();
  }
}
