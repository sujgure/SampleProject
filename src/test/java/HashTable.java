package test.java;

import java.util.HashMap;

public class HashTable 
{

	
	public static String readhashtable(String question)
	{
		String answer = "NOT_FOUND";
		HashMap<String,String> hm=new HashMap<String,String>();  
		  hm.put("Gibt es Unterschiede zwischen Leitlinien der medizinisch-wissenschaftlichen Fachgesellschaften und den Richtlinien, die vom G‑BA erlassen werden?","Ja, Leitlinien werden von privatrechtlichen Organisationen erlassen, Richtlinien hingegen auf sozialrechtlicher Grundlage.");  
		  hm.put("Ein Abweichen von den in Leitlinien beschriebenen Handlungsempfehlungen führt zwangsläufig zu einem Behandlungsfehler. Diese Aussage …","trifft nicht zu, weil sich die genannten Handlungsempfehlungen immer nur auf einen „Durchschnittspatienten“ in einer „Durchschnittsbehandlungssituation“ beziehen und eine individuelle Prüfung der konkreten Behandlungssituation nicht obsolet machen.");  
		  hm.put("Sind Leitlinien rechtlich verbindlich?","Nein, sie stellen rechtlich unverbindliche Empfehlungen privatrechtlicher Organisationen dar.");
		  hm.put("Wie wird im Zivilprozess das Vorliegen eines Behandlungsfehlers typischerweise festgestellt?", "Durch Einholung eines Sachverständigengutachtens zu der Frage, ob im konkreten Fall ein Abweichen vom medizinischen Standard vorgelegen hat und ob dieses (ggf.) pflichtwidrig war.");
		hm.put("Ein grober Behandlungsfehler liegt vor, wenn …","ein eindeutiger Verstoß gegen bewährte ärztliche Behandlungsregeln oder gegen gesicherte medizinische Erkenntnisse vorliegt und ein solches Verhalten aus objektiver Sicht nicht mehr verständlich erscheint, weil er einem (Zahn-)Arzt des entsprechenden Fachs schlechterdings nicht unterlaufen darf.");
		hm.put("Wie wird der Behandlungsfehler definiert?","Ein Behandlungsfehler liegt vor, wenn die durchgeführte Behandlung nicht den gewünschten Erfolg bietet.");
		hm.put("Was sind Richtlinien?","In Richtlinien wird für die Zivilgerichte verbindlich die Grenze zwischen dem einfachen und dem groben Behandlungsfehler definiert.");
		hm.put("Der im Arzthaftungsprozess gerichtlich bestellte Sachverständige wird sich zur Klärung der Frage, ob ein Behandlungsfehler vorliegt, mit Leitlinien nicht beschäftigen. Diese Aussage …","stimmt nicht, weil Leitlinien zwar nicht verbindlich sind, aber dennoch im Tatsächlichen wichtige Handlungs- und Entscheidungskorridore vorgeben.");
		hm.put("Handlungsanweisungen in den Leitlinien ärztlicher Fachgesellschaften oder Verbände dürfen nach Ansicht des BGH …","nicht unbesehen mit dem medizinischen Standard gleichgesetzt werden, weil dieser im Einzelfall von einem medizinischen Sachverständigen zu definieren ist.");
		hm.put("Das Nichtvorhandensein von Leitlinien für einzelne medizinische Bereiche führt im Arzthaftungsprozess dazu, …","dass der Unterschied zwischen einem einfachen und einem groben Behandlungsfehler nicht festgestellt werden kann.");
		
		if(hm.containsKey(question))
			answer = hm.get(question);
		
		return answer;
	}
	

	public static String readevolquestion(String questions)
	{
		String answer = "Not Found";
		HashMap<String,String> rm = new HashMap<String,String>();
		rm.put("Wann und wie haben Sie die Fortbildung gelesen?","Unmittelbar vor Beantwortung der Fragen");
		rm.put("Wo haben Sie die Fortbildung gelesen?","In der gedruckten Zeitschrift");
		rm.put("Ist nach Ihrer Ansicht das Thema richtig abgehandelt worden?","Teils, teils");
		rm.put("Diese Fortbildung ermöglicht das Erreichen aller Lernziele. Die Lernziele dieser Fortbildung finden Sie in den Kursdetails.","Stimme zu");
		rm.put("Diese Fortbildung ist hilfreich bei der Verbesserung Ihrer/Ihres … (Mehrfachantworten sind möglich)","Behandlungsergebnisses");
		rm.put("Planen Sie nach diesem Modul Veränderungen bei Ihrem ärztlichen Vorgehen? (Mehrfachantworten sind möglich)","Keine Änderung - die Fortbildung hat meine aktuelle Praxis bestätigt.");
		
		if(rm.containsKey(questions))
			answer = rm.get(questions);
		return answer;
		
	}
	
	
	
	
}
