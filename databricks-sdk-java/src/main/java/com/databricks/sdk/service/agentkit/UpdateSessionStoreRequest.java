// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSessionStoreRequest {
  /** Resource name in the form `session-stores/{session_store_id}`. */
  @JsonIgnore private String name;

  /** Session store to update. */
  @JsonProperty("session_store")
  private SessionStore sessionStore;

  /**
   * Fields to update. Only `description` and `metadata` are mutable; any other path returns
   * `INVALID_PARAMETER_VALUE`.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSessionStoreRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSessionStoreRequest setSessionStore(SessionStore sessionStore) {
    this.sessionStore = sessionStore;
    return this;
  }

  public SessionStore getSessionStore() {
    return sessionStore;
  }

  public UpdateSessionStoreRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateSessionStoreRequest that = (UpdateSessionStoreRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(sessionStore, that.sessionStore)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sessionStore, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSessionStoreRequest.class)
        .add("name", name)
        .add("sessionStore", sessionStore)
        .add("updateMask", updateMask)
        .toString();
  }
}
