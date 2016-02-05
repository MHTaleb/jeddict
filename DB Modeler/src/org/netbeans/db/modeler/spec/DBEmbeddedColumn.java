/**
 * Copyright [2016] Gaurav Gupta
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
package org.netbeans.db.modeler.spec;

import org.netbeans.jpa.modeler.spec.AttributeOverride;
import org.netbeans.jpa.modeler.spec.Column;
import org.netbeans.jpa.modeler.spec.Embedded;
import org.netbeans.jpa.modeler.spec.extend.Attribute;

public class DBEmbeddedColumn extends DBColumn {
   
    private final Embedded embedded;
    
    private AttributeOverride attributeOverride;
    
    public DBEmbeddedColumn(String name, Embedded embedded, Attribute refAttribute) {
        super(name, refAttribute);
        this.embedded = embedded;
       attributeOverride = embedded.findAttributeOverride(refAttribute.getName());
       if(attributeOverride == null){
           attributeOverride = new AttributeOverride();
           attributeOverride.setName(refAttribute.getName());
           attributeOverride.setColumn(new Column());
           embedded.addAttributeOverride(attributeOverride);
       }
    }



    /**
     * @return the attributeOverride
     */
    public AttributeOverride getAttributeOverride() {
        return attributeOverride;
    }

    /**
     * @return the embedded
     */
    public Embedded getEmbedded() {
        return embedded;
    }
    
}
