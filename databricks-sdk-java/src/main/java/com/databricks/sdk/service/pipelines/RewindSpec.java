// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Information about a rewind being requested for this pipeline or some of the datasets in it. */
@Generated
public class RewindSpec {
  /**
   * List of datasets to rewind with specific configuration for each. When not specified, all
   * datasets will be rewound with cascade = true and reset_checkpoints = true.
   */
  @JsonProperty("datasets")
  private Collection<RewindDatasetSpec> datasets;

  /** If true, this is a dry run and we should emit the RewindSummary but not perform the rewind. */
  @JsonProperty("dry_run")
  private Boolean dryRun;

  /** The base timestamp to rewind to. Must be specified. */
  @JsonProperty("rewind_timestamp")
  private String rewindTimestamp;

  public RewindSpec setDatasets(Collection<RewindDatasetSpec> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Collection<RewindDatasetSpec> getDatasets() {
    return datasets;
  }

  public RewindSpec setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  public Boolean getDryRun() {
    return dryRun;
  }

  public RewindSpec setRewindTimestamp(String rewindTimestamp) {
    this.rewindTimestamp = rewindTimestamp;
    return this;
  }

  public String getRewindTimestamp() {
    return rewindTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RewindSpec that = (RewindSpec) o;
    return Objects.equals(datasets, that.datasets)
        && Objects.equals(dryRun, that.dryRun)
        && Objects.equals(rewindTimestamp, that.rewindTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasets, dryRun, rewindTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(RewindSpec.class)
        .add("datasets", datasets)
        .add("dryRun", dryRun)
        .add("rewindTimestamp", rewindTimestamp)
        .toString();
  }
}
