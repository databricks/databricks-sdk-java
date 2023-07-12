// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class WorkloadType {
  /** defined what type of clients can use the cluster. E.g. Notebooks, Jobs */
  @JsonProperty("clients")
  private ClientsTypes clients;

  public WorkloadType setClients(ClientsTypes clients) {
    this.clients = clients;
    return this;
  }

  public ClientsTypes getClients() {
    return clients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkloadType that = (WorkloadType) o;
    return Objects.equals(clients, that.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkloadType.class).add("clients", clients).toString();
  }
}
