// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Native V2 streaming input for a detection rule: one Delta table and one stateless row predicate.
 * The complete source row is preserved as event context.
 */
@Generated
public class RuleInputStreaming {
  /** Row predicate that selects matching rows. */
  @JsonProperty("predicate")
  private StreamingPredicate predicate;

  /** Source table whose rows are evaluated. */
  @JsonProperty("source")
  private StreamingSource source;

  public RuleInputStreaming setPredicate(StreamingPredicate predicate) {
    this.predicate = predicate;
    return this;
  }

  public StreamingPredicate getPredicate() {
    return predicate;
  }

  public RuleInputStreaming setSource(StreamingSource source) {
    this.source = source;
    return this;
  }

  public StreamingSource getSource() {
    return source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RuleInputStreaming that = (RuleInputStreaming) o;
    return Objects.equals(predicate, that.predicate) && Objects.equals(source, that.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicate, source);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleInputStreaming.class)
        .add("predicate", predicate)
        .add("source", source)
        .toString();
  }
}
