// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An expression that introspects tags at query time. */
@Generated
public class TagIntrospectionExpression {
  /** Extracts the value of a column-level tag. */
  @JsonProperty("column_tag_value")
  private ColumnTagValueExtraction columnTagValue;

  /** Extracts the value of a securable-level tag. */
  @JsonProperty("tag_value")
  private TagValueExtraction tagValue;

  public TagIntrospectionExpression setColumnTagValue(ColumnTagValueExtraction columnTagValue) {
    this.columnTagValue = columnTagValue;
    return this;
  }

  public ColumnTagValueExtraction getColumnTagValue() {
    return columnTagValue;
  }

  public TagIntrospectionExpression setTagValue(TagValueExtraction tagValue) {
    this.tagValue = tagValue;
    return this;
  }

  public TagValueExtraction getTagValue() {
    return tagValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagIntrospectionExpression that = (TagIntrospectionExpression) o;
    return Objects.equals(columnTagValue, that.columnTagValue)
        && Objects.equals(tagValue, that.tagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnTagValue, tagValue);
  }

  @Override
  public String toString() {
    return new ToStringer(TagIntrospectionExpression.class)
        .add("columnTagValue", columnTagValue)
        .add("tagValue", tagValue)
        .toString();
  }
}
