// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** What to record in each signal that this rule generates. */
@Generated
public class RuleOutput {
  /**
   * Key/value context to record from the input row. Values may contain SQL expressions in braces.
   */
  @JsonProperty("context")
  private Map<String, String> context;

  /**
   * If true, also record every column of the triggering input row. Custom context wins on key
   * collision.
   */
  @JsonProperty("default_context")
  private Boolean defaultContext;

  /** Column in the rule output that holds the event timestamp. */
  @JsonProperty("event_time_column")
  private String eventTimeColumn;

  /**
   * Signal summary. May contain SQL expressions in braces that the server substitutes from the
   * input row.
   */
  @JsonProperty("summary")
  private String summary;

  public RuleOutput setContext(Map<String, String> context) {
    this.context = context;
    return this;
  }

  public Map<String, String> getContext() {
    return context;
  }

  public RuleOutput setDefaultContext(Boolean defaultContext) {
    this.defaultContext = defaultContext;
    return this;
  }

  public Boolean getDefaultContext() {
    return defaultContext;
  }

  public RuleOutput setEventTimeColumn(String eventTimeColumn) {
    this.eventTimeColumn = eventTimeColumn;
    return this;
  }

  public String getEventTimeColumn() {
    return eventTimeColumn;
  }

  public RuleOutput setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public String getSummary() {
    return summary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RuleOutput that = (RuleOutput) o;
    return Objects.equals(context, that.context)
        && Objects.equals(defaultContext, that.defaultContext)
        && Objects.equals(eventTimeColumn, that.eventTimeColumn)
        && Objects.equals(summary, that.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, defaultContext, eventTimeColumn, summary);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleOutput.class)
        .add("context", context)
        .add("defaultContext", defaultContext)
        .add("eventTimeColumn", eventTimeColumn)
        .add("summary", summary)
        .toString();
  }
}
