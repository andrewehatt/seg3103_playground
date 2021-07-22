# seg3103_playground lab7
#Student : Andrew Hatt
#Student No: 300267051
#Class : SEG 3013
#Professor : Andrew Forward
#TA : Henry Chen


Here is a screenshot of me running the calculator program:
![scrnshtl7-1](https://user-images.githubusercontent.com/43865276/126534356-c23fcd7f-e275-4e1b-a5b2-106f57c89957.png)

Here is a screenshot of the spotbugs program before fixing the bugs:
![scrnsht17-2](https://user-images.githubusercontent.com/43865276/126537066-e3c5212b-7699-4be6-9d01-229d9f65668d.png)

After completing the fixes, and selecting redo analysis, the program still shows my code as having all the same error. There is a bug in the program.
Here is the result of my code after making the fixes:
![scrnshtl7-3](https://user-images.githubusercontent.com/43865276/126699427-0510cb10-67e9-4d1d-840e-89384ab2bda4.png)

Here is proof that the SpotBugs program doesn't work:
![scrnshtl7-4](https://user-images.githubusercontent.com/43865276/126699581-ce482703-f721-4ef2-a018-9aab01bf90e2.png)
The first bug shown complains that I am using == to compare a string. I changed the code to use the 'equals()' method, but it doesn't recognize the changes. It points at the line where the == comparison used to be.
The two errors I couldn't figure out how to fix were making an inner class static, and how a swing method needs to occur in a Swing thread.


