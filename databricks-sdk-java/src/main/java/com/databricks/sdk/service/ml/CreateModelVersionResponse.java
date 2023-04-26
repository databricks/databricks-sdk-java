// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateModelVersionResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateModelVersionResponse {
  /** Return new version number generated for this model in registry. */
  @JsonProperty("model_version")
  private ModelVersion modelVersion;

  /**
   * <p>Setter for the field <code>modelVersion</code>.</p>
   *
   * @param modelVersion a {@link com.databricks.sdk.service.ml.ModelVersion} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelVersionResponse} object
   */
  public CreateModelVersionResponse setModelVersion(ModelVersion modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>modelVersion</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.ModelVersion} object
   */
  public ModelVersion getModelVersion() {
    return modelVersion;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelVersionResponse that = (CreateModelVersionResponse) o;
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
    return new ToStringer(CreateModelVersionResponse.class)
        .add("modelVersion", modelVersion)
        .toString();
  }
}
