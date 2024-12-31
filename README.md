# Healenium 
is an open-source framework that brings self-healing capabilities to UI test automation. It is designed to make your web tests more robust and less prone to breaking due to minor UI changes.
### Core Functionality:
 * **Self-Healing:** The primary function of Healenium is to automatically "heal" broken tests during runtime. When a test fails because an element locator (like an ID, CSS selector, or XPath) no longer matches the UI, Healenium attempts to find a similar element and update the locator on the fly. This allows the test to continue running without manual intervention.   
* **Locator Recovery:** Healenium employs algorithms to identify alternative locators for elements. It considers various attributes, text content, and the element's position in the DOM to find the best possible match.  
* **Reduced Test Flakiness:** By automatically adapting to UI changes, Healenium significantly reduces the number of false-positive test failures caused by minor UI modifications. This leads to more stable and reliable test results.  
* **Maintenance Efficiency:** With self-healing, you spend less time fixing broken tests due to UI updates. Healenium minimizes the maintenance overhead associated with keeping your test locators up-to-date

### Use Cases: Healenium is particularly useful in scenarios where:
* The UI of the application under test is frequently updated.   
* Tests are prone to breaking due to minor UI changes.  
* Reducing test maintenance time is a priority.

In essence, Healenium acts as a layer on top of your existing test framework, providing an extra level of resilience and adaptability to your UI tests.   

### Steps to configure:
* Check the steps in [this repo](https://github.com/healenium/healenium-example-maven).
* Note: Run from the commandline to be able to enable Healenium and to generate it's report.
## Report Sample:
![image](https://github.com/user-attachments/assets/af1cc5b9-7127-4163-a2bd-1d84e414684b)
