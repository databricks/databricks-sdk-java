// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** DatasetInput. Represents a dataset and input tags. */
@Generated
class DatasetInputPb {
  @JsonProperty("dataset")
  private Dataset dataset;

  @JsonProperty("tags")
  private Collection<InputTag> tags;

  public DatasetInputPb setDataset(Dataset dataset) {
    this.dataset = dataset;
    return this;
  }

  public Dataset getDataset() {
    return dataset;
  }

  public DatasetInputPb setTags(Collection<InputTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<InputTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatasetInputPb that = (DatasetInputPb) o;
    return Objects.equals(dataset, that.dataset) && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(DatasetInputPb.class)
        .add("dataset", dataset)
        .add("tags", tags)
        .toString();
  }
}
