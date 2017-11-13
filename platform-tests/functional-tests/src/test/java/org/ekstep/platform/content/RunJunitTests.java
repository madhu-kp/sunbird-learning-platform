package org.ekstep.platform.content;


	import org.junit.runners.Suite;
import org.ekstep.platform.domain.ConceptAPITests;
import org.ekstep.platform.domain.ConceptAPIV3Tests;
import org.ekstep.platform.domain.DimensionAPITests;
import org.ekstep.platform.domain.DimensionAPIV3Tests;
import org.ekstep.platform.domain.DomainAPITests;
import org.ekstep.platform.domain.DomainV3APITests;
import org.ekstep.platform.domain.ItemSetAPITests;
import org.ekstep.platform.domain.MethodV3APITests;
import org.junit.runner.RunWith;
	
	@RunWith(Suite.class)
//	@Suite.SuiteClasses({CompositeSearchV3TestCases.class, ConceptAPIV3Tests.class, DimensionAPIV3Tests.class, DomainAPITests.class, ItemSetAPITests.class, ContentPublishV3TestCases.class, ContentBundleV3TestCases.class})
	@Suite.SuiteClasses({CompositeSearchV3TestCases.class, ConceptAPIV3Tests.class, ContentSuggestionTests.class, DomainV3APITests.class, ItemSetAPITests.class, ContentBundleV3TestCases.class,  ContentFlaggingTests.class, MethodV3APITests.class, ContentPublishV3TestCases.class})
	public class RunJunitTests {
	
	}
