/**
 * Copyright (c) Codice Foundation
 * <p>
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 **/
package org.codice.ddf.admin.query.wcpm.fields;

import org.codice.ddf.admin.query.commons.fields.base.BaseListField;

public class ContextPolicies extends BaseListField<ContextPolicyBin> {

    public static final String DEFAULT_FIELD_NAME = "policies";
    public static final String DESCRIPTION = "A list of polices being applied to a collection of context paths";

    public ContextPolicies() {
        super(DEFAULT_FIELD_NAME, DESCRIPTION, new ContextPolicyBin());
    }

    @Override
    public ContextPolicies add(ContextPolicyBin value) {
        super.add(value);
        return this;
    }
}
