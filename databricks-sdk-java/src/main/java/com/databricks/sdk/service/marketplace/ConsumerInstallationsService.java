// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Installations are entities that allow consumers to interact with Databricks Marketplace listings.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ConsumerInstallationsService {
  /**
   * Install from a listing.
   *
   * <p>Install payload associated with a Databricks Marketplace listing.
   */
  Installation create(CreateInstallationRequest createInstallationRequest);

  /**
   * Uninstall from a listing.
   *
   * <p>Uninstall an installation associated with a Databricks Marketplace listing.
   */
  void delete(DeleteInstallationRequest deleteInstallationRequest);

  /**
   * List all installations.
   *
   * <p>List all installations across all listings.
   */
  ListAllInstallationsResponse list(ListAllInstallationsRequest listAllInstallationsRequest);

  /**
   * List installations for a listing.
   *
   * <p>List all installations for a particular listing.
   */
  ListInstallationsResponse listListingInstallations(
      ListInstallationsRequest listInstallationsRequest);

  /**
   * Update an installation.
   *
   * <p>This is a update API that will update the part of the fields defined in the installation
   * table as well as interact with external services according to the fields not included in the
   * installation table 1. the token will be rotate if the rotateToken flag is true 2. the token
   * will be forcibly rotate if the rotateToken flag is true and the tokenInfo field is empty
   */
  UpdateInstallationResponse update(UpdateInstallationRequest updateInstallationRequest);
}
