// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ClientsTypes {
  /**
   * With jobs set, the cluster can be used for jobs
   */
  @JsonProperty("jobs")
  private Boolean jobs;
  
  /**
   * With notebooks set, this cluster can be used for notebooks
   */
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
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientsTypes that = (ClientsTypes) o;
    return Objects.equals(jobs, that.jobs)
    && Objects.equals(notebooks, that.notebooks)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, notebooks);
  }

  @Override
  public String toString() {
    return new ToStringer(ClientsTypes.class)
      .add("jobs", jobs)
      .add("notebooks", notebooks).toString();
  }
}
