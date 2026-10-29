// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for a task that runs the `ai_extract` function.
 *
 * <p>The fields to extract come from exactly one of two places: an existing AI Extract agent, named
 * by `agent_id`, or the inline `schema` and `instructions`. Set `agent_id` or the inline fields,
 * not both.
 */
@Generated
public class AiExtractFunction {
  /** When true, includes citation metadata locating each extracted value in the source. */
  @JsonProperty("enable_citations")
  private Boolean enableCitations;

  /** When true, includes a per-field confidence score in the response. */
  @JsonProperty("enable_confidence_scores")
  private Boolean enableConfidenceScores;

  /**
   * Global description of the task and domain, passed to the model to improve extraction quality.
   */
  @JsonProperty("instructions")
  private String instructions;

  /** The extraction mode. Defaults to standard extraction when unspecified. */
  @JsonProperty("mode")
  private AiExtractFunctionMode mode;

  /**
   * The extraction schema defining the fields to extract, as a JSON string. Either an array of
   * field names (e.g. ["company", "valuation"]) or an object mapping each field name to a type and
   * an optional description. Supported types are string, integer, number, boolean, enum, object,
   * and array; all fields are optional.
   */
  @JsonProperty("schema")
  private String schema;

  /** The ai_extract function version to invoke (for example, `2.1`). */
  @JsonProperty("version")
  private String version;

  public AiExtractFunction setEnableCitations(Boolean enableCitations) {
    this.enableCitations = enableCitations;
    return this;
  }

  public Boolean getEnableCitations() {
    return enableCitations;
  }

  public AiExtractFunction setEnableConfidenceScores(Boolean enableConfidenceScores) {
    this.enableConfidenceScores = enableConfidenceScores;
    return this;
  }

  public Boolean getEnableConfidenceScores() {
    return enableConfidenceScores;
  }

  public AiExtractFunction setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public AiExtractFunction setMode(AiExtractFunctionMode mode) {
    this.mode = mode;
    return this;
  }

  public AiExtractFunctionMode getMode() {
    return mode;
  }

  public AiExtractFunction setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public AiExtractFunction setVersion(String version) {
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
    AiExtractFunction that = (AiExtractFunction) o;
    return Objects.equals(enableCitations, that.enableCitations)
        && Objects.equals(enableConfidenceScores, that.enableConfidenceScores)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(mode, that.mode)
        && Objects.equals(schema, that.schema)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        enableCitations, enableConfidenceScores, instructions, mode, schema, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AiExtractFunction.class)
        .add("enableCitations", enableCitations)
        .add("enableConfidenceScores", enableConfidenceScores)
        .add("instructions", instructions)
        .add("mode", mode)
        .add("schema", schema)
        .add("version", version)
        .toString();
  }
}
