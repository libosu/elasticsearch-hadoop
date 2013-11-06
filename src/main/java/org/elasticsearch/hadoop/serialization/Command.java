/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.elasticsearch.hadoop.serialization;

import org.elasticsearch.hadoop.util.BytesRef;


/**
 * Bulk command to execute.
 */
public interface Command {

    /**
     * Serialized the given object as a {@link BytesRef}.
     * Note that the {@link BytesRef} is not guaranteed to be unique - in fact,
     * expect the same instance to be reused by multiple calls.
     * In other words, make a copy if you need to hang on to this object.
     *
     * @param object
     * @return
     */
    BytesRef write(Object object);
}
