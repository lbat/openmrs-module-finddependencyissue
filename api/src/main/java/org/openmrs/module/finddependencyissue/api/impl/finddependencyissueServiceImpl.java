/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.finddependencyissue.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.finddependencyissue.api.finddependencyissueService;
import org.openmrs.module.finddependencyissue.api.db.finddependencyissueDAO;

/**
 * It is a default implementation of {@link finddependencyissueService}.
 */
public class finddependencyissueServiceImpl extends BaseOpenmrsService implements finddependencyissueService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private finddependencyissueDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(finddependencyissueDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public finddependencyissueDAO getDao() {
	    return dao;
    }
}