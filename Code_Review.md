CODE REVIEW

Problem 1 - The setting up of driver path is done using a method "setDriverPath()" and calling it in the Test code. This results in the tedious work of calling the method and initialization step everytime one wants to reuse the code for a different test.

Fix 1 - Doing the initialization of the ChromeDriver inside the "setDriverPath()" method and providing the annotation "@BeforeMethod" to the method will ensure that whole initialization will be done before the Test is executed and without calling any extra code in the Test method.

