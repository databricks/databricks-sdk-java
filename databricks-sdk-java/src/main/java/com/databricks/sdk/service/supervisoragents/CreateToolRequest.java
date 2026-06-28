// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateToolRequest {
  /**
   * Parent resource where this tool will be created. Format:
   * supervisor-agents/{supervisor_agent_id}
   */
  @JsonIgnore private String parent;

  /** */
  @JsonProperty("tool")
  private Tool tool;

  /**
   * The ID to use for the tool, which will become the final component of the tool's resource name.
   */
  @JsonIgnore
  @QueryParam("tool_id")
  private String toolId;

  public CreateToolRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateToolRequest setTool(Tool tool) {
    this.tool = tool;
    return this;
  }

  public Tool getTool() {
    return tool;
  }

  public CreateToolRequest setToolId(String toolId) {
    this.toolId = toolId;
    return this;
  }

  public String getToolId() {
    return toolId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateToolRequest that = (CreateToolRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(tool, that.tool)
        && Objects.equals(toolId, that.toolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, tool, toolId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateToolRequest.class)
        .add("parent", parent)
        .add("tool", tool)
        .add("toolId", toolId)
        .toString();
  }
}
