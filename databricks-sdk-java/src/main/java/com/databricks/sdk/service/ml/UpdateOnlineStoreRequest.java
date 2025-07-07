// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateOnlineStoreRequest {
  /** The name of the online store. This is the unique identifier for the online store. */
  @JsonIgnore private String name;

  /** Online store to update. */
  @JsonProperty("online_store")
  private OnlineStore onlineStore;

  /** The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateOnlineStoreRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateOnlineStoreRequest setOnlineStore(OnlineStore onlineStore) {
    this.onlineStore = onlineStore;
    return this;
  }

  public OnlineStore getOnlineStore() {
    return onlineStore;
  }

  public UpdateOnlineStoreRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateOnlineStoreRequest that = (UpdateOnlineStoreRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(onlineStore, that.onlineStore)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, onlineStore, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateOnlineStoreRequest.class)
        .add("name", name)
        .add("onlineStore", onlineStore)
        .add("updateMask", updateMask)
        .toString();
  }
}
