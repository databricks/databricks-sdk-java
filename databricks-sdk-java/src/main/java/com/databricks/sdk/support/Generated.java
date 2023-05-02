package com.databricks.sdk.support;

import java.lang.annotation.*;

/**
 * Annotation to indicate that a class or method is generated from OpenAPI specification.
 *
 * <p>This annotation is used to exclude the class or method from code coverage.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface Generated {}
