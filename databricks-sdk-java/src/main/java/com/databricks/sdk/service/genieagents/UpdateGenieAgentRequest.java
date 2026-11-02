// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateGenieAgentRequest {
  /**
   * Etag from a previous read. On mismatch the update fails with ABORTED (metadata changes may
   * already be applied); get the agent and retry. May return TEMPORARILY_UNAVAILABLE.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * The Genie Agent to update. Its `name` identifies the resource; fields named in update_mask are
   * applied.
   */
  @JsonProperty("genie_agent")
  private GenieAgent genieAgent;

  /**
   * The resource name of the Genie Agent, in the form `agents/{genie_agent_id}`. Ignored on create.
   */
  @JsonIgnore private String name;

  /**
   * The set of fields to update. The mask is required and must name at least one field; an empty or
   * absent mask is rejected with INVALID_PARAMETER_VALUE, as is a path that is not an updatable
   * field.
   *
   * <p>A field named in the mask takes the value from `genie_agent`, even when it is unset there:
   * an unset `description` is cleared; an unset `display_name`, `warehouse_id`, or `definition` is
   * rejected with INVALID_PARAMETER_VALUE; an unset `parent_path` is cleared without moving the
   * Genie Agent. `definition` is replaced as a whole; paths within it are not supported.
   *
   * <p>The special value `*` replaces the whole Genie Agent, as if every updatable field were
   * named. It must be the only path in the mask. Prefer naming fields explicitly: with `*`, any
   * field added to Genie Agent later is also replaced, so a client unaware of it may clear it.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateGenieAgentRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateGenieAgentRequest setGenieAgent(GenieAgent genieAgent) {
    this.genieAgent = genieAgent;
    return this;
  }

  public GenieAgent getGenieAgent() {
    return genieAgent;
  }

  public UpdateGenieAgentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateGenieAgentRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateGenieAgentRequest that = (UpdateGenieAgentRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(genieAgent, that.genieAgent)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, genieAgent, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateGenieAgentRequest.class)
        .add("etag", etag)
        .add("genieAgent", genieAgent)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
