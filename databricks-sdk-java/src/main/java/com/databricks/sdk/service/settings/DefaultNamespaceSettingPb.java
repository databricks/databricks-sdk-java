// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This represents the setting configuration for the default namespace in the Databricks workspace.
 * Setting the default catalog for the workspace determines the catalog that is used when queries do
 * not reference a fully qualified 3 level name. For example, if the default catalog is set to
 * 'retail_prod' then a query 'SELECT * FROM myTable' would reference the object
 * 'retail_prod.default.myTable' (the schema 'default' is always assumed). This setting requires a
 * restart of clusters and SQL warehouses to take effect. Additionally, the default namespace only
 * applies when using Unity Catalog-enabled compute.
 */
@Generated
class DefaultNamespaceSettingPb {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("namespace")
  private StringMessage namespace;

  @JsonProperty("setting_name")
  private String settingName;

  public DefaultNamespaceSettingPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DefaultNamespaceSettingPb setNamespace(StringMessage namespace) {
    this.namespace = namespace;
    return this;
  }

  public StringMessage getNamespace() {
    return namespace;
  }

  public DefaultNamespaceSettingPb setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultNamespaceSettingPb that = (DefaultNamespaceSettingPb) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(namespace, that.namespace)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, namespace, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultNamespaceSettingPb.class)
        .add("etag", etag)
        .add("namespace", namespace)
        .add("settingName", settingName)
        .toString();
  }
}
