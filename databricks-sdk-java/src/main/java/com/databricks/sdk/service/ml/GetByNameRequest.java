// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get metadata
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetByNameRequest {
  /** Name of the associated experiment. */
  @QueryParam("experiment_name")
  private String experimentName;

  /**
   * <p>Setter for the field <code>experimentName</code>.</p>
   *
   * @param experimentName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetByNameRequest} object
   */
  public GetByNameRequest setExperimentName(String experimentName) {
    this.experimentName = experimentName;
    return this;
  }

  /**
   * <p>Getter for the field <code>experimentName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExperimentName() {
    return experimentName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetByNameRequest that = (GetByNameRequest) o;
    return Objects.equals(experimentName, that.experimentName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(experimentName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetByNameRequest.class).add("experimentName", experimentName).toString();
  }
}
