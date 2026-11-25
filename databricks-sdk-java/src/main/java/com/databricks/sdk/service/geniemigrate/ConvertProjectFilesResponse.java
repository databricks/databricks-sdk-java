// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The result of a completed conversion. */
@Generated
public class ConvertProjectFilesResponse {
  /**
   * The completed conversion run. Each file's outcome is in `run.files`; a completed run can
   * include files that failed to convert.
   */
  @JsonProperty("run")
  private ConversionRun run;

  public ConvertProjectFilesResponse setRun(ConversionRun run) {
    this.run = run;
    return this;
  }

  public ConversionRun getRun() {
    return run;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConvertProjectFilesResponse that = (ConvertProjectFilesResponse) o;
    return Objects.equals(run, that.run);
  }

  @Override
  public int hashCode() {
    return Objects.hash(run);
  }

  @Override
  public String toString() {
    return new ToStringer(ConvertProjectFilesResponse.class).add("run", run).toString();
  }
}
