// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete Published OAuth App Integration
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeletePublishedAppIntegrationRequest {
  /** The oauth app integration ID. */
  private String integrationId;

  /**
   * <p>Setter for the field <code>integrationId</code>.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.DeletePublishedAppIntegrationRequest} object
   */
  public DeletePublishedAppIntegrationRequest setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>integrationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getIntegrationId() {
    return integrationId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeletePublishedAppIntegrationRequest that = (DeletePublishedAppIntegrationRequest) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeletePublishedAppIntegrationRequest.class)
        .add("integrationId", integrationId)
        .toString();
  }
}
