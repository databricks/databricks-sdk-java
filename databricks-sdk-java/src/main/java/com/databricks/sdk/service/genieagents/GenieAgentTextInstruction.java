// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A general text instruction for the Genie Agent. */
@Generated
public class GenieAgentTextInstruction {
  /** The text of the instruction. */
  @JsonProperty("content")
  private String content;

  /**
   * Identifier of the instruction: 32 lowercase hexadecimal characters, unique within the Genie
   * Agent.
   */
  @JsonProperty("id")
  private String id;

  public GenieAgentTextInstruction setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieAgentTextInstruction setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentTextInstruction that = (GenieAgentTextInstruction) o;
    return Objects.equals(content, that.content) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, id);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentTextInstruction.class)
        .add("content", content)
        .add("id", id)
        .toString();
  }
}
