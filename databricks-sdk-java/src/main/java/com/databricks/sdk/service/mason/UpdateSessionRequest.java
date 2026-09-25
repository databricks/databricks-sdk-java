// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSessionRequest {
  /** Resource name in the form `session-stores/{session_store_id}/sessions/{session_id}`. */
  @JsonIgnore private String name;

  /** Session to update. */
  @JsonProperty("session")
  private Session session;

  /**
   * Fields to update. Only `metadata` is mutable; any other path returns `INVALID_PARAMETER_VALUE`.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSessionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSessionRequest setSession(Session session) {
    this.session = session;
    return this;
  }

  public Session getSession() {
    return session;
  }

  public UpdateSessionRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateSessionRequest that = (UpdateSessionRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(session, that.session)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, session, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSessionRequest.class)
        .add("name", name)
        .add("session", session)
        .add("updateMask", updateMask)
        .toString();
  }
}
