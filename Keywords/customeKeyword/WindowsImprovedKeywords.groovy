package customeKeyword;

import java.util.regex.Pattern

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.WindowsTestObject
import com.kms.katalon.core.testobject.WindowsTestObject.LocatorStrategy
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

public class WindowsImprovedKeywords {
	private static KeywordLogger logger = KeywordLogger.getInstance(WindowsImprovedKeywords.class);

	@Keyword
	def startApplicationWithTitle(String application, String title) {
		Windows.startApplicationWithTitle(application, '')
		logger.logInfo("Application has been started")
		Windows.delay(5) // This is optional: Waiting for the main window to show up
		this.switchToWindowTitle(title);
	}

	@Keyword
	def switchToWindowTitle(String title) {
		logger.logInfo("Start switchToWindowTitle")
		WindowsTestObject windowObject = new WindowsTestObject()
		windowObject.setLocator(title)
		windowObject.setLocatorStrategy(LocatorStrategy.NAME)
		Windows.switchToDesktop()
		Windows.switchToWindow(windowObject)
		Windows.switchToApplication()
		logger.logInfo("Done switchToWindowTitle")
	}

	@Keyword
	def startApplicationWithTitlePattern(String application, String titleRegex) {
		Windows.startApplicationWithTitle(application, '')
		logger.logInfo("Application has been started")
		Windows.delay(5) // This is optional: Waiting for the main window to show up
		this.switchToWindowTitlePattern(titleRegex);
	}

	@Keyword
	def switchToWindowTitlePattern(String titleRegex) {
		logger.logInfo("Start switchToWindowTitlePattern")
		Windows.switchToDesktop()

		def allWindows = Windows.getDriver().findElementsByXPath("/*/*[name() = 'Window' or name() = 'Pane']")
		def targetWindow = findWindowWithTitle(allWindows, titleRegex)
		if (targetWindow == null) {
			return;
		}

		WindowsTestObject windowObject = new WindowsTestObject()
		windowObject.setLocator(targetWindow.getAttribute("Name"))
		windowObject.setLocatorStrategy(LocatorStrategy.NAME)
		Windows.switchToWindow(windowObject)

		Windows.switchToApplication()
		logger.logInfo("Done switchToWindowTitlePattern")
	}

	@Keyword
	def startApplicationWithTitleContains(String application, String aPartOfTitle) {
		Windows.startApplicationWithTitle(application, '')
		logger.logInfo("Application has been started")
		Windows.delay(5) // This is optional: Waiting for the main window to show up
		this.switchToWindowWithTitleContains(aPartOfTitle);
	}

	@Keyword
	def switchToWindowWithTitleContains(String aPartOfTitle) {
		logger.logInfo("Start switchToWindowTitlePattern")
		Windows.switchToDesktop()

		def targetWindow = Windows.getDriver().findElementByXPath("/*/*[(name() = 'Window' or name() = 'Pane') and contains(@Name, '${aPartOfTitle}')]")
		if (targetWindow == null) {
			return;
		}

		WindowsTestObject windowObject = new WindowsTestObject()
		windowObject.setLocator(targetWindow.getAttribute("Name"))
		windowObject.setLocatorStrategy(LocatorStrategy.NAME)
		Windows.switchToWindow(windowObject)

		Windows.switchToApplication()
		logger.logInfo("Done switchToWindowTitlePattern")
	}

	def WebElement findWindowWithTitle(List<WebElement> windows, String titlePattern) {
		for (def windowI : windows) {
			if (Pattern.matches(titlePattern, windowI.getAttribute("Name"))) {
				return windowI;
			}
		}
		return null;
	}
}
