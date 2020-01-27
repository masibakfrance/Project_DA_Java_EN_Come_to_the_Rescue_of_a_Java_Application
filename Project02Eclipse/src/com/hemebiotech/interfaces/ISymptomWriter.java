package com.hemebiotech.interfaces;


import java.util.Map;


/**
 * Anything that will write symptom data and their numbers of occurrence in a source.
 * @author masibak
 *
 */
public interface ISymptomWriter {
	public void writeSymptomsInTheFile(Map<String, Integer> map, String file);
}
