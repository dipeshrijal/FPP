package com.fppclass.prog6_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBinSearch {
	private BinSearch search;
	private String testString;

	@Before
	public void setUp() throws Exception {
		search = new BinSearch();
		testString = "abcdefghijkl";

	}

	@Test
	public void testSearch() {
		Assert.assertTrue(search.search(testString, 'j'));
		Assert.assertFalse(search.search(testString, 'o'));
	}

}
