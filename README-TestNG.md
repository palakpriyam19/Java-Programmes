TestNG
│
├─ 1️⃣ Core Concepts
│   ├─ Testing framework for Java
│   ├─ Supports UI (Selenium), API (RestAssured)
│   ├─ Annotations, Parameterization, Parallelism
│
├─ 2️⃣ Annotations (Lifecycle)
│   ├─ @BeforeSuite / @AfterSuite → once per suite
│   ├─ @BeforeTest / @AfterTest → per <test> in XML
│   ├─ @BeforeClass / @AfterClass → per test class
│   ├─ @BeforeMethod / @AfterMethod → per @Test method
│   └─ @Test → test methods
│
├─ 3️⃣ Test Execution
│   ├─ testng.xml defines tests, classes, parameters
│   ├─ Parallelism
│   │   ├─ parallel="tests" → run <test> blocks simultaneously
│   │   ├─ parallel="classes" → run multiple classes in parallel
│   │   └─ parallel="methods" → run test methods in parallel
│   ├─ thread-count → number of concurrent threads
│   └─ DependsOnMethods / priority → control execution order
│
├─ 4️⃣ Parameterization
│   ├─ @Parameters → from testng.xml
│   └─ @DataProvider → data-driven tests
│
├─ 5️⃣ Grouping & Suites
│   ├─ @Test(groups="smoke")
│   ├─ Include / Exclude in XML
│   └─ Run selective tests
│
├─ 6️⃣ Thread Safety (Parallel Runs)
│   ├─ ThreadLocal<WebDriver> → UI
│   ├─ ThreadLocal<APIClient> → API
│   ├─ Each thread has isolated objects
│   └─ Avoids flakiness in concurrent execution
│
├─ 7️⃣ Listeners & Reporting
│   ├─ ITestListener → onTestStart/onTestSuccess/onTestFailure
│   ├─ IInvokedMethodListener → before/after method
│   ├─ Default HTML + XML reports → test-output folder
│   └─ ExtentReports / Allure for advanced reporting
│
├─ 8️⃣ CI/CD Integration
│   ├─ Maven Surefire / Failsafe plugin
│   ├─ run testng.xml in pipeline: mvn clean test
│   ├─ Upload reports to CI artifacts (GCS/Jenkins)
│   └─ Parallel execution supported in pipeline
│
├─ 9️⃣ Advanced Features
│   ├─ RetryAnalyzer → rerun failed tests automatically
│   ├─ SoftAssert → continue tests after assertion failures
│   ├─ @Factory → dynamically generate test classes
│   └─ Annotations can be combined for complex workflows
│
└─ 🔹 Best Practices
├─ Keep BaseTest for setup/teardown
├─ Thread-safe WebDriver & API clients
├─ Use DataProviders for reusability
├─ Use Listeners for logging + screenshots
└─ Integrate with CI/CD & quality gates