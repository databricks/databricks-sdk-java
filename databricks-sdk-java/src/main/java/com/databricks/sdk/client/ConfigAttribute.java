package com.databricks.sdk.client;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>ConfigAttribute class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigAttribute {
  String value();

  String env() default "";

  String auth() default "";

  boolean sensitive() default false;
}
