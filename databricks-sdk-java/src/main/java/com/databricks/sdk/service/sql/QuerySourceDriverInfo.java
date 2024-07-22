// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QuerySourceDriverInfo {
  /** */
  @JsonProperty("bi_tool_entry")
  private String biToolEntry;

  /** */
  @JsonProperty("driver_name")
  private String driverName;

  /** */
  @JsonProperty("simba_branding_vendor")
  private String simbaBrandingVendor;

  /** */
  @JsonProperty("version_number")
  private String versionNumber;

  public QuerySourceDriverInfo setBiToolEntry(String biToolEntry) {
    this.biToolEntry = biToolEntry;
    return this;
  }

  public String getBiToolEntry() {
    return biToolEntry;
  }

  public QuerySourceDriverInfo setDriverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  public String getDriverName() {
    return driverName;
  }

  public QuerySourceDriverInfo setSimbaBrandingVendor(String simbaBrandingVendor) {
    this.simbaBrandingVendor = simbaBrandingVendor;
    return this;
  }

  public String getSimbaBrandingVendor() {
    return simbaBrandingVendor;
  }

  public QuerySourceDriverInfo setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  public String getVersionNumber() {
    return versionNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuerySourceDriverInfo that = (QuerySourceDriverInfo) o;
    return Objects.equals(biToolEntry, that.biToolEntry)
        && Objects.equals(driverName, that.driverName)
        && Objects.equals(simbaBrandingVendor, that.simbaBrandingVendor)
        && Objects.equals(versionNumber, that.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biToolEntry, driverName, simbaBrandingVendor, versionNumber);
  }

  @Override
  public String toString() {
    return new ToStringer(QuerySourceDriverInfo.class)
        .add("biToolEntry", biToolEntry)
        .add("driverName", driverName)
        .add("simbaBrandingVendor", simbaBrandingVendor)
        .add("versionNumber", versionNumber)
        .toString();
  }
}
