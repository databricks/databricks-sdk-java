// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class InitScriptInfoAndExecutionDetails {
  /** Details about the script */
  @JsonProperty("execution_details")
  private InitScriptExecutionDetails executionDetails;

  /** The script */
  @JsonProperty("script")
  private InitScriptInfo script;

  public InitScriptInfoAndExecutionDetails setExecutionDetails(
      InitScriptExecutionDetails executionDetails) {
    this.executionDetails = executionDetails;
    return this;
  }

  public InitScriptExecutionDetails getExecutionDetails() {
    return executionDetails;
  }

  public InitScriptInfoAndExecutionDetails setScript(InitScriptInfo script) {
    this.script = script;
    return this;
  }

  public InitScriptInfo getScript() {
    return script;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitScriptInfoAndExecutionDetails that = (InitScriptInfoAndExecutionDetails) o;
    return Objects.equals(executionDetails, that.executionDetails)
        && Objects.equals(script, that.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionDetails, script);
  }

  @Override
  public String toString() {
    return new ToStringer(InitScriptInfoAndExecutionDetails.class)
        .add("executionDetails", executionDetails)
        .add("script", script)
        .toString();
  }
}
