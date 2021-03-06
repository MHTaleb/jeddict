/**
 * Copyright [2017] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jsonb.converter.compiler;

import org.netbeans.orm.converter.compiler.*;
import java.util.Collection;
import java.util.Collections;
import static org.netbeans.jcode.jsonb.JSONBConstants.JSONB_NILLABLE;
import static org.netbeans.jcode.jsonb.JSONBConstants.JSONB_NILLABLE_FQN;
import static org.netbeans.jpa.modeler.settings.code.CodePanel.isGenerateDefaultValue;
import static org.netbeans.orm.converter.util.ORMConverterUtil.CLOSE_PARANTHESES;
import static org.netbeans.orm.converter.util.ORMConverterUtil.OPEN_PARANTHESES;

public class NillableSnippet implements Snippet {

    private final Boolean nillable;

    public NillableSnippet(Boolean nillable) {
        this.nillable = nillable;
    }

    @Override
    public String getSnippet() throws InvalidDataException {
        StringBuilder builder = new StringBuilder();
        builder.append("@").append(JSONB_NILLABLE);
        if (isGenerateDefaultValue() || !nillable) {
            builder.append(OPEN_PARANTHESES).append(nillable).append(CLOSE_PARANTHESES);
        }
        return builder.toString();
    }

    @Override
    public Collection<String> getImportSnippets() throws InvalidDataException {
        return Collections.singletonList(JSONB_NILLABLE_FQN);
    }
}
