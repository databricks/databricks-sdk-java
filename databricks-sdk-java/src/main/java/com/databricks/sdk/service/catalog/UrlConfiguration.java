// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Access request URLs shared by every workspace in a metastore. */
@Generated
public class UrlConfiguration {
  /**
   * The URL template for access requests on catalogs and the securables inside them, such as
   * schemas, tables, volumes, functions, and registered models. Placeholders are replaced with
   * percent-encoded values from the requested securable: `{catalog}` with the catalog name
   * (`main`), `{catalog.schema}` with the catalog and schema names (`main.sales`),
   * `{catalog.schema.object}` with the full name (`main.sales.orders`), `{securable_type}` with the
   * securable type (`TABLE`), and `{securable_id}` with the securable ID. Name placeholders leave
   * out levels the securable does not have, so `{catalog.schema.object}` is `main.sales` for a
   * schema. When the deepest name placeholder stops above the requested securable, such as
   * `{catalog.schema}` for a table, `{securable_type}` and `{securable_id}` describe that parent.
   * If the filled-in URL is longer than 4,096 characters, the **redirect_url** is used instead.
   *
   * <p>Must start with `http://` or `https://`, contain only printable ASCII characters without
   * spaces or backslashes, and be at most 2,048 characters. Braces are only allowed around a
   * placeholder.
   */
  @JsonProperty("dynamic_url")
  private String dynamicUrl;

  /**
   * The URL for access requests on the metastore and on securables outside catalogs, such as
   * external locations, connections, and credentials. Also used for catalogs and the securables
   * inside them when **dynamic_url** is not set or cannot produce a valid URL. Must start with
   * `http://` or `https://`, contain only printable ASCII characters without spaces or backslashes,
   * and be at most 2,048 characters.
   */
  @JsonProperty("redirect_url")
  private String redirectUrl;

  /**
   * The version of the placeholder syntax used in **dynamic_url**. The only supported version is
   * `1`.
   */
  @JsonProperty("syntax_version")
  private Long syntaxVersion;

  public UrlConfiguration setDynamicUrl(String dynamicUrl) {
    this.dynamicUrl = dynamicUrl;
    return this;
  }

  public String getDynamicUrl() {
    return dynamicUrl;
  }

  public UrlConfiguration setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  public String getRedirectUrl() {
    return redirectUrl;
  }

  public UrlConfiguration setSyntaxVersion(Long syntaxVersion) {
    this.syntaxVersion = syntaxVersion;
    return this;
  }

  public Long getSyntaxVersion() {
    return syntaxVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlConfiguration that = (UrlConfiguration) o;
    return Objects.equals(dynamicUrl, that.dynamicUrl)
        && Objects.equals(redirectUrl, that.redirectUrl)
        && Objects.equals(syntaxVersion, that.syntaxVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicUrl, redirectUrl, syntaxVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(UrlConfiguration.class)
        .add("dynamicUrl", dynamicUrl)
        .add("redirectUrl", redirectUrl)
        .add("syntaxVersion", syntaxVersion)
        .toString();
  }
}
