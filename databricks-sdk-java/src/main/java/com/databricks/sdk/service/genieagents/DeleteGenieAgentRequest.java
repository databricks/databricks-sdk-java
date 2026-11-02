// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteGenieAgentRequest {
  /**
   * Etag from a previous read. On mismatch the delete fails with ABORTED and nothing is deleted.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /** The resource name of the Genie Agent to delete, in the form `agents/{genie_agent_id}`. */
  @JsonIgnore private String name;

  public DeleteGenieAgentRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteGenieAgentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteGenieAgentRequest that = (DeleteGenieAgentRequest) o;
    return Objects.equals(etag, that.etag) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteGenieAgentRequest.class)
        .add("etag", etag)
        .add("name", name)
        .toString();
  }
}
