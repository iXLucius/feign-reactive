/**
 * Copyright 2018 The Feign Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package feign.reactor.client.statushandler;

import feign.reactor.client.ReactiveHttpResponse;
import reactor.core.publisher.Mono;

/**
 * @author Sergii Karpenko
 */
public interface ReactiveStatusHandler {

  boolean shouldHandle(int status);

  Mono<? extends Throwable> decode(String methodKey, ReactiveHttpResponse<?> response);
}
