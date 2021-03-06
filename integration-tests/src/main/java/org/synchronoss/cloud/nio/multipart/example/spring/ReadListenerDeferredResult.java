/*
 * Copyright (C) 2015 Synchronoss Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.synchronoss.cloud.nio.multipart.example.spring;

import org.springframework.web.context.request.async.DeferredResult;

import javax.servlet.ReadListener;

/**
 * <p> {@code DeferredResult} that is also a {@code ReadListener}.
 *
 * @author Silvano Riz.
 */
public abstract class ReadListenerDeferredResult<T> extends DeferredResult<T> implements ReadListener{

}
