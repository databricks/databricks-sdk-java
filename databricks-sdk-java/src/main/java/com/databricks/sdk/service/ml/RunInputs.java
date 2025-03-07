// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Run inputs. */
@Generated
public class RunInputs {
  /** Run metrics. */
  @JsonProperty("dataset_inputs")
  private Collection<DatasetInput> datasetInputs;

  public RunInputs setDatasetInputs(Collection<DatasetInput> datasetInputs) {
    this.datasetInputs = datasetInputs;
    return this;
  }

  public Collection<DatasetInput> getDatasetInputs() {
    return datasetInputs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunInputs that = (RunInputs) o;
    return Objects.equals(datasetInputs, that.datasetInputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetInputs);
  }

  @Override
  public String toString() {
    return new ToStringer(RunInputs.class).add("datasetInputs", datasetInputs).toString();
  }
}
