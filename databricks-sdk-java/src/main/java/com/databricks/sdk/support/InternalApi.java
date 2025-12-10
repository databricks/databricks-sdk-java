package com.databricks.sdk.support;

import java.lang.annotation.*;

/**
 * Indicates that the annotated element is part of the internal implementation and should not be
 * used by SDK consumers.
 *
 * <p>Elements marked with this annotation are subject to change or removal without notice in any
 * release, including minor and patch versions.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PACKAGE})
public @interface InternalApi {}
