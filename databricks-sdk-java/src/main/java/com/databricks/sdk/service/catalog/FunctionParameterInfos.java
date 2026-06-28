// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class FunctionParameterInfos {
  /** */
  @JsonProperty("parameters")
  private Collection<FunctionParameterInfo> parameters;

  public FunctionParameterInfos setParameters(Collection<FunctionParameterInfo> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<FunctionParameterInfo> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionParameterInfos that = (FunctionParameterInfos) o;
    return Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(FunctionParameterInfos.class).add("parameters", parameters).toString();
  }
}
