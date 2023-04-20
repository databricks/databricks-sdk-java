// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class UpdateShare {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the share. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of share. */
  @JsonProperty("owner")
  private String owner;

  /** Array of shared data object updates. */
  @JsonProperty("updates")
  private Collection<SharedDataObjectUpdate> updates;

  public UpdateShare setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateShare setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateShare setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateShare setUpdates(Collection<SharedDataObjectUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public Collection<SharedDataObjectUpdate> getUpdates() {
    return updates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateShare that = (UpdateShare) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(updates, that.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, owner, updates);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateShare.class)
        .add("comment", comment)
        .add("name", name)
        .add("owner", owner)
        .add("updates", updates)
        .toString();
  }
}
