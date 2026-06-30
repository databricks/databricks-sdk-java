// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QueryAttachmentParameter {
  /** */
  @JsonProperty("keyword")
  private String keyword;

  /** */
  @JsonProperty("sql_type")
  private String sqlType;

  /** */
  @JsonProperty("value")
  private String value;

  public QueryAttachmentParameter setKeyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  public String getKeyword() {
    return keyword;
  }

  public QueryAttachmentParameter setSqlType(String sqlType) {
    this.sqlType = sqlType;
    return this;
  }

  public String getSqlType() {
    return sqlType;
  }

  public QueryAttachmentParameter setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryAttachmentParameter that = (QueryAttachmentParameter) o;
    return Objects.equals(keyword, that.keyword)
        && Objects.equals(sqlType, that.sqlType)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, sqlType, value);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryAttachmentParameter.class)
        .add("keyword", keyword)
        .add("sqlType", sqlType)
        .add("value", value)
        .toString();
  }
}
