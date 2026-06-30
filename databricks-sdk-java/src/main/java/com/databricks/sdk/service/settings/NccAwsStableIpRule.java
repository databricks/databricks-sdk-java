// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The stable AWS IP CIDR blocks. You can use these to configure the firewall of your resources to
 * allow traffic from your Databricks workspace.
 */
@Generated
public class NccAwsStableIpRule {
  /**
   * The list of stable IP CIDR blocks from which Databricks network traffic originates when
   * accessing your resources.
   */
  @JsonProperty("cidr_blocks")
  private Collection<String> cidrBlocks;

  public NccAwsStableIpRule setCidrBlocks(Collection<String> cidrBlocks) {
    this.cidrBlocks = cidrBlocks;
    return this;
  }

  public Collection<String> getCidrBlocks() {
    return cidrBlocks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccAwsStableIpRule that = (NccAwsStableIpRule) o;
    return Objects.equals(cidrBlocks, that.cidrBlocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlocks);
  }

  @Override
  public String toString() {
    return new ToStringer(NccAwsStableIpRule.class).add("cidrBlocks", cidrBlocks).toString();
  }
}
