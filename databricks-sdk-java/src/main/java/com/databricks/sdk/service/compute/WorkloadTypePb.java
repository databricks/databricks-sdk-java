// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Cluster Attributes showing for clusters workload types. */
@Generated
class WorkloadTypePb {
  @JsonProperty("clients")
  private ClientsTypes clients;

  public WorkloadTypePb setClients(ClientsTypes clients) {
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
    WorkloadTypePb that = (WorkloadTypePb) o;
    return Objects.equals(clients, that.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkloadTypePb.class).add("clients", clients).toString();
  }
}
