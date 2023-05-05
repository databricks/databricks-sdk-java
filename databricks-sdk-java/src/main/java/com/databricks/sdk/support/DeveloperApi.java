package com.databricks.sdk.support;

import java.lang.annotation.*;

/**
 * Lower-level and unstable API intended for Databricks developers.
 *
 * <p>Elements annotated with `@DeveloperApi` might change or be removed in minor versions of this
 * SDK.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
  ElementType.TYPE,
  ElementType.FIELD,
  ElementType.METHOD,
  ElementType.PARAMETER,
  ElementType.CONSTRUCTOR,
  ElementType.LOCAL_VARIABLE,
  ElementType.PACKAGE
})
public @interface DeveloperApi {}
