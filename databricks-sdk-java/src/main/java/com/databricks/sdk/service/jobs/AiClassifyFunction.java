// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for a task that runs the `ai_classify` function.
 *
 * <p>The label set comes from exactly one of two places: `inline_labels`, which holds up to 10
 * labels, or a Unity Catalog table named by `label_table`. Use `label_table` for a larger label
 * set.
 */
@Generated
public class AiClassifyFunction {
  /** When true, includes a per-label confidence score in the response. */
  @JsonProperty("enable_confidence_scores")
  private Boolean enableConfidenceScores;

  /** When true, includes a rationale explaining each classification in the response. */
  @JsonProperty("enable_rationales")
  private Boolean enableRationales;

  /** Labels listed inline, for a small label set. */
  @JsonProperty("inline_labels")
  private AiClassifyFunctionInlineLabels inlineLabels;

  /**
   * Global description of the task and domain, passed to the model to improve classification
   * quality.
   */
  @JsonProperty("instructions")
  private String instructions;

  /** When true, more than one label can be returned for each input. */
  @JsonProperty("multilabel")
  private Boolean multilabel;

  /** The ai_classify function version to invoke (for example, `2.1`). */
  @JsonProperty("version")
  private String version;

  public AiClassifyFunction setEnableConfidenceScores(Boolean enableConfidenceScores) {
    this.enableConfidenceScores = enableConfidenceScores;
    return this;
  }

  public Boolean getEnableConfidenceScores() {
    return enableConfidenceScores;
  }

  public AiClassifyFunction setEnableRationales(Boolean enableRationales) {
    this.enableRationales = enableRationales;
    return this;
  }

  public Boolean getEnableRationales() {
    return enableRationales;
  }

  public AiClassifyFunction setInlineLabels(AiClassifyFunctionInlineLabels inlineLabels) {
    this.inlineLabels = inlineLabels;
    return this;
  }

  public AiClassifyFunctionInlineLabels getInlineLabels() {
    return inlineLabels;
  }

  public AiClassifyFunction setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public AiClassifyFunction setMultilabel(Boolean multilabel) {
    this.multilabel = multilabel;
    return this;
  }

  public Boolean getMultilabel() {
    return multilabel;
  }

  public AiClassifyFunction setVersion(String version) {
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
    AiClassifyFunction that = (AiClassifyFunction) o;
    return Objects.equals(enableConfidenceScores, that.enableConfidenceScores)
        && Objects.equals(enableRationales, that.enableRationales)
        && Objects.equals(inlineLabels, that.inlineLabels)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(multilabel, that.multilabel)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        enableConfidenceScores, enableRationales, inlineLabels, instructions, multilabel, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AiClassifyFunction.class)
        .add("enableConfidenceScores", enableConfidenceScores)
        .add("enableRationales", enableRationales)
        .add("inlineLabels", inlineLabels)
        .add("instructions", instructions)
        .add("multilabel", multilabel)
        .add("version", version)
        .toString();
  }
}
