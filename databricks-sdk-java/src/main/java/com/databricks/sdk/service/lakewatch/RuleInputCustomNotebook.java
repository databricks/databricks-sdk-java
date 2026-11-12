// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** Reference to a custom-user-function notebook for scheduled detection input. */
@Generated
public class RuleInputCustomNotebook {
  /**
   * Fully-qualified notebook path, or a path relative to the configured base notebook directory.
   */
  @JsonProperty("notebook")
  private String notebook;

  /** Optional arguments supplied when invoking the custom function. */
  @JsonProperty("options")
  private Map<String, String> options;

  public RuleInputCustomNotebook setNotebook(String notebook) {
    this.notebook = notebook;
    return this;
  }

  public String getNotebook() {
    return notebook;
  }

  public RuleInputCustomNotebook setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RuleInputCustomNotebook that = (RuleInputCustomNotebook) o;
    return Objects.equals(notebook, that.notebook) && Objects.equals(options, that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebook, options);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleInputCustomNotebook.class)
        .add("notebook", notebook)
        .add("options", options)
        .toString();
  }
}
