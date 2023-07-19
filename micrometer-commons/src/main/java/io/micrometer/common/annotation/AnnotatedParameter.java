/*
 * Copyright 2023 VMware, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micrometer.common.annotation;

import java.lang.annotation.Annotation;

/**
 * A container class that holds information about the parameter of the annotated method
 * argument.
 *
 * Code ported from Spring Cloud Sleuth.
 *
 * @author Christian Schwerdtfeger
 */
class AnnotatedParameter {

    final int parameterIndex;

    final Annotation annotation;

    final Object argument;

    AnnotatedParameter(int parameterIndex, Annotation annotation, Object argument) {
        this.parameterIndex = parameterIndex;
        this.annotation = annotation;
        this.argument = argument;
    }

}
