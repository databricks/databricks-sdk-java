// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SparkSubmitTask {
  /**
   * Command-line parameters passed to spark submit.
   *
   * <p>Use [task parameter variables] such as `{{job.id}}` to pass context about job runs.
   *
   * <p>[task parameter variables]:
   * https://docs.databricks.com/workflows/jobs/parameter-value-references.html
   */
  @JsonProperty("parameters")
  private Collection<String> parameters;

  public SparkSubmitTask setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkSubmitTask that = (SparkSubmitTask) o;
    return Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkSubmitTask.class).add("parameters", parameters).toString();
  }
}
