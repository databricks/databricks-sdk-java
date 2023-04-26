// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateModelResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateModelResponse {
  /** */
  @JsonProperty("registered_model")
  private Model registeredModel;

  /**
   * <p>Setter for the field <code>registeredModel</code>.</p>
   *
   * @param registeredModel a {@link com.databricks.sdk.service.ml.Model} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelResponse} object
   */
  public CreateModelResponse setRegisteredModel(Model registeredModel) {
    this.registeredModel = registeredModel;
    return this;
  }

  /**
   * <p>Getter for the field <code>registeredModel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Model} object
   */
  public Model getRegisteredModel() {
    return registeredModel;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelResponse that = (CreateModelResponse) o;
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
    return new ToStringer(CreateModelResponse.class)
        .add("registeredModel", registeredModel)
        .toString();
  }
}
