// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Extracts the value of a column-level tag: get_column_tag_value(col, "tagKey"). */
@Generated
public class ColumnTagValueExtraction {
  /** The alias from MATCH COLUMNS that identifies the column. */
  @JsonProperty("column_alias")
  private String columnAlias;

  /** 1024 matches the max_length on FunctionArgument.constant above. */
  @JsonProperty("tag_key")
  private String tagKey;

  public ColumnTagValueExtraction setColumnAlias(String columnAlias) {
    this.columnAlias = columnAlias;
    return this;
  }

  public String getColumnAlias() {
    return columnAlias;
  }

  public ColumnTagValueExtraction setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ColumnTagValueExtraction that = (ColumnTagValueExtraction) o;
    return Objects.equals(columnAlias, that.columnAlias) && Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnAlias, tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnTagValueExtraction.class)
        .add("columnAlias", columnAlias)
        .add("tagKey", tagKey)
        .toString();
  }
}
