// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>WorkloadType class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WorkloadType {
  /** defined what type of clients can use the cluster. E.g. Notebooks, Jobs */
  @JsonProperty("clients")
  private ClientsTypes clients;

  /**
   * <p>Setter for the field <code>clients</code>.</p>
   *
   * @param clients a {@link com.databricks.sdk.service.compute.ClientsTypes} object
   * @return a {@link com.databricks.sdk.service.compute.WorkloadType} object
   */
  public WorkloadType setClients(ClientsTypes clients) {
    this.clients = clients;
    return this;
  }

  /**
   * <p>Getter for the field <code>clients</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ClientsTypes} object
   */
  public ClientsTypes getClients() {
    return clients;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkloadType that = (WorkloadType) o;
    return Objects.equals(clients, that.clients);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(clients);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(WorkloadType.class).add("clients", clients).toString();
  }
}
