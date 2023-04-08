// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientsTypes {
  /** With jobs set, the cluster can be used for jobs */
  @JsonProperty("jobs")
  private Boolean jobs;

  /** With notebooks set, this cluster can be used for notebooks */
  @JsonProperty("notebooks")
  private Boolean notebooks;

  public ClientsTypes setJobs(Boolean jobs) {
    this.jobs = jobs;
    return this;
  }

  public Boolean getJobs() {
    return jobs;
  }

  public ClientsTypes setNotebooks(Boolean notebooks) {
    this.notebooks = notebooks;
    return this;
  }

  public Boolean getNotebooks() {
    return notebooks;
  }
}
