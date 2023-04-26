// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SparseCheckout class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SparseCheckout {
  /** List of patterns to include for sparse checkout. */
  @JsonProperty("patterns")
  private Collection<String> patterns;

  /**
   * <p>Setter for the field <code>patterns</code>.</p>
   *
   * @param patterns a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.workspace.SparseCheckout} object
   */
  public SparseCheckout setPatterns(Collection<String> patterns) {
    this.patterns = patterns;
    return this;
  }

  /**
   * <p>Getter for the field <code>patterns</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getPatterns() {
    return patterns;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparseCheckout that = (SparseCheckout) o;
    return Objects.equals(patterns, that.patterns);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(patterns);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SparseCheckout.class).add("patterns", patterns).toString();
  }
}
