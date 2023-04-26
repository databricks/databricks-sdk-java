// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateRunResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateRunResponse {
  /** The newly created run. */
  @JsonProperty("run")
  private Run run;

  /**
   * <p>Setter for the field <code>run</code>.</p>
   *
   * @param run a {@link com.databricks.sdk.service.ml.Run} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRunResponse} object
   */
  public CreateRunResponse setRun(Run run) {
    this.run = run;
    return this;
  }

  /**
   * <p>Getter for the field <code>run</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Run} object
   */
  public Run getRun() {
    return run;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRunResponse that = (CreateRunResponse) o;
    return Objects.equals(run, that.run);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(run);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateRunResponse.class).add("run", run).toString();
  }
}
