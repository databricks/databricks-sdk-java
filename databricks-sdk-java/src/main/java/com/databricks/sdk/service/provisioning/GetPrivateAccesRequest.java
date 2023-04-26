// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a private access settings object
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetPrivateAccesRequest {
  /** Databricks Account API private access settings ID. */
  private String privateAccessSettingsId;

  /**
   * <p>Setter for the field <code>privateAccessSettingsId</code>.</p>
   *
   * @param privateAccessSettingsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GetPrivateAccesRequest} object
   */
  public GetPrivateAccesRequest setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  /**
   * <p>Getter for the field <code>privateAccessSettingsId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPrivateAccesRequest that = (GetPrivateAccesRequest) o;
    return Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(privateAccessSettingsId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetPrivateAccesRequest.class)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .toString();
  }
}
