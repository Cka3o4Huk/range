package com.narmnevis.range.provider;

import com.narmnevis.range.GeneratorFactory;

/**
 * @author nobeh
 * @since 1.0
 * 
 */
public class DateGeneratorFactoryProvider extends AbstractGeneratorFactoryProvider {

	@Override
	public GeneratorFactory provideFactory() {
		return new DateGeneratorFactory();
	}

}
