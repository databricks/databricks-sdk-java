// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EmailConfig {
  /** Email addresses to notify. */
  @JsonProperty("addresses")
  private Collection<String> addresses;

  public EmailConfig setAddresses(Collection<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Collection<String> getAddresses() {
    return addresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmailConfig that = (EmailConfig) o;
    return Objects.equals(addresses, that.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }

  @Override
  public String toString() {
    return new ToStringer(EmailConfig.class).add("addresses", addresses).toString();
  }
}
