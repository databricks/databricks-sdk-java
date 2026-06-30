// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Function in UC as a dependency. */
@Generated
public class DeltaSharingFunctionDependency {
  /** */
  @JsonProperty("function_name")
  private String functionName;

  /** */
  @JsonProperty("schema_name")
  private String schemaName;

  public DeltaSharingFunctionDependency setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public DeltaSharingFunctionDependency setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSharingFunctionDependency that = (DeltaSharingFunctionDependency) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingFunctionDependency.class)
        .add("functionName", functionName)
        .add("schemaName", schemaName)
        .toString();
  }
}
