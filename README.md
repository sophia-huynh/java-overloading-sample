# java-overloading
template for the CSC207 Java Overloading Assignment

## Instructions

**If you get stuck on any of the steps below, please ask for help from a classmate, on Piazza, or during office hours.**

### Step 1:
- In IntelliJ, create a new project by selecting "Get from version control" (If you already have a project open, close your current project ("File" --> "Close Project")
- Make sure "Version control" is set to "Git"
- In this GitHub repo, press the green "Code" button in the top right and copy the https url to the clipboard and then into IntelliJ.
- IntelliJ will automatically create a directory for your project on your computer (to keep your files organized you can choose where to save it if you want or just use the default)
- Click Clone to setup your project.
- You will be prompted to enter your Github username and password to complete the setup. **Note - with 2-factor authentication, will this change?! (https://github.blog/2020-12-15-token-authentication-requirements-for-git-operations/)**

Your project should now be open. There are a couple steps we need to take to get things set up so IntelliJ knows where the source code and test code are located in the project.

### Step 2:

- On the left panel, open your project folder and right-click on "src". Select "Mark directory as" --> "Sources Root"
- Right-click on the "test" folder and select "Mark directory as" --> "Test sources root"
- Open the Tests class in the "test" folder. Click around it until you see a red light bulb. Click it and select "add junit4 to classpath".
- Click the double arrow to the left of line 4 to run the tests. Note: This will result in several errors until you have completed the required methods for the MyHashing class.

You are now ready to start developing your code.

### Step 3:
- Complete the code in MyHashing.java according to its documentation.
- When you have finished writing code that passes all of the tests, make sure to go to the VCS menu and select "git", then add, commit, and push your code.
