// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TransitionStageResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TransitionStageResponse {
  /** */
  @JsonProperty("model_version")
  private ModelVersionDatabricks modelVersion;

  /**
   * <p>Setter for the field <code>modelVersion</code>.</p>
   *
   * @param modelVersion a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   * @return a {@link com.databricks.sdk.service.ml.TransitionStageResponse} object
   */
  public TransitionStageResponse setModelVersion(ModelVersionDatabricks modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>modelVersion</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks getModelVersion() {
    return modelVersion;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransitionStageResponse that = (TransitionStageResponse) o;
    return Objects.equals(modelVersion, that.modelVersion);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(modelVersion);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TransitionStageResponse.class)
        .add("modelVersion", modelVersion)
        .toString();
  }
}
