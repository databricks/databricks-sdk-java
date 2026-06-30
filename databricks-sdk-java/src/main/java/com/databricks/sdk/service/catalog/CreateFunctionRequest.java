// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFunctionRequest {
  /** Partial __FunctionInfo__ specifying the function to be created. */
  @JsonProperty("function_info")
  private CreateFunction functionInfo;

  public CreateFunctionRequest setFunctionInfo(CreateFunction functionInfo) {
    this.functionInfo = functionInfo;
    return this;
  }

  public CreateFunction getFunctionInfo() {
    return functionInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFunctionRequest that = (CreateFunctionRequest) o;
    return Objects.equals(functionInfo, that.functionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFunctionRequest.class).add("functionInfo", functionInfo).toString();
  }
}
