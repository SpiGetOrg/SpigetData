package org.spiget.data.resource;

import lombok.*;

/**
 * Contains information about a resource rating
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class Rating {

	protected int   count;
	protected float average;

}
