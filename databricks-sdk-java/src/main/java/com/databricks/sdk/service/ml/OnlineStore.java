// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An OnlineStore is a logical database instance that stores and serves features online. */
@Generated
public class OnlineStore {
  /** The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8". */
  @JsonProperty("capacity")
  private String capacity;

  /** The timestamp when the online store was created. */
  @JsonProperty("creation_time")
  private String creationTime;

  /** The email of the creator of the online store. */
  @JsonProperty("creator")
  private String creator;

  /** The name of the online store. This is the unique identifier for the online store. */
  @JsonProperty("name")
  private String name;

  /** The current state of the online store. */
  @JsonProperty("state")
  private OnlineStoreState state;

  public OnlineStore setCapacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  public String getCapacity() {
    return capacity;
  }

  public OnlineStore setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public OnlineStore setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public OnlineStore setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public OnlineStore setState(OnlineStoreState state) {
    this.state = state;
    return this;
  }

  public OnlineStoreState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStore that = (OnlineStore) o;
    return Objects.equals(capacity, that.capacity)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(name, that.name)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, creationTime, creator, name, state);
  }

  @Override
  public String toString() {
    return new ToStringer(OnlineStore.class)
        .add("capacity", capacity)
        .add("creationTime", creationTime)
        .add("creator", creator)
        .add("name", name)
        .add("state", state)
        .toString();
  }
}
