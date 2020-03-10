
package org.pagefreezer.tests;

import org.pagefreezer.BaseClass;
import org.testng.annotations.Test;

public class TestPortfolioWebsite extends BaseClass {

	@Test(priority = 0, description = "Verify that portfolio website gets loaded ")
	public void test_PortfolioURL() throws InterruptedException {
		String testURL = objData.getPortfolioSiteURL();
		Boolean result = objPortfolio.get(testURL);
		if (result == true) {
			passTest("Portfolio website URL retrieved successfully");
		} else {
			failTest("Unable to fetch portfolio website URL");
		}

		String title = objPortfolio.checkTitle();
		if (title.contentEquals("Ambika Bhat")) {
			passTest("Portfolio website title matched");
		} else {
			failTest("Portfolio website title not matched. Probably we could not retrieve website URL");
		}

		result = objPortfolio.clickHomeButton();
		if (result == true) {
			passTest("Portfolio website home button clicked");
		} else {
			failTest("Unable to click on the home button");
		}

		result = objPortfolio.verifyHomePage();
		if (result == true) {
			passTest("Home Page loaded successfully, verified!");
		} else {
			failTest("Unable to verify that we are on the home page");
		}

		result = objPortfolio.clickLinkedInButton();
		if (result == true) {
			passTest("Portfolio website Linkedin button clicked");
		} else {
			failTest("Unable to click on the Linkedin button");
		}

		result = objPortfolio.verifyLinkedInPage();
		if (result == true) {
			passTest("LinkedIn Page loaded successfully, verified!");
		} else {
			failTest("Unable to verify that we are on the LinkedIn page");
		}

		result = objPortfolio.clickBack();
		if (result == true) {
			passTest("Go back to home page, successfull");
		} else {
			failTest("Unable to go back to home page");
		}

		result = objPortfolio.clickResumeButton();
		if (result == true) {
			passTest("Portfolio website Resume button clicked");
		} else {
			failTest("Unable to click on the Resume button");
		}

		String text = "AMBIKA BHAT";
		result = objPortfolio.verifyResumePDF(text);
		if (result == true) {
			passTest("Resume PDF loaded successfully, verified!");
		} else {
			failTest("Unable to verify that resume PDF got loaded");
		}

		result = objPortfolio.clickBack();
		if (result == true) {
			passTest("Go back to home page, successfull");
		} else {
			failTest("Unable to go back to home page");
		}

		result = objPortfolio.clickGitHubButton();
		if (result == true) {
			passTest("Portfolio website GitHub button clicked");
		} else {
			failTest("Unable to click on the GitHub button");
		}

		text = "portfolio";
		result = objPortfolio.verifyGitHubButton(text);
		if (result == true) {
			passTest("Portfolio website GitHub button verified");
		} else {
			failTest("Unable to click on the GitHub button verified");
		}

		result = objPortfolio.clickBack();
		if (result == true) {
			passTest("Go back to home page, successfull");
		} else {
			failTest("Unable to go back to home page");
		}
	}
}
