## Task:
We have a text less than 500 chars , and we are facing so many typing errors , please write methods for :
1. write a method to check the number of chars , it returns “Error message ” if it exceeds 500 !!
2. write a method to replace a specified char with another one only one char should be replaced
3. write a method to replace a specified char with another all occurrences should be replaced
4. write a method to replace a phrase with new phrase one time only
5. write a method to replace a phrase with new phrase  all occurrences should be replaced
6. write a method to delete a phrase from the text

Please in main method use scanner to read the input for every method  from the CLI

Steps:
- Create new project in IntelliJ
- Create folder structure
  - `mkdir -p src/{main,test}/{java,resources}`
- Create two Java Classes: TextChecker.java to write the necessary methods, Main.java for demonstration of the methods
- In the public class TextChecker inside TextChecker.java, write main function with psvm+Tab
- Then, in the same class, write the six methods we need as instance methods
- In the Main class, create a scanner and an instance of the TextChecker class
- In the main class, write instructions for user input and read the input
- Use the input to demonstrate the TextChecker methods
- Initialize the project as a git repository
  - `git init`
- Stage all changes
  - `git add .`
- Commit everything with a commit message
  - `git commit -m "Solve exercise"`
- Go to GitHub and create a new empty repository
- Add it as the origin to your local repo
  - `git remote add origin [remote repo]`
- check out the main branch
  - `git branch -M main`
- push to the GitHub repository
  - `git push origin main`