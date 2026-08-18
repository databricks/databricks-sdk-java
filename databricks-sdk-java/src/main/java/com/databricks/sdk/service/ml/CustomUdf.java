// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A CustomUdf function applies a registered Unity Catalog function row-wise to source columns,
 * producing a single output column per row.
 */
@Generated
public class CustomUdf {
  /** Fully qualified 3-part Unity Catalog path of the function to apply. */
  @JsonProperty("function_path")
  private String functionPath;

  /**
   * Binds each UC function parameter to a source column. May be empty for zero-argument functions
   * (e.g. a timestamp generator).
   */
  @JsonProperty("input_bindings")
  private Collection<InputBinding> inputBindings;

  public CustomUdf setFunctionPath(String functionPath) {
    this.functionPath = functionPath;
    return this;
  }

  public String getFunctionPath() {
    return functionPath;
  }

  public CustomUdf setInputBindings(Collection<InputBinding> inputBindings) {
    this.inputBindings = inputBindings;
    return this;
  }

  public Collection<InputBinding> getInputBindings() {
    return inputBindings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomUdf that = (CustomUdf) o;
    return Objects.equals(functionPath, that.functionPath)
        && Objects.equals(inputBindings, that.inputBindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionPath, inputBindings);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomUdf.class)
        .add("functionPath", functionPath)
        .add("inputBindings", inputBindings)
        .toString();
  }
}
