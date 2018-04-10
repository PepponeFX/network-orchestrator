/*
 * Copyright (c) 2018 ACINO Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.orchestrator.netrap.api;

import org.onosproject.net.intent.ACIPPIntent;
import org.onosproject.net.intent.Key;
import org.onosproject.orchestrator.netrap.impl.ExpectedLink;

import java.util.List;

/**
 * Created by ponsko on 2017-03-06.
 */
public interface NetRapTransactionService {

    void addOpticalIntent(ACIPPIntent intent);

    void notifyInstalledOpticalIntent(Key intentKey);

    void addRouteIntent(ACIPPIntent intent, List<ExpectedLink> expectedLinks);

    void removeRouteIntent(Key intentKey);

    void addMoveIntent(ACIPPIntent intent);

    String getStatus();
}