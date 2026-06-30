// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configuration for rewinding a specific dataset. */
@Generated
public class RewindDatasetSpec {
  /** Whether to cascade the rewind to dependent datasets. Must be specified. */
  @JsonProperty("cascade")
  private Boolean cascade;

  /** The identifier of the dataset (e.g., "main.foo.tbl1"). */
  @JsonProperty("identifier")
  private String identifier;

  /** Whether to reset checkpoints for this dataset. */
  @JsonProperty("reset_checkpoints")
  private Boolean resetCheckpoints;

  public RewindDatasetSpec setCascade(Boolean cascade) {
    this.cascade = cascade;
    return this;
  }

  public Boolean getCascade() {
    return cascade;
  }

  public RewindDatasetSpec setIdentifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  public String getIdentifier() {
    return identifier;
  }

  public RewindDatasetSpec setResetCheckpoints(Boolean resetCheckpoints) {
    this.resetCheckpoints = resetCheckpoints;
    return this;
  }

  public Boolean getResetCheckpoints() {
    return resetCheckpoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RewindDatasetSpec that = (RewindDatasetSpec) o;
    return Objects.equals(cascade, that.cascade)
        && Objects.equals(identifier, that.identifier)
        && Objects.equals(resetCheckpoints, that.resetCheckpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascade, identifier, resetCheckpoints);
  }

  @Override
  public String toString() {
    return new ToStringer(RewindDatasetSpec.class)
        .add("cascade", cascade)
        .add("identifier", identifier)
        .add("resetCheckpoints", resetCheckpoints)
        .toString();
  }
}
