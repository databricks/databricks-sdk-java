// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EmailConfigPb {
  @JsonProperty("addresses")
  private Collection<String> addresses;

  public EmailConfigPb setAddresses(Collection<String> addresses) {
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
    EmailConfigPb that = (EmailConfigPb) o;
    return Objects.equals(addresses, that.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }

  @Override
  public String toString() {
    return new ToStringer(EmailConfigPb.class).add("addresses", addresses).toString();
  }
}
