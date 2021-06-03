#Student : Andrew Hatt #Student No: 300267051 #Class : SEG 3013 #Professor : Andrew Forward #TA : Zahra Kakavand

#In this lab, I followed the instructions as done by the TA in the lab period. So my instructions for running the code will be largely the same as the instructions in the README the TA was following.

#First step is to go to the command prompt, and type: $java --version #Which give the version I am running, jdk 16 #Screenshot of Java Environment on my machine: image

#To compile the Newmath program, javac -encoding UTF-8 --source-path src -d dist src/*.java #And then to run it, java -cp ./dist Main #Screenshot of Main execution: image

#To run the JUnit tests, I executed the following code: javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path #Screenshot of JUnit tests: image

#I get the exilir version by running $elixir --version #Elixir Version: image

#To get Newmath_ex, run mix compile iex -S mix #Elixir Newmath test: image

#And to get the final tests: mix test #Mix test output : image
