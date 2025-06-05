// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ResolvedDbtTaskValuesPb {
  @JsonProperty("commands")
  private Collection<String> commands;

  public ResolvedDbtTaskValuesPb setCommands(Collection<String> commands) {
    this.commands = commands;
    return this;
  }

  public Collection<String> getCommands() {
    return commands;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedDbtTaskValuesPb that = (ResolvedDbtTaskValuesPb) o;
    return Objects.equals(commands, that.commands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commands);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedDbtTaskValuesPb.class).add("commands", commands).toString();
  }
}
