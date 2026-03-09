// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** FileTableSpec specifies a file table source configuration. */
@Generated
public class FileTableSpec {
  /** The name of the column containing BINARY file content to be indexed. */
  @JsonProperty("file_col")
  private String fileCol;

  /** Full UC name of the table, in the format of {CATALOG}.{SCHEMA}.{TABLE_NAME}. */
  @JsonProperty("table_name")
  private String tableName;

  public FileTableSpec setFileCol(String fileCol) {
    this.fileCol = fileCol;
    return this;
  }

  public String getFileCol() {
    return fileCol;
  }

  public FileTableSpec setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileTableSpec that = (FileTableSpec) o;
    return Objects.equals(fileCol, that.fileCol) && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileCol, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(FileTableSpec.class)
        .add("fileCol", fileCol)
        .add("tableName", tableName)
        .toString();
  }
}
