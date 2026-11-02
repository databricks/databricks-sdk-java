// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Agent-produced planning report, presented to the user at the review gates. */
@Generated
public class MigrationReport {
  /** The primary asset the agent created — the entry point / validation target. */
  @JsonProperty("primary_asset")
  private MigrationAsset primaryAsset;

  /** Additional assets the agent created (e.g. notebooks or jobs the primary asset invokes). */
  @JsonProperty("secondary_assets")
  private Collection<MigrationAsset> secondaryAssets;

  public MigrationReport setPrimaryAsset(MigrationAsset primaryAsset) {
    this.primaryAsset = primaryAsset;
    return this;
  }

  public MigrationAsset getPrimaryAsset() {
    return primaryAsset;
  }

  public MigrationReport setSecondaryAssets(Collection<MigrationAsset> secondaryAssets) {
    this.secondaryAssets = secondaryAssets;
    return this;
  }

  public Collection<MigrationAsset> getSecondaryAssets() {
    return secondaryAssets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigrationReport that = (MigrationReport) o;
    return Objects.equals(primaryAsset, that.primaryAsset)
        && Objects.equals(secondaryAssets, that.secondaryAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryAsset, secondaryAssets);
  }

  @Override
  public String toString() {
    return new ToStringer(MigrationReport.class)
        .add("primaryAsset", primaryAsset)
        .add("secondaryAssets", secondaryAssets)
        .toString();
  }
}
