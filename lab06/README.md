# seg3103_playground_lab06
#Student : Andrew Hatt
#Student No: 300267051
#Class : SEG 3013
#Professor : Andrew Forward
#TA : Zahra Kakavand

I couln't upload the whole Project to Github because there were more than 100 folders. To run my Selenium Test, just add the Lab6Test.java folder to the original BookstoreApp's test/selenium folder.

Here is a screenshot showing that I downloaded Maven:
![scrnsht2](https://user-images.githubusercontent.com/43865276/125173338-cdd6a780-e18c-11eb-997b-c4f62320b1bb.png)

Here is a screenshot showing my build was successful:
![Scrnsht3](https://user-images.githubusercontent.com/43865276/125206485-9253e000-e255-11eb-9adb-444f337fd2f9.png)

Here is the result of calling mvn package -DskipTests:
![scrnsht5](https://user-images.githubusercontent.com/43865276/125340000-ec20dc80-e31f-11eb-9c7c-1eed131df6a1.png)\

THe command java -jar ./target/BookstoreApp-0.1.0.jar did not work on my computer, instead I used java -jar bookstore5.jar. Here is the result:
![image](https://user-images.githubusercontent.com/43865276/125340379-65b8ca80-e320-11eb-9f6f-df4b2e41c060.png)

Here is the result of the successful run of the example test:
![image](https://user-images.githubusercontent.com/43865276/125342946-80407300-e323-11eb-952a-50cbb220ebf7.png)

Here is the result of Lab6Test, a test I created makeing a new book and searching for it, in action:
![scrnsht8](https://user-images.githubusercontent.com/43865276/125357786-17aec180-e336-11eb-8850-3d866a2e821a.png)

You can find Lab6Test.java under src/test/java/selenium in Github Lab 6

I wasn't sure how to get my new file Lab6Test to run with mvn test, So I copied the Test in Lab6Test.java into ExampleSeleniumTest.java. Here is the result of running mvn tests after this:
![scrnsht9](https://user-images.githubusercontent.com/43865276/125487876-07f3cc2e-b8d5-4e50-abad-b2008f58d596.png)

Finally, here is a screenshot of a Selenium Web Driver test in action
![scrnsht10](https://user-images.githubusercontent.com/43865276/125490936-0e5ed2a0-ceb6-4907-86fd-cc26bf0d4b33.png)










