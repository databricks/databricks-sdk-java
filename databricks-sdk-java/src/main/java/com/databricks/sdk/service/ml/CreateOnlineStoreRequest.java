// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateOnlineStoreRequest {
  /** Online store to create. */
  @JsonProperty("online_store")
  private OnlineStore onlineStore;

  public CreateOnlineStoreRequest setOnlineStore(OnlineStore onlineStore) {
    this.onlineStore = onlineStore;
    return this;
  }

  public OnlineStore getOnlineStore() {
    return onlineStore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOnlineStoreRequest that = (CreateOnlineStoreRequest) o;
    return Objects.equals(onlineStore, that.onlineStore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineStore);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOnlineStoreRequest.class)
        .add("onlineStore", onlineStore)
        .toString();
  }
}
