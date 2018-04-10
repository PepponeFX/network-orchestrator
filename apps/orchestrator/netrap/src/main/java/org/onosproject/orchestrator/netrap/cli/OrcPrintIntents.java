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

package org.onosproject.orchestrator.netrap.cli;

import org.apache.karaf.shell.commands.Command;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.net.link.LinkProvider;
import org.onosproject.net.provider.AbstractProvider;
import org.onosproject.net.provider.ProviderId;
import org.onosproject.orchestrator.netrap.api.NetRapIntentService;
import org.onosproject.orchestrator.netrap.model.NetRapDemand;

import java.util.List;

@Command(scope = "acino", name = "orc-print-intents",
        description = "DEBUG print topology")
public class OrcPrintIntents extends AbstractShellCommand {

    static final ProviderId PID = new ProviderId("cli", "org.onosproject.cli", true);


    @Override
    protected void execute() {
        NetRapIntentService service = get(NetRapIntentService.class);
        List<NetRapDemand> demands = service.getDemands();
        if (demands != null) {
            print(demands.toString());
        } else {
            error("Error building demands!");
        }
    }


    // Token provider entity
    private static final class AnnotationProvider
            extends AbstractProvider implements LinkProvider {
        private AnnotationProvider() {
            super(PID);
        }

    }
}
