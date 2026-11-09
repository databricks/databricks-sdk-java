// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Progress and outcomes of the runs requested by `TriggerMaterializationSet`. Entries remain
 * available after the operation finishes.
 *
 * <p>Once all requested runs have finished, the operation fails if any run failed. Otherwise, it is
 * cancelled if any run was cancelled, and succeeds if all runs succeeded.
 */
@Generated
public class MaterializationSetTriggerProgress {
  /** One entry per requested run, including runs that fail or are cancelled before submission. */
  @JsonProperty("runs")
  private Collection<MaterializationRunProgress> runs;

  public MaterializationSetTriggerProgress setRuns(Collection<MaterializationRunProgress> runs) {
    this.runs = runs;
    return this;
  }

  public Collection<MaterializationRunProgress> getRuns() {
    return runs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializationSetTriggerProgress that = (MaterializationSetTriggerProgress) o;
    return Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runs);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationSetTriggerProgress.class).add("runs", runs).toString();
  }
}
