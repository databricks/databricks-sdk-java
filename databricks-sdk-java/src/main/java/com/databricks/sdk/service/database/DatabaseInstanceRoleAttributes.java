// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Attributes that can be granted to a Postgres role. We are only implementing a subset for now, see
 * xref: https://www.postgresql.org/docs/16/sql-createrole.html The values follow Postgres keyword
 * naming e.g. CREATEDB, BYPASSRLS, etc. which is why they don't include typical underscores between
 * words. We were requested to make this a nested object/struct representation since these are knobs
 * from an external spec.
 */
@Generated
public class DatabaseInstanceRoleAttributes {
  /** */
  @JsonProperty("bypassrls")
  private Boolean bypassrls;

  /** */
  @JsonProperty("createdb")
  private Boolean createdb;

  /** */
  @JsonProperty("createrole")
  private Boolean createrole;

  public DatabaseInstanceRoleAttributes setBypassrls(Boolean bypassrls) {
    this.bypassrls = bypassrls;
    return this;
  }

  public Boolean getBypassrls() {
    return bypassrls;
  }

  public DatabaseInstanceRoleAttributes setCreatedb(Boolean createdb) {
    this.createdb = createdb;
    return this;
  }

  public Boolean getCreatedb() {
    return createdb;
  }

  public DatabaseInstanceRoleAttributes setCreaterole(Boolean createrole) {
    this.createrole = createrole;
    return this;
  }

  public Boolean getCreaterole() {
    return createrole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseInstanceRoleAttributes that = (DatabaseInstanceRoleAttributes) o;
    return Objects.equals(bypassrls, that.bypassrls)
        && Objects.equals(createdb, that.createdb)
        && Objects.equals(createrole, that.createrole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bypassrls, createdb, createrole);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstanceRoleAttributes.class)
        .add("bypassrls", bypassrls)
        .add("createdb", createdb)
        .add("createrole", createrole)
        .toString();
  }
}
