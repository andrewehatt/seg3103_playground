defmodule Grades do
  def percentage_grade(marks) do
    marks * 100
  end
  def letter_grade(marks) do
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
  def numeric_grade(_marks) do
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
