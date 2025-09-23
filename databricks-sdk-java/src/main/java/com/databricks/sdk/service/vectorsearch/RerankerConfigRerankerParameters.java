// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RerankerConfigRerankerParameters {
  /** */
  @JsonProperty("columns_to_rerank")
  private Collection<String> columnsToRerank;

  public RerankerConfigRerankerParameters setColumnsToRerank(Collection<String> columnsToRerank) {
    this.columnsToRerank = columnsToRerank;
    return this;
  }

  public Collection<String> getColumnsToRerank() {
    return columnsToRerank;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RerankerConfigRerankerParameters that = (RerankerConfigRerankerParameters) o;
    return Objects.equals(columnsToRerank, that.columnsToRerank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnsToRerank);
  }

  @Override
  public String toString() {
    return new ToStringer(RerankerConfigRerankerParameters.class)
        .add("columnsToRerank", columnsToRerank)
        .toString();
  }
}
