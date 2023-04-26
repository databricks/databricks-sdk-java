// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateRunResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateRunResponse {
  /** Updated metadata of the run. */
  @JsonProperty("run_info")
  private RunInfo runInfo;

  /**
   * <p>Setter for the field <code>runInfo</code>.</p>
   *
   * @param runInfo a {@link com.databricks.sdk.service.ml.RunInfo} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateRunResponse} object
   */
  public UpdateRunResponse setRunInfo(RunInfo runInfo) {
    this.runInfo = runInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>runInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo getRunInfo() {
    return runInfo;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRunResponse that = (UpdateRunResponse) o;
    return Objects.equals(runInfo, that.runInfo);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(runInfo);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateRunResponse.class).add("runInfo", runInfo).toString();
  }
}
