// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AppEnvironment {
  /** */
  @JsonProperty("env")
  private Collection<EnvVariable> env;

  public AppEnvironment setEnv(Collection<EnvVariable> env) {
    this.env = env;
    return this;
  }

  public Collection<EnvVariable> getEnv() {
    return env;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppEnvironment that = (AppEnvironment) o;
    return Objects.equals(env, that.env);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env);
  }

  @Override
  public String toString() {
    return new ToStringer(AppEnvironment.class).add("env", env).toString();
  }
}
