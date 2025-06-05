// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ClientsTypesPb {
  @JsonProperty("jobs")
  private Boolean jobs;

  @JsonProperty("notebooks")
  private Boolean notebooks;

  public ClientsTypesPb setJobs(Boolean jobs) {
    this.jobs = jobs;
    return this;
  }

  public Boolean getJobs() {
    return jobs;
  }

  public ClientsTypesPb setNotebooks(Boolean notebooks) {
    this.notebooks = notebooks;
    return this;
  }

  public Boolean getNotebooks() {
    return notebooks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientsTypesPb that = (ClientsTypesPb) o;
    return Objects.equals(jobs, that.jobs) && Objects.equals(notebooks, that.notebooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, notebooks);
  }

  @Override
  public String toString() {
    return new ToStringer(ClientsTypesPb.class)
        .add("jobs", jobs)
        .add("notebooks", notebooks)
        .toString();
  }
}
