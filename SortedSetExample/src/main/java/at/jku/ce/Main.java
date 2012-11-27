package at.jku.ce;

import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new HashSet<DomainObject>();		objectSet.add(DomainFactory.createDomainObject("Helga", "Comment1"));
		objectSet.add(DomainFactory.createDomainObject("Walter", "Comment1"));
		objectSet.add(DomainFactory.createDomainObject("Hans", "Comment1"));
		objectSet.add(DomainFactory.createDomainObject("Paul", "Comment1"));
		objectSet.add(DomainFactory.createDomainObject("Claudia", "Comment1"));		for (DomainObject domainObject : objectSet) {		  LOGGER.debug(domainObject.id);		}
	}

}
