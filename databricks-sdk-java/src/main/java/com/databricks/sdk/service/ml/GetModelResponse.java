// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GetModelResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetModelResponse {
  /** */
  @JsonProperty("registered_model")
  private ModelDatabricks registeredModel;

  /**
   * <p>Setter for the field <code>registeredModel</code>.</p>
   *
   * @param registeredModel a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelResponse} object
   */
  public GetModelResponse setRegisteredModel(ModelDatabricks registeredModel) {
    this.registeredModel = registeredModel;
    return this;
  }

  /**
   * <p>Getter for the field <code>registeredModel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks getRegisteredModel() {
    return registeredModel;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelResponse that = (GetModelResponse) o;
    return Objects.equals(registeredModel, that.registeredModel);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(registeredModel);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetModelResponse.class)
        .add("registeredModel", registeredModel)
        .toString();
  }
}
