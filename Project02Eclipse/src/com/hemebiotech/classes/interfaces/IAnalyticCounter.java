package com.hemebiotech.analytics.interfaces;

import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.classes.SymptomReader;
/**
 * Anything that will count symptom data from a list
 * The important part is, the return value from the operation, which is a map,
 * that may contain the symptoms and values
 * 
 * The implementation does not need to order the map
 * 
 * @author masibak
 *
 */
public interface IAnalyticCounter {
	public Map<String,Integer> getStringOccurrencesFromList(List<String> list);
}
