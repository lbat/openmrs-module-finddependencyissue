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
package org.openmrs.module.finddependencyissue;


//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.openmrs.module.ModuleActivator;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.optaplanner.core.config.solver.XmlSolverFactory;

import java.net.URL;

/**
 * This class contains the logic that is run every time this module is either started or stopped.
 */
public class finddependencyissueActivator implements org.openmrs.module.ModuleActivator {
	
//	protected Log log = LogFactory.getLog(getClass());
		
	/**
	 * @see ModuleActivator#willRefreshContext()
	 */
	public void willRefreshContext() {
	}
	
	/**
	 * @see ModuleActivator#contextRefreshed()
	 */
	public void contextRefreshed() {
	}
	
	/**
	 * @see ModuleActivator#willStart()
	 */
	public void willStart() {
	}
	
	/**
	 * @see ModuleActivator#started()
	 */
	public void started() {

		SolverFactory solverFactory = new XmlSolverFactory("/scheduler/solverConfig.xml");
		Solver solver = solverFactory.buildSolver();

	}
	
	/**
	 * @see ModuleActivator#willStop()
	 */
	public void willStop() {
	}
	
	/**
	 * @see ModuleActivator#stopped()
	 */
	public void stopped() {
	}
		
}
