// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MatchColumn {
  /** Optional alias of the matched column. */
  @JsonProperty("alias")
  private String alias;

  /** The condition expression used to match a table column. */
  @JsonProperty("condition")
  private String condition;

  public MatchColumn setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public MatchColumn setCondition(String condition) {
    this.condition = condition;
    return this;
  }

  public String getCondition() {
    return condition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MatchColumn that = (MatchColumn) o;
    return Objects.equals(alias, that.alias) && Objects.equals(condition, that.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, condition);
  }

  @Override
  public String toString() {
    return new ToStringer(MatchColumn.class)
        .add("alias", alias)
        .add("condition", condition)
        .toString();
  }
}
