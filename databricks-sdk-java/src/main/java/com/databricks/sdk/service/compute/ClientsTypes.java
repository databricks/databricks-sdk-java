// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ClientsTypes class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ClientsTypes {
  /** With jobs set, the cluster can be used for jobs */
  @JsonProperty("jobs")
  private Boolean jobs;

  /** With notebooks set, this cluster can be used for notebooks */
  @JsonProperty("notebooks")
  private Boolean notebooks;

  /**
   * <p>Setter for the field <code>jobs</code>.</p>
   *
   * @param jobs a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.ClientsTypes} object
   */
  public ClientsTypes setJobs(Boolean jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobs</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getJobs() {
    return jobs;
  }

  /**
   * <p>Setter for the field <code>notebooks</code>.</p>
   *
   * @param notebooks a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.ClientsTypes} object
   */
  public ClientsTypes setNotebooks(Boolean notebooks) {
    this.notebooks = notebooks;
    return this;
  }

  /**
   * <p>Getter for the field <code>notebooks</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getNotebooks() {
    return notebooks;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientsTypes that = (ClientsTypes) o;
    return Objects.equals(jobs, that.jobs) && Objects.equals(notebooks, that.notebooks);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(jobs, notebooks);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ClientsTypes.class)
        .add("jobs", jobs)
        .add("notebooks", notebooks)
        .toString();
  }
}
