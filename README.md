# basicjpa
A basic JPA template with basic Spring In memory Security

# Create a runnable JAR 

## build.gradle settings
* In IntelliJ make sure you have the toolbuttons visible from View/Tool Buttons. 
* Open build.gradle file and add this piece of code:
         
>jar {    
>	// in settings.gradle rootProject.name = 'basicjpa'    
>	baseName = 'basicjpa'    
>	group    = 'fi.tapir'    
>	version  = '0.0.1-SNAPSHOT'     
>	manifest { attributes 'Main-Class': 'fi.tapir.basicjpa.BasicjpaApplication' }     
>}    

## Building
* Now go to Gradle projects tab. Choose Tasks/build. 
* Run Clean and then run Build. 
* You should see a new Folder called 'build' appearing to the Project tab. 
* The runnable jar is located in libs folder. 

## Running
* You can run it from the Terminal and check that everything is working: 
java -jar [path_to_project]\basicjpa\build\libs\basicjpa-0.0.1-SNAPSHOT.jar
