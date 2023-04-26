// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>EndpointCoreConfigSummary class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EndpointCoreConfigSummary {
  /** The list of served models under the serving endpoint config. */
  @JsonProperty("served_models")
  private Collection<ServedModelSpec> servedModels;

  /**
   * <p>Setter for the field <code>servedModels</code>.</p>
   *
   * @param servedModels a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointCoreConfigSummary} object
   */
  public EndpointCoreConfigSummary setServedModels(Collection<ServedModelSpec> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  /**
   * <p>Getter for the field <code>servedModels</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ServedModelSpec> getServedModels() {
    return servedModels;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointCoreConfigSummary that = (EndpointCoreConfigSummary) o;
    return Objects.equals(servedModels, that.servedModels);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(servedModels);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigSummary.class)
        .add("servedModels", servedModels)
        .toString();
  }
}
