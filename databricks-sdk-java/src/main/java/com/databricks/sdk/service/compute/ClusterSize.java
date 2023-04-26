// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ClusterSize class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ClusterSize {
  /**
   * Parameters needed in order to automatically scale clusters up and down based on load. Note:
   * autoscaling works best with DB runtime versions 3.0 or later.
   */
  @JsonProperty("autoscale")
  private AutoScale autoscale;

  /**
   * Number of worker nodes that this cluster should have. A cluster has one Spark Driver and
   * `num_workers` Executors for a total of `num_workers` + 1 Spark nodes.
   *
   * <p>Note: When reading the properties of a cluster, this field reflects the desired number of
   * workers rather than the actual current number of workers. For instance, if a cluster is resized
   * from 5 to 10 workers, this field will immediately be updated to reflect the target size of 10
   * workers, whereas the workers listed in `spark_info` will gradually increase from 5 to 10 as the
   * new nodes are provisioned.
   */
  @JsonProperty("num_workers")
  private Long numWorkers;

  /**
   * <p>Setter for the field <code>autoscale</code>.</p>
   *
   * @param autoscale a {@link com.databricks.sdk.service.compute.AutoScale} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterSize} object
   */
  public ClusterSize setAutoscale(AutoScale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  /**
   * <p>Getter for the field <code>autoscale</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.AutoScale} object
   */
  public AutoScale getAutoscale() {
    return autoscale;
  }

  /**
   * <p>Setter for the field <code>numWorkers</code>.</p>
   *
   * @param numWorkers a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterSize} object
   */
  public ClusterSize setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  /**
   * <p>Getter for the field <code>numWorkers</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getNumWorkers() {
    return numWorkers;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterSize that = (ClusterSize) o;
    return Objects.equals(autoscale, that.autoscale) && Objects.equals(numWorkers, that.numWorkers);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(autoscale, numWorkers);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ClusterSize.class)
        .add("autoscale", autoscale)
        .add("numWorkers", numWorkers)
        .toString();
  }
}
