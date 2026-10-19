// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Identifies the source and exact destination for a sandbox path rename. */
@Generated
public class RenamePathRequest {
  /** Exact absolute UTF-8 destination; it must not already exist. */
  @JsonProperty("destination")
  private String destination;

  /** Sandbox resource name, for example `sandboxes/my-sandbox`. */
  @JsonIgnore private String parent;

  /** Absolute UTF-8 path to move. */
  @JsonProperty("source")
  private String source;

  public RenamePathRequest setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public RenamePathRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public RenamePathRequest setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RenamePathRequest that = (RenamePathRequest) o;
    return Objects.equals(destination, that.destination)
        && Objects.equals(parent, that.parent)
        && Objects.equals(source, that.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, parent, source);
  }

  @Override
  public String toString() {
    return new ToStringer(RenamePathRequest.class)
        .add("destination", destination)
        .add("parent", parent)
        .add("source", source)
        .toString();
  }
}
