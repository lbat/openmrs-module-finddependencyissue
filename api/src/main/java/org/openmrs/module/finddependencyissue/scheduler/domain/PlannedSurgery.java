package org.openmrs.module.finddependencyissue.scheduler.domain;

import org.openmrs.Location;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

/**
 * This class is the Planning entity of this optimization problem
 * This means it contains attributes which will be changed by the solver during the solution finding process
 * This attributes are called Planning Variables - see the @PlanningVariable annotation on the corresponding setters
 * possible values of a planning variable is defined by the value range provider
 */
@PlanningEntity
public class PlannedSurgery {

}
