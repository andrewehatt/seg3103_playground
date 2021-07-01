# seg3103_playground_lab05
#Student : Andrew Hatt
#Student No: 300267051
#Class : SEG 3013
#Professor : Andrew Forward
#TA : Henry Chen


After downloading all the dependencies, there were literally thousands of files to upload to Github. Github doesn’t allow you to upload more than 100 files at once, so I only uploaded the files I changed. I hope this isn’t a problem.

1.The bug with the ‘grade’ program is that there is no Calculator.ex class.
Another bug with the stubs is that there should be an underscore before the ‘mark’ field, as to indicate that it is not being used.

2. Here is the stub code for calculating percentage, numeric, and letter grade.

![Scrnsht1](https://user-images.githubusercontent.com/43865276/124177698-9118fb00-da7e-11eb-8073-6b9383cf726d.png)
defmodule Grades.Calculator do
  def percentage_grade(mark) do
    mark * 100
  end
  def letter_grade(mark) do
    cond do
      mark > 0.895 -> "A+"
      mark > 0.845 -> "A"
      mark > 0.795 -> "A-"
      mark > 0.770 -> "B+"
      mark > 0.720 -> "B"
      mark > 0.695 -> "B-"
      mark > 0.670 -> "C+"
      mark > 0.620 -> "C"
      mark > 0.595 -> "C-"
      mark > 0.570 -> "D+"
      mark > 0.520 -> "D"
      mark > 0.495 -> "D-"
      :else -> "EIN"
    end
  end
  def numeric_grade(mark) do
    cond do
      mark > 0.995 -> 10
      mark > 0.895 -> 9
      mark > 0.795 -> 8
      mark > 0.695 -> 7
      mark > 0.595 -> 6
      mark > 0.495 -> 5
      :else -> 0
    end
  end
end



3. The actual code from assignment 2 for calculating the three functions is in github for you to see.

Twitter
There is a bug in the Twitter code, the createTweet function hasn’t been implemented.
I have implemented the four test cases, they are in Github. 
I couldn’t test the test cases because of the bugs.


