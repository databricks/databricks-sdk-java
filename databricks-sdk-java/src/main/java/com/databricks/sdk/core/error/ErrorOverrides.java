// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;
import java.util.Arrays;
import java.util.List;

@Generated
class ErrorOverrides {
  static final List<ErrorOverride<?>> ALL_OVERRIDES =
      Arrays.asList(
          new ErrorOverride<>(
              "Clusters InvalidParameterValue=>ResourceDoesNotExist",
              "^/api/2\\.\\d/clusters/get",
              "GET",
              "^400$",
              "INVALID_PARAMETER_VALUE",
              "Cluster .* does not exist",
              com.databricks.sdk.core.error.platform.ResourceDoesNotExist.class),
          new ErrorOverride<>(
              "Jobs InvalidParameterValue=>ResourceDoesNotExist",
              "^/api/2\\.\\d/jobs/get",
              "GET",
              "^400$",
              "INVALID_PARAMETER_VALUE",
              "Job .* does not exist",
              com.databricks.sdk.core.error.platform.ResourceDoesNotExist.class),
          new ErrorOverride<>(
              "Job Runs InvalidParameterValue=>ResourceDoesNotExist",
              "^/api/2\\.\\d/jobs/runs/get",
              "GET",
              "^400$",
              "INVALID_PARAMETER_VALUE",
              "(Run .* does not exist|Run: .* in job: .* doesn't exist)",
              com.databricks.sdk.core.error.platform.ResourceDoesNotExist.class));
}
