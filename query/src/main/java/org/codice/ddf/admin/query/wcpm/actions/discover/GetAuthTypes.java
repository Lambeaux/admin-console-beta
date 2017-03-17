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
package org.codice.ddf.admin.query.wcpm.actions.discover;

import static org.codice.ddf.admin.query.wcpm.sample.SampleFields.SAMPLE_AUTH_TYPES_LIST;

import org.codice.ddf.admin.query.commons.actions.GetAction;
import org.codice.ddf.admin.query.wcpm.fields.AuthTypeList;

public class GetAuthTypes extends GetAction<AuthTypeList> {

    public static final String FIELD_NAME = "authTypes";
    public static final String DESCRIPTION = "Retrieves all currently configured authentication types.";

    public GetAuthTypes() {
        super(FIELD_NAME, DESCRIPTION, new AuthTypeList());
    }

    @Override
    public AuthTypeList process() {
        return SAMPLE_AUTH_TYPES_LIST;
    }

}
