
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.classes.AnalyticsCounter;
import com.hemebiotech.classes.SymptomReader;
import com.hemebiotech.classes.SymptomWriter;



public class Main {


	public static void main (String[] arg) {
		// déclaration des objets
		SymptomReader symptomReaderFromFile = new SymptomReader();
		AnalyticsCounter analyticsCounter= new AnalyticsCounter();
		SymptomWriter symptomWriterInFile = new SymptomWriter();
		
		// Récupération de la liste
		List<String> symptoms = new ArrayList<>();
		symptoms = symptomReaderFromFile.getReadSymptomsFromTheFile("symptoms.txt");
		
		// Compte les occurences
		Map<String,Integer> mapOccurences = analyticsCounter.getStringOccurrencesFromList(symptoms);

		// Sort symptoms alphabetically
		Map<String, Integer> result = new TreeMap<String, Integer>(mapOccurences);
		System.out.println(result);
		
		// écriture dans le fichier
		symptomWriterInFile.writeSymptomsInTheFile(result,"result.out");
		
		
	
		}
	
	}

