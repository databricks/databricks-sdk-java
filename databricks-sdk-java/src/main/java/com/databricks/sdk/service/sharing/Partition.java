// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Partition class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Partition {
  /** An array of partition values. */
  @JsonProperty("values")
  private Collection<PartitionValue> values;

  /**
   * <p>Setter for the field <code>values</code>.</p>
   *
   * @param values a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.Partition} object
   */
  public Partition setValues(Collection<PartitionValue> values) {
    this.values = values;
    return this;
  }

  /**
   * <p>Getter for the field <code>values</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PartitionValue> getValues() {
    return values;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Partition that = (Partition) o;
    return Objects.equals(values, that.values);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Partition.class).add("values", values).toString();
  }
}
