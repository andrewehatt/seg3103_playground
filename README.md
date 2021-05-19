# seg3103_playground
#Student : Andrew Hatt
#Student No: 300267051
#Class : SEG 3013
#Professor : Andrew Forward
#TA : Zahra Kakavand

#In this lab, I followed the instructions as done by the TA in the lab period. So my instructions for running the code will be largely the same as the instructions in the 
README the TA was following.

#First step is to go to the command prompt, and type:
  $java --version
 #Which give the version I am running, jdk 16
#Screenshot of Java Environment on my machine:
![image](https://user-images.githubusercontent.com/43865276/118867312-f048f480-b8b0-11eb-8916-6162ab329df9.png)


 #To compile the Newmath program,
   javac -encoding UTF-8 --source-path src -d dist src/*.java
 #And then to run it,
    java -cp ./dist Main
#Screenshot of Main execution:
![image](https://user-images.githubusercontent.com/43865276/118869726-c04f2080-b8b3-11eb-89d5-22c843c22f0a.png)


#To run the JUnit tests, I executed the following code:
  javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java
  java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
#Screenshot of JUnit tests:
![image](https://user-images.githubusercontent.com/43865276/118869902-f8566380-b8b3-11eb-97db-cb73fa95cda4.png)

#I get the exilir version by running
$elixir --version
#Elixir Version:
![image](https://user-images.githubusercontent.com/43865276/118888097-327e3000-b8c9-11eb-83dd-a1f7a170483a.png)


#To get Newmath_ex, run
mix compile
iex -S mix
#Elixir Newmath test: 
![image](https://user-images.githubusercontent.com/43865276/118888486-b9cba380-b8c9-11eb-8867-49b4929981df.png)

#And to get the final tests:
mix test
#Mix test output :
![image](https://user-images.githubusercontent.com/43865276/118888829-2e064700-b8ca-11eb-8b0e-196e509fb690.png)







