// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateToolRequest {
  /** Full resource name: supervisor-agents/{supervisor_agent_id}/tools/{tool_id} */
  @JsonIgnore private String name;

  /** The Tool to update. */
  @JsonProperty("tool")
  private Tool tool;

  /** Field mask for fields to be updated. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateToolRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateToolRequest setTool(Tool tool) {
    this.tool = tool;
    return this;
  }

  public Tool getTool() {
    return tool;
  }

  public UpdateToolRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateToolRequest that = (UpdateToolRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(tool, that.tool)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tool, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateToolRequest.class)
        .add("name", name)
        .add("tool", tool)
        .add("updateMask", updateMask)
        .toString();
  }
}
