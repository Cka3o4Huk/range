package com.narmnevis.range.generator;

import java.util.List;

import com.narmnevis.range.RangeContext;

/**
 * @author nobeh
 * @since 1.0
 * 
 */
public class NumericRangeGenerator extends AbstractGenerator {

	private List<Double> samples;
	private final long start;
	private final long end;

	public NumericRangeGenerator(long start, long end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public Object generate(RangeContext context) {
		if (samples == null) {
			samples = generateRandoms(context);
		}
		try {
			Double s = samples.remove(0);
			long value = start + new Double(s * (end - start)).longValue();
			return value;
		} catch (Exception e) {
			logger.error("Failed to generate a numeric value in range ({}, {}): {}", start, end, e);
		}
		return null;
	}

}
