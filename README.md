# Setting Up the Social Application on Your PC

Follow these steps to set up and run the project on your computer:

1. **Download and Install Git Bash**  
   First, download and install Git Bash on your PC from the official website.

2. **Create a Path for the Project**  
   Choose or create a directory where you want to download the project.

3. **Open Git Bash**  
   Launch Git Bash on your PC.

4. **Clone the Repository**  
   In the Git Bash terminal, type the following command:  
   ```bash
   git clone https://github.com/kavinduUj/oom1.git
   ```  
   Press **Enter** to clone the project.

5. **Download and Install Eclipse IDE**  
   Download Eclipse IDE from the official website: [Eclipse Downloads](https://www.eclipse.org/downloads/).  
   Install it by following the provided instructions.

6. **Open Eclipse IDE**  
   Once Eclipse is installed, open the application.

7. **Import the Project into Eclipse**  
   - Go to **File -> Open Project from File System**.
   - Select the directory where you cloned the project.
   - Click **Finish** to import the project.

8. **Navigate the Project Structure**  
   - Expand the project structure in Eclipse.  
     Navigate to `As01 -> src/main/java -> com.oom.as01`.  
   - You will see all the classes under this package.

9. **Run the Main Class**  
   - Open the `App.java` class located in `com.oom.as01`.  
   - This is the main class of the project.  
   - Attempt to run it by right-clicking on the file and selecting **Run As -> Java Application**.

10. **Troubleshooting**  
    If you encounter any issues while running the project:  
    - Click the **down arrow** next to the Run button in Eclipse.  
    - Select **Run Configurations**.  
    - A new window will open. Follow these steps:
      1. Select **Java Application**.
      2. Right-click on it and choose **New Configuration**.
      3. In the right panel:
         - Under **Project**, enter `as01`.
         - Under **Main class**, enter `com.oom.as01.App`.
      4. Click **Run**.

You should now be able to successfully set up and run the project.
