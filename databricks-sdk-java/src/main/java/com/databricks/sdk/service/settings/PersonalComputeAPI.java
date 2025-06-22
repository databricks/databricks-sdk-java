// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Personal Compute enablement setting lets you control which users can use the Personal Compute
 * default policy to create compute resources. By default all users in all workspaces have access
 * (ON), but you can change the setting to instead let individual workspaces configure access
 * control (DELEGATE).
 *
 * <p>There is only one instance of this setting per account. Since this setting has a default
 * value, this setting is present on all accounts even though it's never set on a given account.
 * Deletion reverts the value of the setting back to the default value.
 */
@Generated
public class PersonalComputeAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PersonalComputeAPI.class);

  private final PersonalComputeService impl;

  /** Regular-use constructor */
  public PersonalComputeAPI(ApiClient apiClient) {
    impl = new PersonalComputeImpl(apiClient);
  }

  /** Constructor for mocks */
  public PersonalComputeAPI(PersonalComputeService mock) {
    impl = mock;
  }

  /** Reverts back the Personal Compute setting value to default (ON) */
  public DeletePersonalComputeSettingResponse delete(DeletePersonalComputeSettingRequest request) {
    return impl.delete(request);
  }

  /** Gets the value of the Personal Compute setting. */
  public PersonalComputeSetting get(GetPersonalComputeSettingRequest request) {
    return impl.get(request);
  }

  public PersonalComputeSetting update(
      boolean allowMissing, PersonalComputeSetting setting, String fieldMask) {
    return update(
        new UpdatePersonalComputeSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /** Updates the value of the Personal Compute setting. */
  public PersonalComputeSetting update(UpdatePersonalComputeSettingRequest request) {
    return impl.update(request);
  }

  public PersonalComputeService impl() {
    return impl;
  }
}
