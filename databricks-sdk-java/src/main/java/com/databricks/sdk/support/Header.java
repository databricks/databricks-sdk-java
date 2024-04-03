package com.databricks.sdk.support;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Annotation to indicate that a field is a Header. */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Header {
  String value();
}
