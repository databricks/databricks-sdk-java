package com.databricks.sdk.client;

import com.databricks.sdk.support.DeveloperApi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@DeveloperApi
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigAttribute {
  String value();

  String env() default "";

  String auth() default "";

  boolean sensitive() default false;
}
