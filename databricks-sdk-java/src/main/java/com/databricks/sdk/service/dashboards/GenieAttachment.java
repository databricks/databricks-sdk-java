// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Genie AI Response */
@Generated
public class GenieAttachment {
  /** */
  @JsonProperty("query")
  private QueryAttachment query;

  /** */
  @JsonProperty("text")
  private TextAttachment text;

  public GenieAttachment setQuery(QueryAttachment query) {
    this.query = query;
    return this;
  }

  public QueryAttachment getQuery() {
    return query;
  }

  public GenieAttachment setText(TextAttachment text) {
    this.text = text;
    return this;
  }

  public TextAttachment getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAttachment that = (GenieAttachment) o;
    return Objects.equals(query, that.query) && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, text);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAttachment.class).add("query", query).add("text", text).toString();
  }
}
