// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Settings for one column of a table or metric view. */
@Generated
public class GenieAgentColumnConfig {
  /** The name of the column. Must exist in the table or metric view. */
  @JsonProperty("column")
  private String column;

  /** Description of the column, overriding its Unity Catalog comment. */
  @JsonProperty("description")
  private String description;

  /**
   * Display name of the column in the Genie Agent. Accepted only where column display names are
   * enabled for the workspace.
   */
  @JsonProperty("display_name")
  private String displayName;

  /** Whether the Genie Agent indexes the column's values to match them in questions. */
  @JsonProperty("enable_entity_matching")
  private Boolean enableEntityMatching;

  /** Whether the Genie Agent samples example values from the column to learn its format. */
  @JsonProperty("enable_format_assistance")
  private Boolean enableFormatAssistance;

  /** Whether the column is hidden from the Genie Agent. */
  @JsonProperty("exclude")
  private Boolean exclude;

  /** Synonyms for the column name. */
  @JsonProperty("synonyms")
  private Collection<String> synonyms;

  public GenieAgentColumnConfig setColumn(String column) {
    this.column = column;
    return this;
  }

  public String getColumn() {
    return column;
  }

  public GenieAgentColumnConfig setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieAgentColumnConfig setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public GenieAgentColumnConfig setEnableEntityMatching(Boolean enableEntityMatching) {
    this.enableEntityMatching = enableEntityMatching;
    return this;
  }

  public Boolean getEnableEntityMatching() {
    return enableEntityMatching;
  }

  public GenieAgentColumnConfig setEnableFormatAssistance(Boolean enableFormatAssistance) {
    this.enableFormatAssistance = enableFormatAssistance;
    return this;
  }

  public Boolean getEnableFormatAssistance() {
    return enableFormatAssistance;
  }

  public GenieAgentColumnConfig setExclude(Boolean exclude) {
    this.exclude = exclude;
    return this;
  }

  public Boolean getExclude() {
    return exclude;
  }

  public GenieAgentColumnConfig setSynonyms(Collection<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public Collection<String> getSynonyms() {
    return synonyms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentColumnConfig that = (GenieAgentColumnConfig) o;
    return Objects.equals(column, that.column)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(enableEntityMatching, that.enableEntityMatching)
        && Objects.equals(enableFormatAssistance, that.enableFormatAssistance)
        && Objects.equals(exclude, that.exclude)
        && Objects.equals(synonyms, that.synonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        column,
        description,
        displayName,
        enableEntityMatching,
        enableFormatAssistance,
        exclude,
        synonyms);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentColumnConfig.class)
        .add("column", column)
        .add("description", description)
        .add("displayName", displayName)
        .add("enableEntityMatching", enableEntityMatching)
        .add("enableFormatAssistance", enableFormatAssistance)
        .add("exclude", exclude)
        .add("synonyms", synonyms)
        .toString();
  }
}
