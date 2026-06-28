// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;

/**
 * Preview phase for settings that are feature previews. For settings that are not feature previews,
 * the preview_phase field is left unset. Mirrors only the customer-facing phases surfaced in the
 * UI; internal-only phases (DISABLED, DEV, UNDER_MIGRATION, LAUNCHED, etc.) are not exposed here.
 */
@Generated
public enum PreviewPhase {
  BETA,
  GA,
  GA_SOON,
  PRIVATE_PREVIEW,
  PUBLIC_PREVIEW,
}
