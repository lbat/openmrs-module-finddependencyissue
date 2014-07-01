package org.openmrs.module.finddependencyissue.scheduler.domain;

import org.openmrs.Location;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.value.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.solution.Solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class represents the planning solution
 * It contains all required objects for the solving process
 * Also used to act as a range provider for the planning variables
 */
@PlanningSolution
public class
		Timetable implements Solution<HardSoftScore> {


	private HardSoftScore score;

	@Override
	public HardSoftScore getScore() {
		return score;
	}

	@Override
	public void setScore(HardSoftScore hardSoftScore) {
		score = hardSoftScore;
	}

	/**
	 * @return a collection with all problem facts
	 * @should return all problem facts without the planning entities
	 */
	@Override
	public Collection<?> getProblemFacts() {
		//planning entities are added automatically -> don't add them here
		List<Object> facts = new ArrayList<Object>();
		return facts;
	}
}
