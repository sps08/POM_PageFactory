package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.facebook.pages.LandingPage;
import com.facebook.pages.LoginPage;
import com.facebook.pages.PersonalProfile;
import com.util.ErrorUtil;
import com.util.TestUtil;

public class UploadPic extends TestBase{
	
	@Test
	public void uploadPic(){
		APPLICATION_LOGS.debug("Executing the upload pic test");
		
		if(!TestUtil.isExecutable("UploadPic", xls))
			throw new SkipException("Skipping the test");
			
		
		LandingPage landingPage =null;
		//go to landing page - if i am logged in else login
		if(!isLoggedIn){
			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			landingPage = lp.doLogin(CONFIG.getProperty("defaultUsername"),CONFIG.getProperty("defaultPassword"));
		}else{
		 landingPage = getTopMenu().gotoLandingPage();
		}
		PersonalProfile personalProfile = landingPage.gotoProfile();
		// change PIC
		APPLICATION_LOGS.debug("Quitting driver");
		try{
		Assert.assertTrue(false, "xxxx");
		}catch(Throwable e){
			ErrorUtil.addVerificationFailure(e);
			TestUtil.takeScreenShot("upload");
			return;
		}

        quitDriver();
	}

}
